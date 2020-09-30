import java.util.Scanner;

public class TafelLoop {
    public static void main(String[] args) {

        // Tafel met invoer.

        System.out.println("Wat is je lievelingsgetal?");

        var input = new Scanner(System.in);

        var input1 = input.nextInt();

        System.out.println();
        System.out.println("Ik zal " + input1 + " voor je tot in een tafel omrekenen!");

        for(var multiplicationNumber = 1; multiplicationNumber <=10; multiplicationNumber++){
            System.out.println(multiplicationNumber + " x " + input1 + " = " + input1 * multiplicationNumber);
        }

        System.out.println();
        System.out.println("―――――――――――――――――――――");
        System.out.println();

        // Tweede tafel met invoer en alternatief code.

        System.out.println("Welk getal vind je niet leuk?");

        var input2 = input.nextInt();

        System.out.println();
        System.out.println("Ow jeej! " + input2 + "! Dit zal geen leuke tafel voor je worden!");

        for(var year = 1; year <= 10; year++){
            System.out.format("%d %s %d %s %d %n", year, " x ", input2, " = ", input2*year);
        }

        System.out.println();

        // Humor.
        System.out.println("Bah!");
    }
}
