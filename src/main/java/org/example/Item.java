package org.example;

public class Item {

    private boolean used = false;
    private String name;

    public Item(String name) {
        this.name = name;
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
