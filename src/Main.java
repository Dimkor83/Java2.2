public class Main {
    public static void main(String[] args) {
        int remains = 100;
        int payment = 1099;

        int bonus;
        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        int balance = remains + payment + bonus;
        System.out.printf("Баланс" + balance);
        System.out.printf("Бонусы" + bonus);

    }
}
