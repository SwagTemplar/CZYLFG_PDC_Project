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

    public void Order() {

        String itemName = null;
        String itemQuant = null;
        String userInput = null;
        
        try {

            boolean loop = true;
            while (loop) {

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

                System.out.println();

                System.out.println("Type E to exit to Menu");
                System.out.println("Or");
                System.out.println("Type C to continue ordering");

                userInput = readIn.readLine();

                if (userInput.equals("E")) {
                    loop = false;
                } else if (userInput.equals("C")) {
                    continue;
                }
                readIn.close();
            }

        } catch (IOException e) {
            System.out.println("Error reading from file ");

        }
        //// kisoon this is just a tester method so it'll print the line and what number the line is, 
        //// it also sets it so when printing the lines they start at 0 but it wont push them in the doc to different lines.
        try {
            LineNumberReader readingInv = new LineNumberReader(new FileReader("./dbresources/Send_inv.txt"));

            readingInv.setLineNumber(0);

            String line = null;
            while ((line = readingInv.readLine()) != null) {
                System.out.println("Line " + readingInv.getLineNumber() + ": " + line);
            }

        } catch (IOException e) {
            System.out.println("Error reading from file ");

        }
    }
    
    
    public boolean checkAvailability(Fruit fruit, int quantityOrdered, HashMap<Integer, Integer> hmap)
    {
        for(Integer key: hmap.keySet()) 
        {
            if (key.equals(fruit.fruitID) && fruit.getInventoryNum() >= quantityOrdered)
            {
                return true;
            }
        }
        return false;
    }
    
    public void printOrder(String orderedFruit, String quantity)
    {
        System.out.println("Fruit: "+orderedFruit+"\n"
                            +"Quantity: "+quantity);
    }
}


