package bankcard.creditcard;

public class CreditCardBonusPoints extends CreditCard {

    private double bonusPoints;
    private final double bonusPointsPercentage;

    public CreditCardBonusPoints(double creditLimit, double bonusPointsPercentage1) {
        super(creditLimit);
        this.bonusPointsPercentage = bonusPointsPercentage1;
        this.bonusPoints = 0;
    }

    @Override
    public void getCardInfo() {
        super.getCardInfo();
        System.out.printf("Бонусные баллы: %.2f\n", bonusPoints);
    }

    @Override
    public boolean pay(double amount) {
        if (super.pay(amount)) {
            double purchaseBonusPoints = amount * bonusPointsPercentage;
            bonusPoints += purchaseBonusPoints;
            return true;
        }
        return false;
    }

    public boolean payWithBonusPoints(double amount) {
        boolean result = false;
        if (amount <= creditLimit - creditBalance + balance + bonusPoints) {
            bonusPoints -= amount;
            if (bonusPoints < 0) {
                balance += bonusPoints;
                bonusPoints = 0;
                if (balance < 0) {
                    creditBalance += balance;
                    balance = 0;
                }
            }
            result = true;
        } else {
            System.out.printf("Сумма %.2f превышает баланс счета, операция невозможна!\n", amount);
        }
        return result;
    }
}
