import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dusty here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dusty extends Characters
{
    private GreenfootImage dusty_r1, dusty_r2, dusty_r3, dusty_l1, dusty_l2, dusty_l3;
    private int speed = 5;
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpStrength = 13;
    
    enum WarpDirection
    {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
    
    public Dusty()
    {
        dusty_r1 = new GreenfootImage("dusty_right1.png");
        dusty_r2 = new GreenfootImage("dusty_right2.png");
        dusty_r3 = new GreenfootImage("dusty_right3.png");
        dusty_l1 = new GreenfootImage("dusty_left1.png");
        dusty_l2 = new GreenfootImage("dusty_left2.png");
        dusty_l3 = new GreenfootImage("dusty_left3.png");
    }
    
    
    /**
     * Act - do whatever the Dusty wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        checkKeys();
        checkFall();
    }
    
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("left")){
            goLeft();
        }
        else if (Greenfoot.isKeyDown("right")){
            goRight();
        }
        else if (Greenfoot.isKeyDown("up")){
            jump();
        }
    }
    
    public void goLeft()
    {
        setLocation(getX() - speed, getY());
        if (getImage().equals(dusty_l1)){
            setImage(dusty_l2);
        }
        else if (getImage().equals(dusty_l2)){
            setImage(dusty_l3);
        }
        else{
            setImage(dusty_l1);
        }
    }
    
    public void goRight()
    {
        setLocation(getX() + speed, getY());
        if (getImage().equals(dusty_r1)){
            setImage(dusty_r2);
        }
        else if (getImage().equals(dusty_r2)){
            setImage(dusty_r3);
        }
        else{
            setImage(dusty_r1);
        }
    }
    
    public void jump()
    {
        for (int x=1; x<=jumpStrength; x++){
            setLocation(getX(), getY() - 1);
        }
        if ((getImage().equals(dusty_l1))||(getImage().equals(dusty_l2))||(getImage().equals(dusty_l3))){
            setImage(dusty_l3);
        }
        else {
            setImage(dusty_r3);
        }
    }
    
    public void goJump()
    {
        vSpeed = -jumpStrength;
        fall();
        if ((getImage().equals(dusty_l1))||(getImage().equals(dusty_l2))||(getImage().equals(dusty_l3))){
            setImage(dusty_l3);
        }
        else {
            setImage(dusty_r3);
        }
    }
    
    public void fall(){
        setLocation(getX(), getY() + vSpeed);
        vSpeed += acceleration;
    }
    
    public void checkFall()
    {
        if(onGround()||onShortBlock()||onLongBlock()){
            vSpeed = 0;
        }
        else {
            fall();
        }
    }
    
    public void checkAbove()
    {

    }
    
    public boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, 30, Floor.class);
        return under != null;
    }
    
    public boolean onShortBlock()
    {
        Actor under = getOneObjectAtOffset(0, 30, ShortBlock.class);
        return under != null;
    }
    
    public boolean onLongBlock()
    {
        Actor under = getOneObjectAtOffset(0, 30, LongBlock.class);
        return under != null;
    }
}