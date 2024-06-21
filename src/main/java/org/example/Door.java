package org.example;

public class Door extends Item{
    private Key key;
    public Door(String name, Key key) {
        super(name);
        this.key = key;
    }

    @Override
    void use(Context context) {
        //jesli player ma klucz to otwieramy
        //jesli nie piszemy ze potrzebujesz klucz
        if (context.getPlayer().has(key)) {
            System.out.println("Otwierasz drzwi");
            context.getService().setRunning(false);
        }else{
            System.out.println("Potrzebujesz klucza!");
        }
    }
}
