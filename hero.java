import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hero extends Actor
{
    /**
     * Act - do whatever the hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("up"))
        { move(5); }
        if (Greenfoot.isKeyDown("down"))
        { move(-5); }
        if (Greenfoot.isKeyDown("left") )
        {turn (-5);}
        if (Greenfoot.isKeyDown("right") )
        {turn(5);}
    }
}
