package pl.kedziora.emilek.json.objects.enums;

public enum PunishmentType {

    MOVE("Move task to next cycle"),
    FINANCIAL("Financial");

    private String label;

    PunishmentType(String label) {
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
