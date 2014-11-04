package pl.kedziora.emilek.json.objects;

public class MyAccountData {

    private String name;

    private String mail;

    private String gender;

    private String pictureLink;

    public MyAccountData() {
    }

    public MyAccountData(String name, String mail, String gender, String pictureLink) {
        this.name = name;
        this.mail = mail;
        this.gender = gender;
        this.pictureLink = pictureLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPictureLink() {
        return pictureLink;
    }

    public void setPictureLink(String pictureLink) {
        this.pictureLink = pictureLink;
    }
}
