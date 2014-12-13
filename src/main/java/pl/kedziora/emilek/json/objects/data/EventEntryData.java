package pl.kedziora.emilek.json.objects.data;

public class EventEntryData {

    private Long entryId;

    private String name;

    private String startDate;

    private String endDate;

    private String status;

    public EventEntryData() {
    }

    public EventEntryData(Long entryId, String name, String startDate, String endDate, String status) {
        this.entryId = entryId;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public Long getEntryId() {
        return entryId;
    }

    public void setEntryId(Long entryId) {
        this.entryId = entryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
