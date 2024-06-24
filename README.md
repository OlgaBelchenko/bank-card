## Тестовое задание
## Приложение "Банковские карты"

### Описание
Приложение для работы с дебетовыми и кредитными банковскими картами и бонусными программами к ним.

### Структура
- Абстрактный класс BankCard
- Класс DebitCard - наследуется от BankCard
  - Класс DebitCardBonusPoints - наследуется от DebitCard
  - Класс DebitCardDepositCashback - наследуется от DebitCard
  - Класс DebitCardPurchaseCashback - наследуется от  DebitCard
- Класс CreditCard - наследуется от BankCard
  - Класс CreditCardBonusPoints - наследуется от CreditCard
  - Класс CreditCardDepositCashback - наследуется от CreditCard
  - Класс CreditCardPurchaseCashback - наследуется от CreditCard
