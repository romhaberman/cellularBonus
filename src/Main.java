import  java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int amount = 100;
        int bonus = 0;

        if (x <= 1000) {
            amount += x;
            System.out.println("Итоговый счёт: " + amount);
        } else {
            if (x > 1000) {
                        bonus = x / 100;
                        amount = amount + x + bonus;
                                }
            System.out.println("Итоговый счёт: " + amount);
        }
        System.out.println("Вам начислено бонусов: " + bonus);
    }
}