import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Banana banana = new Banana();
        addObject(banana, 600, 100);
        
        Banana banana2 = new Banana();
        addObject(banana2, 600, 300);

        
    }
}
