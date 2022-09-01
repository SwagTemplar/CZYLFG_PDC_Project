package czylfg_pdc_project;

/**
 *
 * @author Kisoon Park 18008173 & Connor Stewart 17982915
 */
abstract class Fruit {

    //abstract Methods
    abstract String getFruitName();

    abstract int getFruitID();

    abstract void setInventoryNum(int num);

    abstract int getInventoryNum();

    abstract void decreaseStock(int num);

    abstract void increaseStock(int num);

}
