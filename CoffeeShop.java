public class CoffeeShop {

    private String shopName;
    private int options;
    private double prices;
    private String coffee;
    private int size;
    public void coffeeShop(){
        shopName = " ";
        options = 0;
        prices = 0.0;
        coffee = "";
        size = 0;
    }

    public void coffeeShop(String nameOfShop, int o, double p, String coffee, int s){
        shopName = nameOfShop;
        options = o;
        prices = p;
        this.coffee = coffee;
        size = s;
    }
    public void setOptions(int o){
        options = o;
    }

    public void setPrices(double p){
        prices = p;
    }

    public void setCoffee(String coffee) {
        this.coffee = coffee;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getOptions(){
        return options;
    }

    public void printInfo(){
        System.out.println();
    }
    
}
