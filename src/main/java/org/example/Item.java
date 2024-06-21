package org.example;

public class Item {

    boolean used = false;
     String name;

    public Item(String name) {
        this.name = name;
    }

    void use() {

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
