public class CoffeeMaker {
    private boolean hasWorkToDo;
    private boolean coffeeReady = false;


    public CoffeeMaker(){
        this(false);
    }

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isCoffeeReady() {
        return coffeeReady;
    }

    public void setCoffeeReady(boolean coffeeReady) {
        this.coffeeReady = coffeeReady;
    }
    // ------------------------------------------------------

    public void brewCoffee(){
        if(this.hasWorkToDo){
            System.out.println("Brewing Coffee....");
        }
    }

    public void addMilk(double cupsOfMilk){
        if(this.hasWorkToDo){
            System.out.println("Adding " + cupsOfMilk + " to the coffee..." );
            this.setCoffeeReady(true);
        }
    }

    public void makeCoffee(double amountOfMilk){
        setHasWorkToDo(true);
        while (!coffeeReady) {
            System.out.println("Working on coffee...");
            brewCoffee();
            addMilk(amountOfMilk);
        }

        setHasWorkToDo(false);
        setCoffeeReady(false);
    }
}
