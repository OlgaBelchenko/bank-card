import bankcard.creditcard.CreditCard;
import bankcard.creditcard.CreditCardBonusPoints;
import bankcard.creditcard.CreditCardDepositCashback;
import bankcard.creditcard.CreditCardPurchaseCashback;
import bankcard.debitcard.DebitCard;
import bankcard.debitcard.DebitCardBonusPoints;
import bankcard.debitcard.DebitCardDepositCashback;
import bankcard.debitcard.DebitCardPurchaseCashback;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------");
        System.out.println("Дебетовая карта");
        DebitCard debitCard = new DebitCard();
        debitCard.getCardInfo();
        System.out.println("Пополнение на 5000");
        debitCard.deposit(5000);
        debitCard.getBalanceInfo();
        System.out.println("Оплата 3000");
        debitCard.pay(3000);
        debitCard.getBalanceInfo();
        System.out.println("Оплата 222000");
        debitCard.pay(222000);
        debitCard.getBalanceInfo();

        System.out.println("--------------------");
        System.out.println("Кредитная карта");
        CreditCard creditCard = new CreditCard(10000);
        creditCard.getCardInfo();
        System.out.println("Пополнение на 5000");
        creditCard.deposit(5000);
        creditCard.getBalanceInfo();
        System.out.println("Оплата 6000");
        creditCard.pay(6000);
        creditCard.getBalanceInfo();
        System.out.println("Пополнение на 4000");
        creditCard.deposit(4000);
        creditCard.getBalanceInfo();
        System.out.println("Оплата на 222000");
        creditCard.pay(222000);
        creditCard.getBalanceInfo();

        System.out.println("--------------------");
        System.out.println("Дебетовая карта с бонусной программой: бонусные баллы в размере 1% от покупок");
        DebitCardBonusPoints debitCardBonusPoints = new DebitCardBonusPoints(0.01);
        debitCardBonusPoints.getCardInfo();
        System.out.println("Пополнение 5000");
        debitCardBonusPoints.deposit(5000);
        debitCardBonusPoints.getBalanceInfo();
        System.out.println("Покупка 3000");
        debitCardBonusPoints.pay(3000);
        debitCardBonusPoints.getBalanceInfo();
        System.out.println("Покупка с использованием бонусных баллов 2000");
        debitCardBonusPoints.payWithBonusPoints(2000);
        debitCardBonusPoints.getBalanceInfo();

        System.out.println("--------------------");
        System.out.println("Кредитная карта с бонусной программой: бонусные баллы в размере 1% от покупок");
        CreditCardBonusPoints creditCardBonusPoints = new CreditCardBonusPoints(10000, 0.01);
        creditCardBonusPoints.getCardInfo();
        System.out.println("Пополнение 2000");
        creditCardBonusPoints.deposit(2000);
        creditCardBonusPoints.getBalanceInfo();
        System.out.println("Покупка 3000");
        creditCardBonusPoints.pay(3000);
        creditCardBonusPoints.getBalanceInfo();
        System.out.println("Покупка с использованием бонусных баллов 2000");
        creditCardBonusPoints.payWithBonusPoints(2000);
        creditCardBonusPoints.getBalanceInfo();

        System.out.println("--------------------");
        System.out.println("Дебетовая карта с бонусной программой: кэшбэк 5% от покупок при условии трат больше 5 000 тыс.");
        DebitCardPurchaseCashback debitCardPurchaseCashback = new DebitCardPurchaseCashback(0.05);
        debitCardPurchaseCashback.getCardInfo();
        System.out.println("Пополнение на 15000");
        debitCardPurchaseCashback.deposit(15000);
        debitCardPurchaseCashback.getBalanceInfo();
        System.out.println("Оплата 10000");
        debitCardPurchaseCashback.pay(10000);
        debitCardPurchaseCashback.getBalanceInfo();

        System.out.println("--------------------");
        System.out.println("Кредитная карта с бонусной программой: кэшбэк 5% от покупок при условии трат больше 5 000 тыс.");
        CreditCardPurchaseCashback creditCardPurchaseCashback = new CreditCardPurchaseCashback(10000, 0.05);
        creditCardPurchaseCashback.getCardInfo();
        System.out.println("Пополнение на 10000");
        creditCardPurchaseCashback.deposit(10000);
        creditCardPurchaseCashback.getBalanceInfo();
        System.out.println("Оплата 10000");
        creditCardPurchaseCashback.pay(10000);
        creditCardPurchaseCashback.getBalanceInfo();
        System.out.println("Оплата 3000");
        creditCardPurchaseCashback.pay(3000);
        creditCardPurchaseCashback.getBalanceInfo();

        System.out.println("--------------------");
        System.out.println("Дебетовая карта с бонусной программой: накопление в размере 0.5% от суммы пополнений");
        DebitCardDepositCashback debitCardDepositCashback = new DebitCardDepositCashback(0.005);
        debitCardDepositCashback.getCardInfo();
        System.out.println("Пополнение на 5000");
        debitCardDepositCashback.deposit(5000);
        debitCardDepositCashback.getBalanceInfo();
        System.out.println("Покупка на 3000");
        debitCardDepositCashback.pay(3000);
        debitCardDepositCashback.getBalanceInfo();

        System.out.println("--------------------");
        System.out.println("Кредитная карта с бонусной программой: накопление в размере 0.5% от суммы пополнений");
        CreditCardDepositCashback creditCardDepositCashback = new CreditCardDepositCashback(10000, 0.005);
        creditCardDepositCashback.getCardInfo();
        System.out.println("Пополнение на 5000");
        creditCardDepositCashback.deposit(5000);
        creditCardDepositCashback.getBalanceInfo();
        System.out.println("Покупка на 6000");
        creditCardDepositCashback.pay(6000);
        creditCardDepositCashback.getBalanceInfo();
    }
}