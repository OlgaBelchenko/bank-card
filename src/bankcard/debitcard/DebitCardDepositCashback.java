package bankcard.debitcard;

public class DebitCardDepositCashback extends DebitCard {
    private final double cashbackPercentage;

    public DebitCardDepositCashback(double cashbackPercentage) {
        this.cashbackPercentage = cashbackPercentage;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        deposit(amount * cashbackPercentage);
    }
}
