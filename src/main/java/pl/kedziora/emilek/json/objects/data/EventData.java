package pl.kedziora.emilek.json.objects.data;

import java.util.List;

public class EventData {

    private List<EventEntryData> currentEntries;

    private List<EventEntryData> nextEntries;

    private List<SingleEventData> events;

    private List<EventEntryData> allEntries;

    public EventData() {
    }

    public EventData(List<EventEntryData> currentEntries, List<EventEntryData> nextEntries, List<SingleEventData> events, List<EventEntryData> allEntries) {
        this.currentEntries = currentEntries;
        this.nextEntries = nextEntries;
        this.events = events;
        this.allEntries = allEntries;
    }

    public List<EventEntryData> getCurrentEntries() {
        return currentEntries;
    }

    public void setCurrentEntries(List<EventEntryData> currentEntries) {
        this.currentEntries = currentEntries;
    }

    public List<EventEntryData> getNextEntries() {
        return nextEntries;
    }

    public void setNextEntries(List<EventEntryData> nextEntries) {
        this.nextEntries = nextEntries;
    }

    public List<SingleEventData> getEvents() {
        return events;
    }

    public void setEvents(List<SingleEventData> events) {
        this.events = events;
    }

    public List<EventEntryData> getAllEntries() {
        return allEntries;
    }

    public void setAllEntries(List<EventEntryData> allEntries) {
        this.allEntries = allEntries;
    }
}
