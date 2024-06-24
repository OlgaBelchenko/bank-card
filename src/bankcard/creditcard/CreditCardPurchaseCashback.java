package bankcard.creditcard;

public class CreditCardPurchaseCashback extends CreditCard {

    private final double cashbackPercentage;

    public CreditCardPurchaseCashback(double creditLimit, double cashbackPercentage) {
        super(creditLimit);
        this.cashbackPercentage = cashbackPercentage;
    }

    @Override
    public boolean pay(double amount) {
        if (super.pay(amount)) {
            if (amount > 5000) {
                deposit(amount * cashbackPercentage);
            }
            return true;
        }
        return false;
    }
}
