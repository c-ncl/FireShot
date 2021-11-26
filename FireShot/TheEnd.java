import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TheEnd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TheEnd extends Display
{
    GifImage theEnd_gif;
    GreenfootImage current_Image;
    /**
     * Act - do whatever the TheEnd wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TheEnd()
    {
        // Add your action code here.
        // Add your action code here.
        theEnd_gif = new GifImage("theEnd.gif");
    }
    /**
     * Act - do whatever the Logo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        current_Image = theEnd_gif.getCurrentImage();
        setImage(current_Image);
    }
}
