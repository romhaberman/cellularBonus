public class Main {
    public static void main(String[] args) {
        int amount = 100; //остаток на счете
        int added = 1100; // пополнение счета
        int bonus = 0;
        int newBalance = 0;
        if (added >= 1000) {
            bonus = added / 100;
            newBalance = amount + added + bonus;
            System.out.println("Вам начислено " + bonus + " бонусных рублей.");
            System.out.println("На вашем балансе " + newBalance + " рублей.");
        } else {
            newBalance = amount + added;
            System.out.println("На вашем балансе " + newBalance + " рублей.");
        }
    }
}