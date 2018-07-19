import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String item1;
        String item2;
        String item3;

        out.println("Please list three items on your grocery shopping list.");
        out.print("Item 1? ");
        item1 = keyboard.nextLine();
        out.print("Item 2? ");
        item2 = keyboard.nextLine();
        out.print("Item 3? ");
        item3 = keyboard.nextLine();

        out.println("Now, please enter the quantity of each item.");
        int qitem1;
        int qitem2;
        int qitem3;

        out.print("How many "+ item1 + "? ");
        qitem1 = keyboard.nextInt();
        out.print("How many "+ item2 + "? ");
        qitem2 = keyboard.nextInt();
        out.print("How many "+ item3 + "? ");
        qitem3 = keyboard.nextInt();

        out.println("Now, please enter the price of each item.");
        float citem1;
        float citem2;
        float citem3;

        out.print("How much does one " + item1 + " cost? ");
        citem1 = keyboard.nextFloat();
        out.print("How much does one " + item2 + " cost? ");
        citem2 = keyboard.nextFloat();
        out.print("How much does one " + item3 + " cost? ");
        citem3 = keyboard.nextFloat();

        out.println("Calculating your grocery bill.");
        out.println((citem1 * qitem1) + (citem2 * qitem2) + (citem3 * qitem3));


    }

}
