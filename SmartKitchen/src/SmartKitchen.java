public class SmartKitchen {
    private Refrigerator refrigerator;
    private DishWasher dishWasher;
    private CoffeeMaker coffeeMaker;


    public SmartKitchen() {
        this.refrigerator = new Refrigerator();
        this.dishWasher = new DishWasher();
        this.coffeeMaker = new CoffeeMaker();
    }

    public void makeCoffee(){
        this.coffeeMaker.makeCoffee(.75);
        System.out.println("Coffee is finished!");
    }

}
