import java.util.Scanner;

/**
 *
 */
public final class Application {
    private Application() {
    }

    /**
     * @param args
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int firstinput = scan.nextInt();
        int secondinput = scan.nextInt();
        System.out.println("Choose Your Operation: ");
        System.out.println("1.Add ");
        System.out.println("2.Sub ");
        System.out.println("3.Multi ");
        System.out.println("4.Div ");
        int choice = scan.nextInt();
        final int max = 4;
        final int multi = 3;
        while (choice > max) {
            System.out.println("wrong choice ");
            choice = scan.nextInt();
        }
        Calculator cal = new Calculator();
        if (choice == 1) {
            cal.add(firstinput, secondinput);

        } else if (choice == 2) {
            cal.sub(firstinput, secondinput);

        } else if (choice == multi) {
            cal.mul(firstinput, secondinput);

        } else {
            cal.div(firstinput, secondinput);

        }

    }
}