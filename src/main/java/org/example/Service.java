package org.example;


import java.util.ArrayList;
import java.util.List;

public class Service {

    private Room actualRoom;
    private Player player;


    public Service(){
        List<Item> items = new ArrayList<>();
        items.add(new Key("klucz"));
        items.add(new Window("okno"));
        items.add(new Item("drzwi"));
        actualRoom = new Room(items);
        player = new Player();
    }

    List<Item> getRoomItems() {
        List<Item> visibleRoomItems = new ArrayList<>();
        for (Item item : actualRoom.getItems()) {
            if (!item.isUsed()) {
                visibleRoomItems.add(item);
            }
        }
        return visibleRoomItems;
    }


    void useItem(String selectedName) {
        for (Item item : actualRoom.getItems()) {
            if (selectedName.equals(item.getName())) {
                System.out.println("Wybrano " + item.getName());
                item.use();
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
