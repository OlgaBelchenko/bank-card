package bankcard.debitcard;

import bankcard.BankCard;

public class DebitCard extends BankCard {

    // Информация о доступных средствах
    @Override
    public void getCardInfo() {
        getBalanceInfo();
    }

    // Списание средств
    @Override
    public boolean pay(double amount) {
        boolean result = false;
        if (amount <= balance) {
            balance -= amount;
            result = true;
        } else {
            System.out.printf("Сумма %.2f превышает баланс счета, операция невозможна!\n", amount);
        }
        return result;
    }

    // Пополнение средств
    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }
}
