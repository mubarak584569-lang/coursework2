
import java.util.Scanner;

public class IceCream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = "024034";

        int vanilla = Integer.parseInt(number.substring(4,6));
        int chocolate = Integer.parseInt(number.substring(2,4));
        int strawberry = Integer.parseInt(number.substring(0,2));

        System.out.println("Would you like (v)anilla, (c)hocolate or (s)trawberry? ");
        String flavour = scanner.nextLine().toLowerCase();

       int pricePerScoop;
        switch (flavour) {
            case "v":
                pricePerScoop = vanilla;
                break;
            case "c":
                pricePerScoop = chocolate;
                break;
            case "s":
                pricePerScoop = strawberry;
                break;
            default:
                System.out.println("We don't have that flavour.");
                scanner.close();
                return;
        }
        System.out.println("How many scoops would you like?");
        int scoops = scanner.nextInt();

        if(scoops < 1){
            System.out.println("We don't sell just a cone. ");
        } else if (scoops > 3){
            System.out.println("That's too many scoops to fit in a cone. ");
        } else {
            int totalPence = 100 + (pricePerScoop * scoops);
            System.out.println("That will be " + String.format("%.2f", totalPence / 100.0) + " please. ");
        }
        scanner.close();
    }
}