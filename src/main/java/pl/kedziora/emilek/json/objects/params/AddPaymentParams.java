package pl.kedziora.emilek.json.objects.params;

import java.math.BigDecimal;

public class AddPaymentParams {

    private String description;

    private BigDecimal amount;

    private RequestParams params;

    public AddPaymentParams() {
    }

    public AddPaymentParams(String description, BigDecimal amount, RequestParams params) {
        this.description = description;
        this.amount = amount;
        this.params = params;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public RequestParams getParams() {
        return params;
    }

    public void setParams(RequestParams params) {
        this.params = params;
    }
}
