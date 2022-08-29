package pdc_project.czylfg_pdc_project;

/**
 *
 * @author kisoo
 */
public class TestMain {
    public static void main(String[] args) {
        Fruit apple1 = new GalaApple(1000);
        System.out.println("Name: "+apple1.fruitName+" ID: "+apple1.fruitID);
        System.out.println("Type of Apple: "+apple1.getFruitName());
        System.out.println("Number of Stock: "+apple1.getInventoryNum());
        
        apple1.setInventoryNum(69);
        System.out.println("Number of Stock: "+apple1.getInventoryNum());
        apple1.increaseStock(1000);
        System.out.println("Number of Stock: "+apple1.getInventoryNum());
        apple1.decreaseStock(68);
        System.out.println("Number of Stock: "+apple1.getInventoryNum());
        
        Banana b = new Banana(1000);
        System.out.println("Name: "+b.fruitName+" ID: "+b.fruitID);
    }
}
