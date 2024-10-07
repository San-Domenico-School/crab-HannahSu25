import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class defines a lobster. Lobster likes to eat crab.
 * @author HannahSu
 * @version 10/6/2024 18:47
 */
public class Lobster extends Actor
{   
    private int speed = 4;

    public void act()
    {
        move(speed);
        turnAtEdge();
    }
    
    /**
     * Check if the lobster is at the edge of the world. If it is, the lobster will turn.
     */
    public void turnAtEdge()
    {
        if (isAtEdge()) {
            turn(17);  
        }
    }
}