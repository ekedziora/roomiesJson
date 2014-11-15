package pl.kedziora.emilek.json.objects.data;

public class GroupMemberData {

    private String name;

    private String pictureLink;

    public GroupMemberData() {
    }

    public GroupMemberData(String name, String pictureLink) {
        this.name = name;
        this.pictureLink = pictureLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPictureLink() {
        return pictureLink;
    }

    public void setPictureLink(String pictureLink) {
        this.pictureLink = pictureLink;
    }
}
