package org.example;

public class Window extends Item {
    public Window(String name) {
        super(name);
    }

    void use(Context context) {
        if (used) {
            System.out.println("Zamlnąłeś okno");
        } else {
            System.out.println("Otworzyłeś okno");
        }
        used = !used;
    }

}
