import java.util.Scanner;

public class Restaurant {
    static int pasta,ribs,rice,fries,chicken,
    mukimo,peas,chapati,pork,cocktail,minutemaid,novida,redbull,monster;
    public static void restaurantOutline() {
        pasta = 970;
        ribs = 1200;
        rice = 600;
        fries = 400;
        chicken = 800;
        mukimo = 600;
        peas = 740;
        chapati = 150;
        pork = 150;
        cocktail = 1000;
        minutemaid = 400;
        novida = 250;
        redbull = 450;
        monster = 600;
        System.out.println("pasta @" + pasta);
        System.out.println("ribs @" + ribs);
        System.out.println("rice @" + rice);
        System.out.println("fries @" + fries);
        System.out.println("chicken @" + chicken);
        System.out.println("mukimo @" + mukimo);
        System.out.println("peas @" + peas);
        System.out.println("chapati @" + chapati);
        System.out.println("pork @" + pork);
        System.out.println("cocktail @" + cocktail);
        System.out.println("minutemaid @" + minutemaid);
        System.out.println("novida @" + novida);
        System.out.println("redbull @" + redbull);
        System.out.println("monster @" + monster);

        Scanner input = new Scanner(System.in);
        String Lambchops, Pizza, Shawarma, Mocktail, meal, drink;
        double Lambchopsprice, Pizzaprice, Shawarmaprice, Mocktailprice, totalamount, pochilabiashara, enterphonenumber;
        totalamount = 3000;
        System.out.println("add food to the outline:");
        Lambchops = input.next();
        System.out.println("add price of the food:");
        Lambchopsprice = input.nextDouble();
        System.out.println("add food to the outline:");
        Pizza = input.next();
        System.out.println("add price of the food:");
        Pizzaprice = input.nextDouble();
        System.out.println("add drink to the outline:");
        Mocktail = input.next();
        System.out.println("add price of the drink:");
        Mocktailprice = input.nextDouble();
        System.out.println("order a meal");
        meal = input.next();
        System.out.println("order a drink");
        drink = input.next();
        System.out.println("total amount:ksh " + totalamount);
        System.out.println("enter the pochi la biashara:");
        pochilabiashara = input.nextDouble();
        System.out.println("enter phone number");
        enterphonenumber = input.nextDouble();
        System.out.println("payment is successful");


    }
    public static void main(String args[]){
        restaurantOutline();
    }
}