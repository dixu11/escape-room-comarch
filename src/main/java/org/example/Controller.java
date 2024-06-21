package org.example;

import java.util.Scanner;

public class Controller {

    void startGame() {
        System.out.println("Witaj w grze.");
        System.out.println("Jesteś w pokoju, znajdują się w nim:");
        Service service = new Service();
        //iter - skrót do foreach //fori do klasycznego
        for(String item  : service.getItems() ){
            System.out.println(item);
        }

        System.out.println("Którego przedmiotu chcesz użyć?");
        Scanner scanner = new Scanner(System.in);
       String itemName = scanner.nextLine();
       service.useItem(itemName);
    }
}
