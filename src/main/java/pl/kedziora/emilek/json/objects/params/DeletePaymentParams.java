package pl.kedziora.emilek.json.objects.params;

public class DeletePaymentParams {

    private Long paymentId;

    private RequestParams requestParams;

    public DeletePaymentParams() {
    }

    public DeletePaymentParams(Long paymentId, RequestParams requestParams) {
        this.paymentId = paymentId;
        this.requestParams = requestParams;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public RequestParams getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(RequestParams requestParams) {
        this.requestParams = requestParams;
    }
}
