package org.example;

public class Key extends Item {

    public Key(String name) {
        super(name);
    }

    @Override
    void use(Context context) {
      //  super.use(); odpalenie kodu use() z Item
        used = true;
        System.out.println("Klucz zabrany");
        context.getRoom().remove(this);
        context.getPlayer().give(this);
    }
}
