package pl.kedziora.emilek.json.objects.data;

public class EventEntryData {

    private String startDate;

    private String endDate;

    private String status;

    public EventEntryData() {
    }

    public EventEntryData(String startDate, String endDate, String status) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
