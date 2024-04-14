package added_telegram_message.edu.sharif.selab.services;

import added_telegram_message.edu.sharif.selab.models.EmailMessage;
import added_telegram_message.edu.sharif.selab.models.SmsMessage;
import added_telegram_message.edu.sharif.selab.models.TelegramMessage;

import java.util.regex.Pattern;

public class TelegramMessageService implements MessageService{
    @Override
    public void sendSmsMessage(SmsMessage smsMessage) {
        //Empty Body
    }

    @Override
    public void sendEmailMessage(EmailMessage emailMessage) {
        //Empty body
    }

    @Override
    public void sendTelegramMessage(TelegramMessage telegramMessage) {
        if(validateTelegramID(telegramMessage.getSourceTelegramID()) && validateTelegramID(telegramMessage.getTargetTelegramID())){
            System.out.println("Sending a SMS from " + telegramMessage.getSourceTelegramID() + " to " + telegramMessage.getTargetTelegramID() + " with content : " + telegramMessage.getContent());
        }else{
            throw new IllegalArgumentException("Email Address is Not Correct!");
        }
    }

    public boolean validateTelegramID(String ID) {
        // Regular expression pattern for validating email addresses
        String emailRegex = "^@[a-zA-Z0-9_.+-]";

        // Compile the pattern into a regex Pattern object
        Pattern pattern = Pattern.compile(emailRegex);

        // Check if the email string matches the regex pattern
        return pattern.matcher(ID).matches();
    }
}
