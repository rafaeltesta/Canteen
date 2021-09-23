package canteen;

public class MountDrink {

    private double totalValue;
    private double valueDrink;

    Coffee coffee = new Coffee();
    CoffeeMilk coffeeMilk = new CoffeeMilk();
    MilkChocolate milkChocolate = new MilkChocolate();
    Mocha mocha = new Mocha();
    EspressoPanna espressoPanna = new EspressoPanna();
    ZestLemon zestLemon = new ZestLemon();
    CinnamonPowder cinnamonPowder = new CinnamonPowder();
    NinhoMilk ninhoMilk = new NinhoMilk();
    SourCreamIce sourCreamIce = new SourCreamIce();
    CondensedMilk condensedMilk = new CondensedMilk();
    ChocolatePowder chocolatePowder = new ChocolatePowder();
    Cookie cookie = new Cookie();
    
    public void selectDrink(int op) {
        switch (op) {
            case 1:
                coffee.mountCoffee();
                valueDrink = coffee.getValue();
                break;
            case 2:
                coffeeMilk.mountCoffeeMilk();
                valueDrink = coffeeMilk.getValue();
                break;
            case 3:
                milkChocolate.mountMilkChocolate();
                valueDrink = milkChocolate.getValue();
                break;
            case 4:
                mocha.mountMocha();
                valueDrink = mocha.getValue();
                break;
            case 5:
                espressoPanna.mountEspressoPanna();
                valueDrink = espressoPanna.getValue();
                break;
        }
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

    public void selectAdditional(int op) {
        switch (op) {
            case 1:
                zestLemon.mountZestLemon();
                totalValue += zestLemon.getValue();
            case 2:
                cinnamonPowder.mountCinnamonPowder();
                totalValue += cinnamonPowder.getValue();
            case 3:
                ninhoMilk.mountNinhoMilk();
                totalValue += ninhoMilk.getValue();
            case 4:
                sourCreamIce.mountSourCreamIce();
                totalValue += sourCreamIce.getValue();
            case 5:
                condensedMilk.mountCondensedMilk();
                totalValue += condensedMilk.getValue();
            case 6:
                chocolatePowder.mountChocolatePowder();
                totalValue += chocolatePowder.getValue();
            case 7:
                cookie.mountCookie();
                totalValue += cookie.getValue();
        }
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

}
