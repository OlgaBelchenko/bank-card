package bankcard.debitcard;

public class DebitCardBonusPoints extends DebitCard {

    private double bonusPoints;
    private final double bonusPointsPercentage;

    public DebitCardBonusPoints(double bonusPointsPercentage) {
        this.bonusPointsPercentage = bonusPointsPercentage;
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
        if (amount <= balance + bonusPoints) {
            bonusPoints -= amount;
            if (bonusPoints < 0) {
                balance += bonusPoints;
                bonusPoints = 0;
            }
            result = true;
        } else {
            System.out.printf("Сумма %.2f превышает баланс счета, операция невозможна!\n", amount);
        }
        return result;
    }
}
