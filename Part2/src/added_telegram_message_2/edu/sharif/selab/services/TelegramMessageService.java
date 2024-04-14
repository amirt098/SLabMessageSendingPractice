package added_telegram_message_2.edu.sharif.selab.services;

import added_telegram_message_2.edu.sharif.selab.models.Message;
import added_telegram_message_2.edu.sharif.selab.models.TelegramMessage;

import java.util.regex.Pattern;

public class TelegramMessageService implements MessageService{

    @Override
    public void sendMessage(Message message) {
        TelegramMessage telegramMessage = (TelegramMessage) message;
        if(validateTelegramID(telegramMessage.getSourceTelegramID()) && validateTelegramID(telegramMessage.getTargetTelegramID())){
            System.out.println("Sending a SMS from " + telegramMessage.getSourceTelegramID() + " to " + telegramMessage.getTargetTelegramID() + " with content : " + telegramMessage.getContent());
        }else{
            throw new IllegalArgumentException("Tlg ID is Not Correct!");
        }
    }

    public boolean validateTelegramID(String ID) {
        String idRegex = "^@[a-zA-Z0-9_.+-]*";

        Pattern pattern = Pattern.compile(idRegex);

        return pattern.matcher(ID).matches();
    }
}
