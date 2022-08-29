package pdc_project.czylfg_pdc_project;

import java.util.*;

/**
 *
 * @author Kisoon Park 18008173
 */
public class CZYLFG_PDC_Project {

    public static void main(String[] args) {
        System.out.println("Welcome to the CZYLFG inventory management system!\n");
    
        boolean run = true;
        while(run)
        {
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
