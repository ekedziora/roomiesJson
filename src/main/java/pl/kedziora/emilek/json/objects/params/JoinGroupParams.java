package pl.kedziora.emilek.json.objects.params;

public class JoinGroupParams {

    private Long groupId;

    private RequestParams requestParams;

    public JoinGroupParams() {
    }

    public JoinGroupParams(Long groupId, RequestParams requestParams) {
        this.groupId = groupId;
        this.requestParams = requestParams;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public RequestParams getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(RequestParams requestParams) {
        this.requestParams = requestParams;
    }
}
