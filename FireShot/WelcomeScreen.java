import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Welcome Screen of the game.
 * 
 * @Nicole Bautista
 * @version (a version number or a date)
 */
public class WelcomeScreen extends World
{
    GifImage welcomeScreen_gif;
    GreenfootImage current_image;

    /**
     * Constructor for objects of class WelcomeScreen.
     * 
     */
    public WelcomeScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Start start = new Start();
        addObject(start,200,311);
        LevelsButton levelsButton = new LevelsButton();
        addObject(levelsButton,394,311);
    }
}
