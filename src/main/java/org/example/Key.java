package org.example;

public class Key extends Item {

    public Key(String name) {
        super(name);
    }

    @Override
    void use() {
      //  super.use(); odpalenie kodu use() z Item
        used = true;
        System.out.println("Klucz zabrany");
    }
}
