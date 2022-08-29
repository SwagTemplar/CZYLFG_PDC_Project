package pdc_project.czylfg_pdc_project;

/**
 *
 * @author kisoo
 */
public class GalaApple extends Fruit{
    private final static String FRUITNAME = "Gala Apple";
    private final static  int FRUITID = 1;
    
    public GalaApple(int inventoryNum)
    {
        super(FRUITNAME, FRUITID, inventoryNum);
    }
}
