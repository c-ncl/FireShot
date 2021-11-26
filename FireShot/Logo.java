import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Logo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Logo extends Display
{
    GifImage animated_logo;
    GreenfootImage current_Image;
    
    public Logo(){
        animated_logo = new GifImage("logo.gif");
    }
    /**
     * Act - do whatever the Logo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        current_Image = animated_logo.getCurrentImage();
        current_Image.scale(600, 500);
        setImage(current_Image);
    }
}
