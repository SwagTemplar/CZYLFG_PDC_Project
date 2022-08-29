package pdc_project.czylfg_pdc_project;

/**
 *
 * @author kisoo
 */
public class Fruit {
    private int inventoryNum;
    protected String fruitName;
    protected int fruitID;
    
    public Fruit(String name, int id, int inventoryNum)
    {
        this.fruitName = name;
        this.fruitID = id;
        this.inventoryNum = inventoryNum;
    }
    
    public String getFruitName()
    {
        return this.fruitName;
    }
    
    public void setInventoryNum(int num)     
    {
        this.inventoryNum = num;
    }
    
    public int getInventoryNum()
    {
        return this.inventoryNum;
    }
    
    public void decreaseStock(int num)
    {
        this.inventoryNum -= num;
    }
    
    public void increaseStock(int num)
    {
        this.inventoryNum += num;
    }
    
}
