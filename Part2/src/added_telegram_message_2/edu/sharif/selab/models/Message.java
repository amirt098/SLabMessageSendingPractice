package added_telegram_message_2.edu.sharif.selab.models;

public class Message {
    String content;

    public void sendMessage() {
        System.out.println("Sending message: " + content);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
