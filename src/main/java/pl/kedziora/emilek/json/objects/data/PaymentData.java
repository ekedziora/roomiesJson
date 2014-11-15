package pl.kedziora.emilek.json.objects.data;

import java.math.BigDecimal;

public class PaymentData {

    private Long paymentId;

    private String description;

    private String userName;

    private Long userId;

    private BigDecimal amount;

    public PaymentData() {
    }

    public PaymentData(Long paymentId, String description, String userName, Long userId, BigDecimal amount) {
        this.paymentId = paymentId;
        this.description = description;
        this.userName = userName;
        this.userId = userId;
        this.amount = amount;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
