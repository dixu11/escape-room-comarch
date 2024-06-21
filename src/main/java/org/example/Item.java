package org.example;

public class Item {

    boolean used = false;
     String name;

    public Item(String name) {
        this.name = name;
    }

    void use(Room room, Player player) {
        System.out.println("Zaczynamy");
    }

    @Override
    public String toString() {
        return "Item{" +
                "used=" + used +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }


}
