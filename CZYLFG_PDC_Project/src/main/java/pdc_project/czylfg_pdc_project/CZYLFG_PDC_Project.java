package pdc_project.czylfg_pdc_project;

import java.util.*;

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
        
        Inventory fruitInv = new Inventory();
    
        boolean run = true;
        while(run)
        {
            HashMap<Integer, Integer> inv = fruitInv.readInventory();
            
            for(Integer key: inv.keySet()) 
            {
                if (key.equals(galaApple.fruitID))
                {
                    galaApple.setInventoryNum(inv.get(key));
                }
                else if (key.equals(grannyApple.fruitID))
                {
                    grannyApple.setInventoryNum(inv.get(key));
                }
                else if (key.equals(mango.fruitID))
                {
                    mango.setInventoryNum(inv.get(key));
                }
                else if (key.equals(orange.fruitID))
                {
                    orange.setInventoryNum(inv.get(key));
                }
                else if (key.equals(banana.fruitID))
                {
                    banana.setInventoryNum(inv.get(key));
                }
                else if (key.equals(watermelon.fruitID))
                {
                    watermelon.setInventoryNum(inv.get(key));
                }
            }
     
            System.out.println("What do you want to do?\n");
            System.out.println("A: Check our inventory levels!");
            System.out.println("B: Importing Status");
            System.out.println("C: Outgoing Orders");
            System.out.println("D: Exit");

            Scanner scan = new Scanner(System.in);

            Character menuInput = scan.next().charAt(0);

            switch (Character.toLowerCase(menuInput)) {
                case 'a':

                    break;

                case 'b':

                    break;

                case 'c':

                    break;

                case 'd':
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}
