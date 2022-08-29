package pdc_project.czylfg_pdc_project;

/**
 *
 * @author kisoo
 */
public class Banana extends Fruit{
    private final static String FRUITNAME = "Banana";
    private final static  int FRUITID = 3;
    
    public Banana(int inventoryNum)
    {
        super(FRUITNAME, FRUITID, inventoryNum);
    }
}
