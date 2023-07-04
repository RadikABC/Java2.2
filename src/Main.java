public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int payment = 5000;
        int minimumPayment = 1000;
        int bonus = 100;
        if (payment >= minimumPayment) { // Поставил знак больше или равно, т.к. обычно бонусы могут начислить за платеж на сумму от 1000 р., а не больше 1000 р.
            bonus = payment / bonus;
            balance = balance + payment + bonus;
            System.out.println("Поступил платеж на сумму " + payment + " рубль(-ей). " + "Вам начислено " + bonus + " бонусов. " + "Баланс " + balance + " рубль(-ей).");

        } else {
            balance = balance + payment;
            System.out.println("Поступил платеж на сумму " + payment + " рубль(-ей). " + "Баланс " + balance + " рубль(-ей).");
        }

    }
}