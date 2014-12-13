package pl.kedziora.emilek.json.objects.params;

import pl.kedziora.emilek.json.objects.data.MemberToAddData;
import pl.kedziora.emilek.json.objects.enums.EventType;
import pl.kedziora.emilek.json.objects.enums.Interval;
import pl.kedziora.emilek.json.objects.enums.PunishmentType;

import java.math.BigDecimal;
import java.util.List;

public class AddEventParams {

    private EventType eventType;

    private String name;

    private String startDate;

    private String endDate;

    private Integer intervalNumber;

    private Interval interval;

    private Boolean switchExecutor;

    private Integer confirmationNumber;

    private Boolean withPunishment;

    private PunishmentType punishmentType;

    private BigDecimal punishmentAmount;

    private List<MemberToAddData> members;

    private RequestParams requestParams;

    public AddEventParams() {
    }

    public AddEventParams(EventType eventType, String name, String startDate, String endDate, Integer intervalNumber,
                          Interval interval, Boolean switchExecutor, Integer confirmationNumber, Boolean withPunishment,
                          PunishmentType punishmentType, BigDecimal punishmentAmount, List<MemberToAddData> members,
                          RequestParams requestParams) {
        this.eventType = eventType;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.intervalNumber = intervalNumber;
        this.interval = interval;
        this.switchExecutor = switchExecutor;
        this.confirmationNumber = confirmationNumber;
        this.withPunishment = withPunishment;
        this.punishmentType = punishmentType;
        this.punishmentAmount = punishmentAmount;
        this.members = members;
        this.requestParams = requestParams;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
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

    public Integer getIntervalNumber() {
        return intervalNumber;
    }

    public void setIntervalNumber(Integer intervalNumber) {
        this.intervalNumber = intervalNumber;
    }

    public Interval getInterval() {
        return interval;
    }

    public void setInterval(Interval interval) {
        this.interval = interval;
    }

    public Boolean getSwitchExecutor() {
        return switchExecutor;
    }

    public void setSwitchExecutor(Boolean switchExecutor) {
        this.switchExecutor = switchExecutor;
    }

    public Integer getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(Integer confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public Boolean getWithPunishment() {
        return withPunishment;
    }

    public void setWithPunishment(Boolean withPunishment) {
        this.withPunishment = withPunishment;
    }

    public PunishmentType getPunishmentType() {
        return punishmentType;
    }

    public void setPunishmentType(PunishmentType punishmentType) {
        this.punishmentType = punishmentType;
    }

    public BigDecimal getPunishmentAmount() {
        return punishmentAmount;
    }

    public void setPunishmentAmount(BigDecimal punishmentAmount) {
        this.punishmentAmount = punishmentAmount;
    }

    public List<MemberToAddData> getMembers() {
        return members;
    }

    public void setMembers(List<MemberToAddData> members) {
        this.members = members;
    }

    public RequestParams getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(RequestParams requestParams) {
        this.requestParams = requestParams;
    }
}
