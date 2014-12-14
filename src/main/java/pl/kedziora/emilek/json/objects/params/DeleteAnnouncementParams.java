package pl.kedziora.emilek.json.objects.params;

public class DeleteAnnouncementParams {

    private Long announcementId;

    private RequestParams requestParams;

    public DeleteAnnouncementParams() {
    }

    public DeleteAnnouncementParams(Long announcementId, RequestParams requestParams) {
        this.announcementId = announcementId;
        this.requestParams = requestParams;
    }

    public Long getAnnouncementId() {
        return announcementId;
    }

    public void setAnnouncementId(Long announcementId) {
        this.announcementId = announcementId;
    }

    public RequestParams getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(RequestParams requestParams) {
        this.requestParams = requestParams;
    }
}
