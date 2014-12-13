package pl.kedziora.emilek.json.objects.data;

public class ConfirmationData {

    private Long confirmationId;

    private String executor;

    private String eventEntryName;

    private String endDateTime;

    public ConfirmationData() {
    }

    public ConfirmationData(Long confirmationId, String executor, String eventEntryName, String endDateTime) {
        this.confirmationId = confirmationId;
        this.executor = executor;
        this.eventEntryName = eventEntryName;
        this.endDateTime = endDateTime;
    }

    public Long getConfirmationId() {
        return confirmationId;
    }

    public void setConfirmationId(Long confirmationId) {
        this.confirmationId = confirmationId;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public String getEventEntryName() {
        return eventEntryName;
    }

    public void setEventEntryName(String eventEntryName) {
        this.eventEntryName = eventEntryName;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }
}
