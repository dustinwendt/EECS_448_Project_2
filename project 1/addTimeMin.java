import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class addTime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class addTimeMin extends Clock
{
    /**
     * Act - do whatever the addTime wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        MyWorld clocks = (MyWorld) getWorld();
        Clock clock1 = clocks.getClock();
        if(Greenfoot.mouseClicked(this))
        {
          clock1.addMin();
        }
    }    
}
