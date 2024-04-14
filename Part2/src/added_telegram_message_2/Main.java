package added_telegram_message_2;

import added_telegram_message_2.edu.sharif.selab.models.EmailMessage;
import added_telegram_message_2.edu.sharif.selab.models.Message;
import added_telegram_message_2.edu.sharif.selab.models.SmsMessage;
import added_telegram_message_2.edu.sharif.selab.models.TelegramMessage;
import added_telegram_message_2.edu.sharif.selab.services.EmailMessageService;
import added_telegram_message_2.edu.sharif.selab.services.MessageService;
import added_telegram_message_2.edu.sharif.selab.services.SmsMessageService;
import added_telegram_message_2.edu.sharif.selab.services.TelegramMessageService;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MessageService messageService;

    public static void main(String[] args) {
        System.out.println("Hello and Welcome to SE Lab Messenger.");

        int userAnswer;
        do {
            userAnswer = getUserChoice();

            if (userAnswer == 0) {
                break;
            }

            Message message = createMessage(userAnswer);
            sendMessage(message);

        } while (true);
    }

    private static int getUserChoice() {
        System.out.println("In order to send Sms message enter 1");
        System.out.println("In order to send Email message enter 2");
        System.out.println("In order to send Telegram message enter 3");
        System.out.println("In order to Exit, Enter 0");

        return scanner.nextInt();
    }

    private static Message createMessage(int userAnswer) {
        String source, target, content;

        switch (userAnswer) {
            case 1:
                SmsMessage smsMessage = new SmsMessage();
                System.out.print("Enter source phone: ");
                source = scanner.next();
                smsMessage.setSourcePhoneNumber(source);
                System.out.print("Enter target phone: ");
                target = scanner.next();
                smsMessage.setTargetPhoneNumber(target);
                System.out.println("Write Your Message: ");
                content = scanner.next(".*$");
                smsMessage.setContent(content);
                messageService = new SmsMessageService();
                return smsMessage;
            case 2:
                EmailMessage emailMessage = new EmailMessage();
                System.out.print("Enter source email: ");
                source = scanner.next();
                emailMessage.setSourceEmailAddress(source);
                System.out.print("Enter target email: ");
                target = scanner.next();
                emailMessage.setTargetEmailAddress(target);
                System.out.println("Write Your Message: ");
                content = scanner.next(".*$");
                emailMessage.setContent(content);
                messageService = new EmailMessageService();
                return emailMessage;
            case 3:
                TelegramMessage telegramMessage = new TelegramMessage();
                System.out.print("Enter source ID: ");
                source = scanner.next();
                telegramMessage.setSourceTelegramID(source);
                System.out.print("Enter target ID: ");
                target = scanner.next();
                telegramMessage.setTargetTelegramID(target);
                System.out.println("Write Your Message: ");
                content = scanner.next(".*$");
                telegramMessage.setContent(content);
                messageService = new TelegramMessageService();
                return telegramMessage;
            default:
                System.out.println("Invalid choice. Please try again.");
                return null;
        }
    }

    private static void sendMessage(Message message) {
        if (message != null) {
            messageService.sendMessage(message);
        }
    }
}
