package pl.kedziora.emilek.json.objects.params;

import org.joda.time.LocalDate;
import pl.kedziora.emilek.json.objects.data.MemberToAddData;
import pl.kedziora.emilek.json.objects.enums.EventType;
import pl.kedziora.emilek.json.objects.enums.Interval;
import pl.kedziora.emilek.json.objects.enums.PunishmentType;
import pl.kedziora.emilek.json.objects.enums.ReminderType;

import java.math.BigDecimal;
import java.util.List;

public class AddEventParams {

    private EventType eventType;

    private String name;

    private LocalDate startDate;

    private LocalDate endDate;

    private Integer intervalNumber;

    private Interval interval;

    private Boolean switchExecutor;

    private Boolean addReminder;

    private ReminderType reminderType;

    private Integer reminderNumber;

    private Interval reminderInterval;

    private Boolean withPunishment;

    private PunishmentType punishmentType;

    private BigDecimal punishmentAmount;

    private Boolean withConfirmation;

    private List<MemberToAddData> members;

    private RequestParams requestParams;

    public AddEventParams() {
    }

    public AddEventParams(EventType eventType, String name, LocalDate startDate, LocalDate endDate, Integer intervalNumber,
                          Interval interval, Boolean switchExecutor, Boolean addReminder, ReminderType reminderType,
                          Integer reminderNumber, Interval reminderInterval, Boolean withPunishment, PunishmentType punishmentType,
                          BigDecimal punishmentAmount, Boolean withConfirmation, List<MemberToAddData> members, RequestParams requestParams) {
        this.eventType = eventType;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.intervalNumber = intervalNumber;
        this.interval = interval;
        this.switchExecutor = switchExecutor;
        this.addReminder = addReminder;
        this.reminderType = reminderType;
        this.reminderNumber = reminderNumber;
        this.reminderInterval = reminderInterval;
        this.withPunishment = withPunishment;
        this.punishmentType = punishmentType;
        this.punishmentAmount = punishmentAmount;
        this.withConfirmation = withConfirmation;
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
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

    public Boolean getAddReminder() {
        return addReminder;
    }

    public void setAddReminder(Boolean addReminder) {
        this.addReminder = addReminder;
    }

    public ReminderType getReminderType() {
        return reminderType;
    }

    public void setReminderType(ReminderType reminderType) {
        this.reminderType = reminderType;
    }

    public Integer getReminderNumber() {
        return reminderNumber;
    }

    public void setReminderNumber(Integer reminderNumber) {
        this.reminderNumber = reminderNumber;
    }

    public Interval getReminderInterval() {
        return reminderInterval;
    }

    public void setReminderInterval(Interval reminderInterval) {
        this.reminderInterval = reminderInterval;
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

    public Boolean getWithConfirmation() {
        return withConfirmation;
    }

    public void setWithConfirmation(Boolean withConfirmation) {
        this.withConfirmation = withConfirmation;
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
