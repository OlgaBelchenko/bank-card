package bankcard.creditcard;

import bankcard.BankCard;

public class CreditCard extends BankCard {

    protected final double creditLimit;
    protected double creditBalance;

    public CreditCard(double creditLimit) {
        super();
        this.creditLimit = creditLimit;
        creditBalance = 0;
    }

    // Информация о балансе
    @Override
    public void getBalanceInfo() {
        System.out.printf("Собственные средства: %.2f рублей\n", this.balance);
        System.out.printf("Кредитные средства: %.2f рублей\n", creditLimit + creditBalance);
    }

    // Информация о доступных средствах
    @Override
    public void getCardInfo() {
        getBalanceInfo();
        System.out.printf("Кредитный лимит: %.2f рублей\n", creditLimit);
    }

    // Списание средств
    @Override
    public boolean pay(double amount) {
        boolean result = false;
        if (amount <= creditLimit - creditBalance + balance) {
            balance -= amount;
            if (balance < 0) {
                creditBalance += balance;
                balance = 0;
            }
            result = true;
        } else {
            System.out.printf("Сумма %.2f превышает баланс счета и доступный кредитный лимит, операция невозможна!\n", amount);
        }
        return result;
    }

    // Пополнение средств
    @Override
    public void deposit(double amount) {
        if (creditBalance < 0) {
            creditBalance += amount;
            if (creditBalance > 0) {
                balance += creditBalance;
                creditBalance = 0;
            }
        } else {
            balance += amount;
        }
    }
}
