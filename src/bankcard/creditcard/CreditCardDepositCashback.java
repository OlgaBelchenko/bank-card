package bankcard.creditcard;

public class CreditCardDepositCashback extends CreditCard {

    private final double cashbackPercentage;

    public CreditCardDepositCashback(double creditLimit, double cashbackPercentage) {
        super(creditLimit);
        this.cashbackPercentage = cashbackPercentage;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        deposit(amount * cashbackPercentage);
    }
}
