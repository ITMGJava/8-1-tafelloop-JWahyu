import java.util.Scanner;

public class TafelLoop {
    public static void main(String[] args) {

        // Tafel inclusief validatie met j/n en variabel Int met invoervalidatie.

        var input = new Scanner(System.in);

        boolean check = false;
        while (!check) { // Valideer met j/n voor nieuw of stop programma.
            System.out.printf("%nWil je een nieuwe getal tot een tafel omrekenen? Druk 'j' for ja of 'n' for nee om te stoppen.%n");
            var inputExit = input.next();

            if (inputExit.equalsIgnoreCase("j")) { // Validatie j: nieuw / herhaal programma.


                boolean checkInt = false;
                while (!checkInt) { // Invoer variabel met geldigheid check.
                    System.out.printf("%nWat is je lievelingsgetal?%n");

                    if (input.hasNextInt()) {
                        int x = input.nextInt();
                        System.out.printf("%nTafel van %d:%n", x);

                        for (var y = 1; y <= 10; y++) { // Tafel van variabele input.
                            System.out.printf("%d x %d = %d%n", y, x, x * y);
                        }
                        checkInt = true;

                    } else { // Ongeldige invoer.
                        System.out.printf("Geen geldige invoer. Probeer het nogmaals.%n");
                        input.next();
                        checkInt = false;
                    }
                } // Einde while (!checkInt) Invoer variabel met geldigheid check.

            } else if (inputExit.equalsIgnoreCase("n")) { // Validatie n: einde programma.
                System.out.printf("%nDat was het dan. Dank en tot ziens! :)%n");
                check = true;
            } else { // Ongeldige invoer.
                System.out.printf("Geen geldige invoer. Probeer het nogmaals.%n");
                check = false;
            }
        } // Einde while (check).
    } // Einde public static void main(String[] args)
} // Einde public class TafelLoop