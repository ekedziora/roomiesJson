package pl.kedziora.emilek.json.objects.params;

public class AddAnnouncementParams {

    private String title;

    private String content;

    private Boolean anonymous;

    private RequestParams requestParams;

    public AddAnnouncementParams() {
    }

    public AddAnnouncementParams(String title, String content, Boolean anonymous, RequestParams requestParams) {
        this.title = title;
        this.content = content;
        this.anonymous = anonymous;
        this.requestParams = requestParams;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(Boolean anonymous) {
        this.anonymous = anonymous;
    }

    public RequestParams getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(RequestParams requestParams) {
        this.requestParams = requestParams;
    }
}
