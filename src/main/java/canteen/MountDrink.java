package canteen;

import java.util.Scanner;

public class MountDrink {
    private int op;
    private double totalValue;
    private double valueDrink;
    private int validator = 1;

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
            case 0:
                break;
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

    public void selectAdditional() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("SELECIONE UM ADICIONAL");
        System.out.println("[0] - Sem adicional");
        System.out.println("[1] - Raspas de limao");
        System.out.println("[2] - Canela em po");
        System.out.println("[3] - Leite ninho (colher)");
        System.out.println("[4] - Gelo de creme de leite (Cubo)");
        System.out.println("[5] - Leite condensado (colher)");
        System.out.println("[6] - Chocolate em po(Colher)");
        System.out.println("[7] - Cookie (Unidade)");
        System.out.println("Digite a opcao do adicional: ");
        op = sc.nextInt();
        switch (op) {
            case 1:
                zestLemon.mountZestLemon();
                totalValue += zestLemon.getValue();
                break;
            case 2:
                cinnamonPowder.mountCinnamonPowder();
                totalValue += cinnamonPowder.getValue();
                break;
            case 3:
                ninhoMilk.mountNinhoMilk();
                totalValue += ninhoMilk.getValue();
                break;
            case 4:
                sourCreamIce.mountSourCreamIce();
                totalValue += sourCreamIce.getValue();
                break;
            case 5:
                condensedMilk.mountCondensedMilk();
                totalValue += condensedMilk.getValue();
                break;
            case 6:
                chocolatePowder.mountChocolatePowder();
                totalValue += chocolatePowder.getValue();
                break;
            case 7:
                cookie.mountCookie();
                totalValue += cookie.getValue();
                break;
        }
    }
    
    public void moreAdditional() {
        Scanner sc = new Scanner(System.in);
        while (validator == 1) {
            System.out.println("DESEJA ADICIONAR UM ADICIONAL?");
            System.out.println("[1] - Sim");
            System.out.println("[2] - Nao");
            validator(sc.nextInt());
        }

    }
    
    private void validator(int op){
        switch (op) {
            case 1:
                selectAdditional();
                break;
            case 2:
                validator -= 1;
                break;
        }
                
    }

//        switch (op) {
//            case 1:
//                System.out.println("SELECIONE UM ADICIONAL");
//                System.out.println("[0] - Sem adicional");
//                System.out.println("[1] - Raspas de limao");
//                System.out.println("[2] - Canela em po");
//                System.out.println("[3] - Leite ninho (colher)");
//                System.out.println("[4] - Gelo de creme de leite (Cubo)");
//                System.out.println("[5] - Leite condensado (colher)");
//                System.out.println("[6] - Chocolate em po(Colher)");
//                System.out.println("[7] - Cookie (Unidade)");
//                System.out.println("Digite a opcao do adicional: ");
//                selectAdditional(sc.nextInt());
//                break;
//            case 2:
//                break;
//        }
    public double getTotalValue() {
        return totalValue;
    }

}
