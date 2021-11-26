import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Levels
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {
        GreenfootImage bg = new GreenfootImage("level1.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Floor floor = new Floor();
        addObject(floor,306,387);
        ShortBlock shortBlock = new ShortBlock();
        addObject(shortBlock,271,309);
        ShortBlock shortBlock2 = new ShortBlock();
        addObject(shortBlock2,388,233);
        ShortBlock shortBlock3 = new ShortBlock();
        addObject(shortBlock3,541,157);
        Dusty dusty = new Dusty();
        addObject(dusty,20,363);
    }
}
