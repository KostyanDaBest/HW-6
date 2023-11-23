public class Main {
        public static void main(String[] args) {
            ATM atm = new ATM(10, 10, 10);
            atm.addMoney(5, 5, 5);

            int dengiDlyaSnyatiya = 370; // сумма для снятия
            boolean success = atm.Snyatie(dengiDlyaSnyatiya);
            if (success) {
                System.out.println("Операция выполнена успешно!");
            } else {
                System.out.println("Недостаточно купюр для выполнения операции.");
            }
        }
    }

