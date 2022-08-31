package pdc_project.czylfg_pdc_project;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;

/*
 * @author "Connor Stewart 17982915"
 */
public class Order {

    public void Order(Fruit[] fruitArr) {

        String itemID = null;
        String itemQuant = null;
        String userInput = null;

        for (int i = 0; i < 6; i++) {
            System.out.println("Name: " + fruitArr[i].getFruitName() + "\n"
                    + "Quantity: " + fruitArr[i].getInventoryNum() + "\n"
                    + "Fruit ID: " + fruitArr[i].getFruitID() + "\n");

        }

        try {
            BufferedReader readIn;

            boolean loop = true;
            do {

                System.out.println("Enter the fruit ID you want to order");

                readIn = new BufferedReader(new InputStreamReader(System.in));

                itemID = readIn.readLine();

                System.out.println("Enter the quantity you want to order");
                itemQuant = readIn.readLine();

                System.out.println("You are ordering: " + itemQuant + " " + itemID + "('s)");

                PrintStream printOut = new PrintStream(new FileOutputStream("./dbresources/Send_inv.txt", true), true);

                printOut.println(itemID);
                printOut.println(itemQuant);

                printOut.close();

                System.out.println();

                System.out.println("Type E to exit to Menu");
                System.out.println("Or");
                System.out.println("Type C to continue ordering");

                userInput = readIn.readLine();

                if (userInput.equals("C")) {
                    loop = true;
                } else if (userInput.equals("E")) {
                    break;
                }
            } while (loop);
            readIn.close();

        } catch (IOException e) {
            System.out.println("Error reading from file ");

        }

    }

    public boolean checkAvailability(Fruit fruit, int quantityOrdered, HashMap<Integer, Integer> hmap) {
        for (Integer key : hmap.keySet()) {
            if (key.equals(fruit.fruitID) && fruit.getInventoryNum() >= quantityOrdered) {
                return true;
            }
        }
        return false;
    }

    public void printOrder(int itemID, String quantity) {
        System.out.println("Fruit ID: " + itemID + "\n"
                + "Quantity: " + quantity);
    }
}
