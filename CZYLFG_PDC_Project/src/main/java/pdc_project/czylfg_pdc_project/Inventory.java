package pdc_project.czylfg_pdc_project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

/**
 * This is where we create the inventory. Take in text files and after all the
 * orders and stuff outputs a text file.
 *
 * @author kisoo
 */
public class Inventory {
    
    private HashMap<Integer, Integer> inventory = new HashMap<>();
    

    public void Inventory() {
        this.inventory = null;
    }
    
    public HashMap<Integer, Integer> readInventory()
    {
        
        BufferedReader br;
        
        try 
        {
            br = new BufferedReader(new FileReader("./dbresources/current_inv.txt"));
            String line = "";
            int fruit_id;
            int value;
            
            while ((line = br.readLine()) != null) 
            {
               String[] arr = line.split(" ");
               fruit_id = Integer.parseInt(arr[0]);
               value = Integer.parseInt(arr[1]);
            
               this.inventory.put(fruit_id, value);
            }
            
            br.close();
        } 
        catch (IOException ex) 
        {
            System.err.println("IOException Error: " + ex.getMessage());
        }
        
        return this.inventory;
    }
    
    public void updateInventory(HashMap<Integer, Integer> hmap)
    {
        BufferedWriter bw;
        
        try 
        {
          bw = new BufferedWriter(new FileWriter("./dbresources/current_inv.txt"));
          
          
        } 
        catch (IOException ex) 
        {
            System.err.println("IOException Error: " + ex.getMessage());
        }
    }
}
