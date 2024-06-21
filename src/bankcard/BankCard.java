package bankcard;

public abstract class BankCard {

    protected double balance;

    public BankCard() {
        this.balance = 0.0;
    }

    // Информация о балансе
    public void getBalanceInfo() {
        System.out.printf("Доступные средства: %.2f рублей\n", this.balance);
    };

    // Информация о доступных средствах
    public abstract void getCardInfo();


    // Списание средств
    public abstract boolean pay(double amount);

    // Пополнение средств
    public abstract void deposit(double amount);
}
