package pdc_project.czylfg_pdc_project;

/**
 *
 * @author kisoo
 */
public class Mango extends Fruit{
    private final static String FRUITNAME = "Mango";
    private final static  int FRUITID = 5;
    
    public Mango(int inventoryNum)
    {
        super(FRUITNAME, FRUITID, inventoryNum);
    }
}
