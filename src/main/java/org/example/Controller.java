package org.example;

import java.util.Scanner;

public class Controller {


    void startGame() {
        System.out.println("Witaj w grze.");
        Service service = new Service();
        while(service.isRunning()){
            System.out.println("Jesteś w pokoju, znajdują się w nim:");
            //iter - skrót do foreach //fori do klasycznego
            for(Item item  : service.getRoomItems() ){
                System.out.println(item.getName());
            }
            System.out.println("Którego przedmiotu chcesz użyć?");
            Scanner scanner = new Scanner(System.in);
            String itemName = scanner.nextLine();
            service.useItem(itemName);
        }




        System.out.println("Wygrałeś brawo!");
    }
}
