package org.example;

import java.util.List;

public class Room {
    private List<Item> items;

    public Room(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void remove(Item item) {
        items.remove(item);
    }
}
