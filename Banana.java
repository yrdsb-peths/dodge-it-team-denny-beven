import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Banana here.
 * 
 * @Denny Ung 
 * @version 1
 */
public class Banana extends Actor
{
    /**
     * Act - do whatever the Banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-25);
        
        if (getX() <= 0)
        {
            resetBanana();
        }
        
        
    }
    
    public void resetBanana()
    {
        int x = Greenfoot.getRandomNumber(2);
        if(x == 0)
        {
            setLocation(600,100);
        }
        else
        {
            setLocation(600,300);
        }
    }
}
