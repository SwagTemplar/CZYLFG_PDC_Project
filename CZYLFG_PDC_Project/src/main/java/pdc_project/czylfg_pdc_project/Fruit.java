package pdc_project.czylfg_pdc_project;

/**
 *
 * @author kisoo
 */
public class Fruit {
    private int inventoryNum;
    protected String fruitName;
    protected int fruitID;
    
    public Fruit()
    {
        this.inventoryNum = 0;
        this.fruitName = null;
        this.fruitID = 0;
    }
    
    public Fruit(String name, int id)
    {
        this.fruitName = name;
        this.fruitID = id;
        this.inventoryNum = 0;
    }
    
    public String getFruitName()
    {
        return this.fruitName;
    }
    
    public void setFruitName(String name)
    {
        this.fruitName = name;
    }
    
    public int getFruitID()
    {
        return this.fruitID;
    }
    
    public void setFruitID(int ID)
    {
        this.fruitID = ID;
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
