package added_telegram_message_2.edu.sharif.selab.models;

public class TelegramMessage extends Message {
    private String sourceTelegramID;
    private String targetTelegramID;

    public String getSourceTelegramID() {
        return sourceTelegramID;
    }

    public void setSourceTelegramID(String sourceEmailAddress) {
        this.sourceTelegramID = sourceEmailAddress;
    }

    public String getTargetTelegramID() {
        return targetTelegramID;
    }

    public void setTargetTelegramID(String targetEmailAddress) {
        this.targetTelegramID = targetEmailAddress;
    }
}
