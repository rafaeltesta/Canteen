package canteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Drink drink = new Drink();
        Coffee coffee = new Coffee();
        MountDrink mountDrink = new MountDrink();

        System.out.println("SELECIONE UMA BEBIDA: ");
        System.out.println("[1] - Cafe");
        System.out.println("[2] - Cafe com Leite");
        System.out.println("[3] - Leite com Chocolate");
        System.out.println("[4] - Mocha");
        System.out.println("[5] - Espresso Panna");
        System.out.println("Digite a opcao desejada: ");
        mountDrink.selectDrink(sc.nextInt());

        System.out.println("SELECIONE UM TAMANHO: ");
        System.out.println("[1] - Pequeno");
        System.out.println("[2] - Medio");
        System.out.println("[3] - Grande");
        System.out.println("Digite a opcao de tamanho: ");
        mountDrink.selectSize(sc.nextInt());
        
        mountDrink.moreAdditional();
        
        
        
        
        System.out.println(mountDrink.getTotalValue());

        sc.close();
    }

}
