import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Banana here.
 * 
 * @Denny Ung 
 * @version 1
 */
public class Banana extends Actor
{
    
    
    private boolean flippedX = true;

    private int globalSpeed = 25;
    private int direction = -globalSpeed;
    
    public void act()
    {
        move(direction);
        
        if ((getX() <= 0) || (getX() >= getWorld().getWidth()-2))
        {
            resetBanana();
        }
        
    }
    
    public void resetBanana()
    {
        int y = Greenfoot.getRandomNumber(400);
        int x = 0;
        int balls = Greenfoot.getRandomNumber(2);
        
        boolean flippedX = (balls == 0);
        if (flippedX)
        {   
            direction = -globalSpeed;
            x = getWorld().getWidth();
        } 
        else
        {
            direction = globalSpeed;
        }
        
        direction = direction + (Greenfoot.getRandomNumber(5) - 5);
        
        
        
        boolean flippedY = (Greenfoot.getRandomNumber(2) != 0);
        
        setLocation(x,y);

    }
}
