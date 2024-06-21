package org.example;

public class Key extends Item {

    public Key(String name) {
        super(name);
    }

    @Override
    void use(Room room, Player player) {
      //  super.use(); odpalenie kodu use() z Item
        used = true;
        System.out.println("Klucz zabrany");
        room.remove(this);
        player.give(this);
    }
}
