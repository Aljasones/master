import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of previous orders in rubles");
        int amountPreviousOrders = scanner.nextInt();
        System.out.println("The amount of previous orders is " + amountPreviousOrders + " rubles");

        System.out.println("Enter the amount of the current order in rubles");
        int amountCurrentOrder = scanner.nextInt();
        System.out.println("The amount of current order is " + amountCurrentOrder + " rubles");

        int sum = amountCurrentOrder + amountPreviousOrders;
        System.out.println("The amount of your orders is " + sum + " rubles");

        int blueCardLimit = 15000;
        int silverCardLimit = 150000;
        int thousandRubles = 1000;

        int blueCardBonus = 50;
        int silverCardBonus = 70;
        int goldCardBonus = 100;

        int bonus;

        if (sum<blueCardLimit) {
            bonus = amountCurrentOrder / thousandRubles * blueCardBonus;
        }
        else if (sum<silverCardLimit){
            bonus = amountCurrentOrder / thousandRubles * silverCardBonus;
        }
        else{
            bonus = amountCurrentOrder / thousandRubles * goldCardBonus;
        }
        System.out.println("The bonus for the current order is " + bonus + " points");
        scanner.close();
    }

}