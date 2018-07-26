import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop
{
    public static void main(String[] args)
    {
        //Don't change these lines.
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

        //Your code goes below here.
        out.println("Checking sales goals.");
        out.println("The sales goal for veggie sandwiches is " + goalForVeggies +".");
        int soldVeggies;
        out.println("How many Veggie sandwiches were sold today? ");
        soldVeggies = keyboard.nextInt();
        if (soldVeggies >= goalForVeggies) {
            out.println("Made goal for veggies.");
        } else {
            out.println("Fell short for veggies."); }

        out.println("The sales goal for burgers is " + goalForBurgers + ".");
        int soldBurgers;
        out.println("How many burgers were sold today? ");
        soldBurgers = keyboard.nextInt();
        if (soldBurgers >= goalForBurgers) {
            out.println("Made goal for burgers.");
        } else {
            out.println("Fell short for burgers."); }

        out.println("The sales goal for subs is " + goalForSubs + ".");
        int soldSubs;
        out.println("How many subs were sold today? ");
        soldSubs = keyboard.nextInt();
        if (soldSubs >= goalForSubs) {
            out.println("Made goal for Subs.");
        } else {
            out.println("Fell short for Subs."); }

        out.println("The sales goal for soups is " + goalForSoup +".");
        int soldSoup;
        out.println("How many soups were sold today?");
        soldSoup = keyboard.nextInt();
        if (soldSoup >= goalForSoup) {
            out.println("Made goal for Soup.");
        } else {
            out.println("Fell short for soup."); }
         if (soldVeggies >= goalForVeggies && soldBurgers >= goalForBurgers && soldSubs >= goalForSubs && soldSoup >= goalForSoup) {
            out.println("Made goal for everything! "); }
            }


        }

