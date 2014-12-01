package pl.kedziora.emilek.json.objects.enums;

public enum ReminderType {

    EMAIL("E-mail"),
    POPUP("Pop-up");

    private String label;

    ReminderType(String label) {
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
