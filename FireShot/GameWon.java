import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWon extends World
{
    private GreenfootSound theEnd_music;
    /**
     * Constructor for objects of class GameWon.
     * 
     */
    public GameWon()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        theEnd_music = new GreenfootSound("theEnd.wav");
        prepare();
    }

    public void started()
    {
        theEnd_music.playLoop(); //Plays the msuic when the game is started.
    }

    public void stopped()
    {
        theEnd_music.stop(); //Stops music when the game is paused.
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        TheEnd theEnd = new TheEnd();
        addObject(theEnd,332,242);
    }
}
