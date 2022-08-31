package pdc_project.czylfg_pdc_project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
        File currentFile = new File("./dbresources/current_inv.txt");
        currentFile.delete();
        
        BufferedWriter bw;
        
        try {
           bw = new BufferedWriter(new FileWriter("./dbresources/current_inv.txt"));
           
           for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
 
                bw.write(entry.getKey() + " "+ entry.getValue());
                bw.newLine();
            }
           bw.flush();
        } 
        catch (IOException ex) 
        {
            System.err.println("IOException Error: " + ex.getMessage());
        }
    }
}
