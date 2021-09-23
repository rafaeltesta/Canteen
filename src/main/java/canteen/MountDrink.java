package canteen;

public class MountDrink {

    private double totalValue;
    private double valueDrink;

    Coffee coffee = new Coffee();
    CoffeeMilk coffeeMilk = new CoffeeMilk();
    MilkChocolate milkChocolate = new MilkChocolate();

    public void selectDrink(int op) {
        switch (op) {
            case 1:
                coffee.mountCoffee();
                break;
            case 2:
                coffeeMilk.mountCoffeeMilk();
                break;
            case 3:
                milkChocolate.mountMilkChocolate();
                break;
            case 4:
                mountMocha();
                break;
            case 5:
                mountEspressoPanna();
                break;
        }
    }

 

    Mocha mocha = new Mocha();

    public void mountMocha() {
        mocha.setName("Mocha");
        mocha.setValue(4.0);
        valueDrink += 4.0;
    }

    EspressoPanna espressoPanna = new EspressoPanna();

    public void mountEspressoPanna() {
        espressoPanna.setName("Espresso Panna");
        espressoPanna.setValue(4.5);
        valueDrink += 4.5;
    }

    public void selectSize(int op) {
        switch (op) {
            case 1:
                totalValue = valueDrink;
                break;
            case 2:
                totalValue = (valueDrink * 0.2) + valueDrink;
                break;
            case 3:
                totalValue = (valueDrink * 0.35) + valueDrink;
                break;
        }
    }

    ZestLemon zestLemon = new ZestLemon();

    public void mountZestLemon() {
        zestLemon.setName("Raspas de limao");
        zestLemon.setValue(0.5);
        totalValue += 0.5;
    }

    CinnamonPowder cinnamonPowder = new CinnamonPowder();

    public void mountCinnamonPowder() {
        zestLemon.setName("Canela em po");
        zestLemon.setValue(0.75);
        totalValue += 0.75;
    }

    NinhoMilk ninhoMilk = new NinhoMilk();

    public void selectAdditional(int op) {
        switch (op) {
            case 1:
                mountZestLemon();
            case 2:
                ninhoMilk.mountNinhoMilk();
                totalValue += ninhoMilk.getValue();
        }
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

}
