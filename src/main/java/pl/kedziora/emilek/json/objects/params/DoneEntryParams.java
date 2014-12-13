package pl.kedziora.emilek.json.objects.params;

public class DoneEntryParams {

    private Long entryId;

    private RequestParams requestParams;

    public DoneEntryParams(Long entryId, RequestParams requestParams) {
        this.entryId = entryId;
        this.requestParams = requestParams;
    }

    public Long getEntryId() {
        return entryId;
    }

    public void setEntryId(Long entryId) {
        this.entryId = entryId;
    }

    public RequestParams getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(RequestParams requestParams) {
        this.requestParams = requestParams;
    }
}
