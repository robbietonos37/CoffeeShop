public class CoffeeShop {

    private String shopName;

    private int shopOptions;
    public void coffeeShop(){
        shopName = " ";
        options = 0;

    }

    public void coffeeShop(String nameOfShop, int o){
        shopName = nameOfShop;
        options = o;
    }
    public void setOptions(int o){
        options = o;
    }

    public int getOptions(){
        return options;
    }

    public void printInfo(){
        System.out.println();
    }
    
}
