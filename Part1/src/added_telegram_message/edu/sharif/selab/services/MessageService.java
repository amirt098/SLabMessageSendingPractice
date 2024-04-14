package added_telegram_message.edu.sharif.selab.services;

import added_telegram_message.edu.sharif.selab.models.EmailMessage;
import added_telegram_message.edu.sharif.selab.models.SmsMessage;
import added_telegram_message.edu.sharif.selab.models.TelegramMessage;

public interface MessageService {
    public void sendSmsMessage(SmsMessage smsMessage);
    public void sendEmailMessage(EmailMessage emailMessage);
    public void sendTelegramMessage(TelegramMessage telegramMessage);

}
