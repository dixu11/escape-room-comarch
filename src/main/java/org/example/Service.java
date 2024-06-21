package org.example;


public class Service {
    private Item[] items = {
            new Item("klucz"),
            new Item("okno"),
            new Item("drzwi")
    };

    Item[] getItems() {
        return items;
    }

    void useWindow(Item item) {
        if(item.getName().equals("okno")){
            item.setUsed(true);
            System.out.println("Otworzyłeś okno");
        }
    }

    void useItem(String selectedName) {
        for (Item item : items) {
            if (selectedName.equals(item.getName())) {
                System.out.println("Wybrano " + item.getName());
                useWindow(item);
                return;
            }
        }

        System.out.println("nie ma takiego przedmiotu");

        /*
           Arrays.stream(items)
                .filter(itemName -> itemName.equals(selectedName))
                .findAny()
                .ifPresentOrElse(
                        itemName -> System.out.println("Wybrano " + itemName),
                        () -> System.out.println("nie ma takiego przedmiotu")
                );
        * */

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
