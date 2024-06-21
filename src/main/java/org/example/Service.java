package org.example;

public class Service {
    private String[] items = {"klucz", "furtka", "okno", "drzwi"};

    String[] getItems() {
        return items;
    }

    void useItem(String selectedName) {
        for (String itemName : items) {
            if (selectedName.equals(itemName)) {
                System.out.println("Wybrano " + itemName);
                return;
            }
        }

        System.out.println("nie ma takiego przedmiotu");


       /* if (name.equals(items[0])) {
            System.out.println("Wybrano "+ items[0]);
        } else if (name.equals(items[1])) {
            System.out.println("wybrano " + items[1]);
        }else if(name.equals(items[2])){
            System.out.println("wybrano "+ items[2]);
        }else{
            System.out.println("nie ma takiego przedmiotu");
        }*/
    }


}
