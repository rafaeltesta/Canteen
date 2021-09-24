package br.com.unipar.canteen.application;

import br.com.unipar.canteen.additional.Cookie;
import br.com.unipar.canteen.additional.NinhoMilk;
import br.com.unipar.canteen.additional.SourCreamIce;
import br.com.unipar.canteen.additional.CinnamonPowder;
import br.com.unipar.canteen.additional.ChocolatePowder;
import br.com.unipar.canteen.additional.ZestLemon;
import br.com.unipar.canteen.additional.CondensedMilk;
import br.com.unipar.canteen.drink.Coffee;
import br.com.unipar.canteen.drink.CoffeeMilk;
import br.com.unipar.canteen.drink.EspressoPanna;
import br.com.unipar.canteen.drink.MilkChocolate;
import br.com.unipar.canteen.drink.Mocha;
import java.util.Scanner;

public class MountDrink {

    private int op;
    private double totalValue;
    private double valueDrink;
    private int validator = 1;

    public void selectDrink(int op) {
        switch (op) {
            case 0:
                break;
            case 1:
                Coffee coffee = new Coffee();
                coffee.mountCoffee();
                valueDrink = coffee.getValue();
                break;
            case 2:
                CoffeeMilk coffeeMilk = new CoffeeMilk();
                coffeeMilk.mountCoffeeMilk();
                valueDrink = coffeeMilk.getValue();
                break;
            case 3:
                MilkChocolate milkChocolate = new MilkChocolate();
                milkChocolate.mountMilkChocolate();
                valueDrink = milkChocolate.getValue();
                break;
            case 4:
                Mocha mocha = new Mocha();
                mocha.mountMocha();
                valueDrink = mocha.getValue();
                break;
            case 5:
                EspressoPanna espressoPanna = new EspressoPanna();
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
                ZestLemon zestLemon = new ZestLemon();
                zestLemon.mountZestLemon();
                totalValue += zestLemon.getValue();
                break;
            case 2:
                CinnamonPowder cinnamonPowder = new CinnamonPowder();
                cinnamonPowder.mountCinnamonPowder();
                totalValue += cinnamonPowder.getValue();
                break;
            case 3:
                NinhoMilk ninhoMilk = new NinhoMilk();
                ninhoMilk.mountNinhoMilk();
                totalValue += ninhoMilk.getValue();
                break;
            case 4:
                SourCreamIce sourCreamIce = new SourCreamIce();
                sourCreamIce.mountSourCreamIce();
                totalValue += sourCreamIce.getValue();
                break;
            case 5:
                CondensedMilk condensedMilk = new CondensedMilk();
                condensedMilk.mountCondensedMilk();
                totalValue += condensedMilk.getValue();
                break;
            case 6:
                ChocolatePowder chocolatePowder = new ChocolatePowder();
                chocolatePowder.mountChocolatePowder();
                totalValue += chocolatePowder.getValue();
                break;
            case 7:
                Cookie cookie = new Cookie();
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

    private void validator(int op) {
        switch (op) {
            case 1:
                selectAdditional();
                break;
            case 2:
                validator -= 1;
                break;
        }

    }

    public double getTotalValue() {
        return totalValue;
    }

}
