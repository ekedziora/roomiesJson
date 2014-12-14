package pl.kedziora.emilek.json.objects.data;

public class SingleAnnouncementData {

    private Long announcementId;

    private String title;

    private String userName;

    private String content;

    private Long userId;

    public SingleAnnouncementData() {
    }

    public SingleAnnouncementData(Long announcementId, String title, String userName, String content, Long userId) {
        this.announcementId = announcementId;
        this.title = title;
        this.userName = userName;
        this.content = content;
        this.userId = userId;
    }

    public Long getAnnouncementId() {
        return announcementId;
    }

    public void setAnnouncementId(Long announcementId) {
        this.announcementId = announcementId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
