package bankcard.debitcard;

public class DebitCardPurchaseCashback  extends DebitCard {
    private final double cashbackPercentage;

    public DebitCardPurchaseCashback(double cashbackPercentage) {
        this.cashbackPercentage = cashbackPercentage;
    }

    @Override
    public boolean pay(double amount) {
        if (super.pay(amount)) {
            deposit(amount * cashbackPercentage);
            return true;
        }
        return false;
    }
}
