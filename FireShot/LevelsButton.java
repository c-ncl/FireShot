import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelsButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelsButton extends Display
{
    /**
     * Act - do whatever the LevelsButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseMoved(this))
        {
            setImage("level_button_highlighted.jpg");
        }

        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("level_button.jpg");
        }

        if (Greenfoot.mouseClicked(this))
        {
            Display display = new Display();
            Greenfoot.setWorld(new Level1());
        }
    }
}
