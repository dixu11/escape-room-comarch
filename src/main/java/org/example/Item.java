package org.example;

public abstract class Item {

    boolean used = false;
     String name;

    public Item(String name) {
        this.name = name;
    }

   abstract void use(Context context);

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
