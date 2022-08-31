package pdc_project.czylfg_pdc_project;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashMap;


/*
 * @author "Connor Stewart 17982915"
 */
public class Order {

//    private HashMap<Integer, Integer> hmap  = new HashMap<>();
    private HashMap<Integer, Fruit> orderMap;
    private int orderID;

    public Order() {
        this.orderID = 0;
        this.orderMap = new HashMap<>();;
    }

    public Order(HashMap<Integer, Fruit> orderMap) {
        this.orderMap = orderMap;
        this.orderID = orderMap.size();
    }

//    public void Order(Fruit[] fruitArr) {
//
//        String itemID = null;
//        String itemQuant = null;
//        String userInput = null;
//
//        for (int i = 0; i < 6; i++) {
//            System.out.println("Name: " + fruitArr[i].getFruitName() + "\n"
//                    + "Quantity: " + fruitArr[i].getInventoryNum() + "\n"
//                    + "Fruit ID: " + fruitArr[i].getFruitID() + "\n");
//        }
//
//        try {
//            BufferedReader readIn;
//
//            boolean loop = true;
//            do {
//
//                System.out.println("Enter the fruit ID you want to order");
//
//                readIn = new BufferedReader(new InputStreamReader(System.in));
//
//                itemID = readIn.readLine();
//
//                System.out.println("Enter the quantity you want to order");
//                itemQuant = readIn.readLine();
//
//                System.out.println("You are ordering: " + itemQuant + " " + itemID + "('s)");
//
//                PrintStream printOut = new PrintStream(new FileOutputStream("./dbresources/Send_inv.txt", true), true);
//
//                printOut.println(itemID);
//                printOut.println(itemQuant);
//
//                printOut.close();
//
//                System.out.println();
//
//                System.out.println("Type E to exit to Menu");
//                System.out.println("Or");
//                System.out.println("Type C to continue ordering");
//
//                userInput = readIn.readLine();
//
//                if (userInput.equals("C")) {
//                    loop = true;
//                } else if (userInput.equals("E")) {
//                    break;
//                }
//            } while (loop);
//            readIn.close();
//
//        } catch (IOException e) {
//            System.out.println("Error reading from file ");
//
//        }
//
//    }

    //The method for people to make orders
    public void readOrder() {

        String itemID;
        String itemQuant;
        String itemName = null;

        try {
            BufferedReader readIn;
            readIn = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the fruit ID you want to order");
            itemID = readIn.readLine();
            System.out.println("Enter the quantity you want to order");
            itemQuant = readIn.readLine();

            System.out.println("You are ordering: " + itemQuant + " " + itemID + "('s)");

            this.orderID++;

            switch (itemID) {
                case "1":
                    itemName = "Gala_Apple";
                    break;
                    
                case "2":
                    itemName = "Granny_Smith_Apple";
                    break;
                    
                case "3":
                    itemName = "Banana";
                    break;
                    
                case "4":
                    itemName = "Watermelon";
                    break;
                    
                case "5":
                    itemName = "Mango";
                    break;
                    
                case "6":
                    itemName = "Orange";
                    break;
            }

            PrintStream printOut = new PrintStream(new FileOutputStream("./dbresources/order.txt", true), true);

            String s = String.valueOf(orderID) + " " + itemName + " " + itemQuant + " " + itemID;

            printOut.println(s);
            printOut.close();

            readIn.close();

        } catch (IOException e) {
            System.out.println("Error reading from file ");

        }
    }

    public HashMap<Integer, Fruit> getOrder() {

        BufferedReader br;
        Fruit newFruit = new Fruit();

        try {
            br = new BufferedReader(new FileReader("./dbresources/order.txt"));
            String line = "";
            int order_id;

            while ((line = br.readLine()) != null) {
                String[] arr = line.split(" ");
                order_id = Integer.parseInt(arr[0]);
                newFruit.setFruitName(arr[1]);
                newFruit.setInventoryNum(Integer.parseInt(arr[2]));
                newFruit.setFruitID(Integer.parseInt(arr[3]));

                this.orderMap.put(order_id, newFruit);
            }

            br.close();
        } catch (IOException ex) {
            System.err.println("IOException Error: " + ex.getMessage());
        }

        return this.orderMap;
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
