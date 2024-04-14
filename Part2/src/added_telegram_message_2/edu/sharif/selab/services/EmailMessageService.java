package added_telegram_message_2.edu.sharif.selab.services;

import added_telegram_message_2.edu.sharif.selab.models.EmailMessage;
import added_telegram_message_2.edu.sharif.selab.models.Message;

import java.util.regex.Pattern;

public class EmailMessageService implements MessageService{

    @Override
    public void sendMessage(Message message) {
        EmailMessage emailMessage = (EmailMessage) message;
        if(validateEmailAddress(emailMessage.getSourceEmailAddress()) && validateEmailAddress(emailMessage.getTargetEmailAddress())){
            System.out.println("Sending a SMS from " + emailMessage.getSourceEmailAddress() + " to " + emailMessage.getTargetEmailAddress() + " with content : " + emailMessage.getContent());
        }else{
            throw new IllegalArgumentException("Email Address is Not Correct!");
        }
    }

    public boolean validateEmailAddress(String email) {
        String emailRegex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";

        Pattern pattern = Pattern.compile(emailRegex);

        return pattern.matcher(email).matches();
    }

}
