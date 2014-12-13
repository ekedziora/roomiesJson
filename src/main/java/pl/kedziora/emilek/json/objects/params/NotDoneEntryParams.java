package pl.kedziora.emilek.json.objects.params;

public class NotDoneEntryParams {

    private Long confirmationId;

    private RequestParams requestParams;

    public NotDoneEntryParams(Long confirmationId, RequestParams requestParams) {
        this.confirmationId = confirmationId;
        this.requestParams = requestParams;
    }

    public Long getConfirmationId() {
        return confirmationId;
    }

    public void setConfirmationId(Long confirmationId) {
        this.confirmationId = confirmationId;
    }

    public RequestParams getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(RequestParams requestParams) {
        this.requestParams = requestParams;
    }
}
