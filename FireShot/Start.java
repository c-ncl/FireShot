import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Display
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        // Add your action code here.
        if (Greenfoot.mouseMoved(this))
        {
            setImage("start_button_highlighted.jpg");
        }

        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("start_button.jpg");
        }

        if (Greenfoot.mouseClicked(this))
        {
            Display display = new Display();
            Greenfoot.setWorld(new Level1());
        }
    }
}
