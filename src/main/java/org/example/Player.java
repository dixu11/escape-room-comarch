package org.example;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Item> items = new ArrayList<>();

    void give(Item item) {
        items.add(item);
    }
}
