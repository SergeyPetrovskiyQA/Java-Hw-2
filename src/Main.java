public class Main {
    public static void main(String[] args) {
        int check = 100;
        int pay = 2000;

        if (pay > 1000) {
            int bonus = pay / 100;
            int sum = bonus + check + pay;
            System.out.println("У клиента на счету " + check + " рублей");
            System.out.println("Клиент пополнил счет на " + pay + " рублей" + " - бонус равен " + bonus + " рублей" + ", итоговая сумма на счету клиента " + sum);
        } else {
            int sum = check + pay;
            System.out.println("У клиента на счету " + check + " рублей");
            System.out.println("Клиент пополнил счет на " + pay + " рублей" + " - бонусов нет" + ", итоговая сумма на счету клинта " + sum);
        }

    }
}
