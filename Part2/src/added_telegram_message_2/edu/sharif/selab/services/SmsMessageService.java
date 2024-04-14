package added_telegram_message_2.edu.sharif.selab.services;

import added_telegram_message_2.edu.sharif.selab.models.Message;
import added_telegram_message_2.edu.sharif.selab.models.SmsMessage;

public class SmsMessageService implements MessageService{
    
    @Override
    public void sendMessage(Message message) {
        SmsMessage smsMessage = (SmsMessage) message;
        if(validatePhoneNumber(smsMessage.getSourcePhoneNumber()) && validatePhoneNumber(smsMessage.getTargetPhoneNumber())){
            System.out.println("Sending a SMS from " + smsMessage.getSourcePhoneNumber() + " to " + smsMessage.getTargetPhoneNumber() + " with content : " + smsMessage.getContent());
        }else{
            throw new IllegalArgumentException("Phone Number is Not Correct!");
        }
    }

    private boolean validatePhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            return false; // Phone number length is not valid
        }

        for (char digit : phoneNumber.toCharArray()) {
            if (!Character.isDigit(digit)) {
                return false; // Phone number contains non-numeric characters
            }
        }

        return true;
    }

}
