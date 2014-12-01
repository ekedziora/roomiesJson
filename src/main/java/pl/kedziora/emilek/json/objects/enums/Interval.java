package pl.kedziora.emilek.json.objects.enums;

public enum Interval {

    DAYS("days"),
    WEEKS("weeks"),
    MONTHS("months"),
    YEARS("years");

    private String label;

    Interval(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }
}
