package pl.kedziora.emilek.json.objects.data;

import java.math.BigDecimal;
import java.util.List;

public class BudgetData {

    private Long currentUserId;

    private BigDecimal balance;

    private List<PaymentData> payments;

    public BudgetData() {
    }

    public BudgetData(Long currentUserId, BigDecimal balance, List<PaymentData> payments) {
        this.currentUserId = currentUserId;
        this.balance = balance;
        this.payments = payments;
    }

    public Long getCurrentUserId() {
        return currentUserId;
    }

    public void setCurrentUserId(Long currentUserId) {
        this.currentUserId = currentUserId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public List<PaymentData> getPayments() {
        return payments;
    }

    public void setPayments(List<PaymentData> payments) {
        this.payments = payments;
    }
}
