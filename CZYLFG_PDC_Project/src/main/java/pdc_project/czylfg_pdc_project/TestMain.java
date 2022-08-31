package pdc_project.czylfg_pdc_project;

import java.io.*;
import java.util.*;

/**
 *
 * @author kisoo
 */
public class TestMain {

    public static void main(String[] args) {
        Fruit apple1 = new GalaApple(1000);
        System.out.println("Name: " + apple1.fruitName + " ID: " + apple1.fruitID);
        System.out.println("Type of Apple: " + apple1.getFruitName());
        System.out.println("Number of Stock: " + apple1.getInventoryNum());

        apple1.setInventoryNum(69);
        System.out.println("Number of Stock: " + apple1.getInventoryNum());
        apple1.increaseStock(1000);
        System.out.println("Number of Stock: " + apple1.getInventoryNum());
        apple1.decreaseStock(68);
        System.out.println("Number of Stock: " + apple1.getInventoryNum());

        Banana b = new Banana(1000);
        System.out.println("Name: " + b.fruitName + " ID: " + b.fruitID);

//        Inventory obj = new Inventory();
        Order orderObj = new Order();
        //// This is just reading user input that is put into the console and saves it into the .txt file I added into the folder dbresources
        //// idk what happened, it was working then it didnt and started to create .txt files that were 4gb+ broke it so now it doesnt save content to .txt files

        // Orderobj testing here
        String itemName = null;

        String itemQuant = null;

        try {

            boolean loop = true;
            while (loop) {
                Scanner sc = new Scanner(System.in);
                char userInput = ' ';

                System.out.println("Enter the fruit you want to order");

                BufferedReader readIn = new BufferedReader(new InputStreamReader(System.in));

                itemName = readIn.readLine();

                System.out.println("Enter the quantity you want to order");
                itemQuant = readIn.readLine();

                System.out.println("You are ordering: " + itemQuant + " " + itemName + "('s)");

                PrintStream printOut = new PrintStream(new FileOutputStream("./dbresources/Send_inv.txt", true), true);

                printOut.println(itemName);
                printOut.println(itemQuant);

                printOut.close();
                readIn.close();

                System.out.println();

                do{
                System.out.println("Type E to exit to Menu");
                System.out.println("Or");
                System.out.println("Type C to continue ordering");
                if (sc.hasNextLine()) {
                   userInput = sc.next().charAt(0);
                }
                while (loop);
                if (Character.toLowerCase(userInput) == 'e') {
                    loop = false;
                } else if (Character.toLowerCase(userInput) == 'c') {
                    loop = true;
                }
                }
            }
}
        } catch (IOException e) {
            System.out.println("Error reading from file ");

        }
//        //// kisoon this is just a tester method so it'll print the line and what number the line is, 
//        //// it also sets it so when printing the lines they start at 0 but it wont push them in the doc to different lines.
//        try {
//            LineNumberReader readingInv = new LineNumberReader(new FileReader("./dbresources/Send_inv.txt"));
//
//            readingInv.setLineNumber(0);
//
//            String line = null;
//            while ((line = readingInv.readLine()) != null) {
//                System.out.println("Line " + readingInv.getLineNumber() + ": " + line);
//            }
//
//        } catch (IOException e) {
//            System.out.println("Error reading from file ");
//
//        }

        Inventory fruitInv = new Inventory();
        HashMap<Integer, Integer> inv = fruitInv.readInventory();
        
        fruitInv.printInv();
        
        inv.replace(1, 1000);
        inv.replace(3, 1950);
        inv.replace(6, 1110);
        
        fruitInv.updateInventory(inv);
        
        fruitInv.printInv();
        
        
        
        
//        HashMap<Integer, Integer> newMap = new HashMap<>();
//        newMap
    }
}

// Line 0: apple
// Line 1: 239
