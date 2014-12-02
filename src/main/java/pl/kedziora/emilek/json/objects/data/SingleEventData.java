package pl.kedziora.emilek.json.objects.data;

import pl.kedziora.emilek.json.objects.enums.EventType;
import pl.kedziora.emilek.json.objects.enums.Interval;

public class SingleEventData {

    private String name;

    private EventType eventType;

    private Integer intervalNumber;

    private Interval intervalType;

    private Boolean withPunishment;

    public SingleEventData() {
    }

    public SingleEventData(String name, EventType eventType, Integer intervalNumber, Interval intervalType, Boolean withPunishment) {
        this.name = name;
        this.eventType = eventType;
        this.intervalNumber = intervalNumber;
        this.intervalType = intervalType;
        this.withPunishment = withPunishment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public Integer getIntervalNumber() {
        return intervalNumber;
    }

    public void setIntervalNumber(Integer intervalNumber) {
        this.intervalNumber = intervalNumber;
    }

    public Interval getIntervalType() {
        return intervalType;
    }

    public void setIntervalType(Interval intervalType) {
        this.intervalType = intervalType;
    }

    public Boolean getWithPunishment() {
        return withPunishment;
    }

    public void setWithPunishment(Boolean withPunishment) {
        this.withPunishment = withPunishment;
    }

}
