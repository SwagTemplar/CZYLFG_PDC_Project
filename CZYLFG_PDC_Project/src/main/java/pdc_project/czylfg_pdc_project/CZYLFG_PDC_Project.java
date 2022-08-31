package pdc_project.czylfg_pdc_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kisoon Park 18008173
 */
public class CZYLFG_PDC_Project {

    public static void main(String[] args) {
        System.out.println("Welcome to the CZYLFG inventory management system!\n");

        Fruit galaApple = new GalaApple();
        Fruit grannyApple = new GrannySmithApple();
        Fruit mango = new Mango();
        Fruit orange = new Orange();
        Fruit banana = new Banana();
        Fruit watermelon = new Watermelon();

        Fruit[] fruitArr = {galaApple, grannyApple, banana, watermelon, mango, orange};

        Order orderObj = new Order();
        Inventory fruitInv = new Inventory();
        Scanner scan = new Scanner(System.in);

        boolean run = true;
        while (run) {
            HashMap<Integer, Integer> inv = fruitInv.readInventory();
            HashMap<Integer, Fruit> orderMap = orderObj.getOrder();
            Order newOrder = new Order(orderMap);

            for (Integer key : inv.keySet()) {
                if (key.equals(galaApple.fruitID)) {
                    galaApple.setInventoryNum(inv.get(key));
                } else if (key.equals(grannyApple.fruitID)) {
                    grannyApple.setInventoryNum(inv.get(key));
                } else if (key.equals(mango.fruitID)) {
                    mango.setInventoryNum(inv.get(key));
                } else if (key.equals(orange.fruitID)) {
                    orange.setInventoryNum(inv.get(key));
                } else if (key.equals(banana.fruitID)) {
                    banana.setInventoryNum(inv.get(key));
                } else if (key.equals(watermelon.fruitID)) {
                    watermelon.setInventoryNum(inv.get(key));
                }
            }

            System.out.println("What do you want to do?\n");
            System.out.println("A: Check our inventory levels!");
            System.out.println("B: Pending Orders");
            System.out.println("C: Create Order");
            System.out.println("D: Exit");

            System.out.println();

            BufferedReader menuInput;
            System.out.println();
            menuInput = new BufferedReader(new InputStreamReader(System.in));

            Character mi = ' ';
            try {
                mi = menuInput.readLine().charAt(0);
                menuInput.close();
            } catch (IOException ex) {
                Logger.getLogger(CZYLFG_PDC_Project.class.getName()).log(Level.SEVERE, null, ex);
            }

                switch (Character.toLowerCase(mi)) {
                    case 'a':

                        for (int i = 0; i < 6; i++) {
                            System.out.println("Name: " + fruitArr[i].getFruitName() + "\n"
                                    + "Quantity: " + fruitArr[i].getInventoryNum() + "\n"
                                    + "Fruit ID: " + fruitArr[i].getFruitID() + "\n");
                        }
                        break;

                    case 'b':

                        break;

                    case 'c':
                        newOrder.readOrder();

                        break;

                    case 'd':
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid Input");
                        break;
                }
        }
//        scan.close();
    }
}
