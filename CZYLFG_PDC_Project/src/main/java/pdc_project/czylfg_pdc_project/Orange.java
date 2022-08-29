package pdc_project.czylfg_pdc_project;

/**
 *
 * @author kisoo
 */
public class Orange extends Fruit{
    private final static String FRUITNAME = "Orange";
    private final static  int FRUITID = 6;
    
    public Orange(int inventoryNum)
    {
        super(FRUITNAME, FRUITID, inventoryNum);
    }
}
