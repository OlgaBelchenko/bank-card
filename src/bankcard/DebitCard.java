package bankcard;

public class DebitCard extends BankCard {

    public DebitCard() {
        super();
    }

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
            System.out.printf("Сумма %.2f снята со счета\n", amount);
        } else {
            System.out.printf("Сумма %.2f превышает баланс счета, операция невозможна!\n", amount);
        }
        return result;
    }

    // Пополнение средств
    @Override
    public void deposit(double amount) {
        this.balance += amount;
        System.out.printf("Счет пополнен на %.2f рублей\n", amount);
    }
}
