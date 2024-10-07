import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 * @author HannahSu
 * @version 10/6/2024 18:47
 */
public class Crab extends Actor
{
    // Always place fields first in the class.
    private int speed = 5;
    private int turnSpeed = 5;
    
     // After the fields place the behaviors
/**
     * The act method is called by Greenfoot each frame about 68 times per second 
     * whenever the 'Run"Button gets pressed in the Action window.
     */
public void act()
    {
        move();
        turnAtEdge();
        checkForCollision();     
    }


    public void move() 
    {
        if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w")) 
        {
            move(speed);
        }

        if (Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s")) 
        {
            move(-speed);
        }

        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")) 
        {
            turn(-turnSpeed);
        }

        if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")) 
        {
            turn(turnSpeed);
        }

        if (Greenfoot.isKeyDown("space")) 
        {
            speed++;
        }

        if (Greenfoot.isKeyDown("shift")) 
        {
            if (speed > 1) {
                speed--;
            }
        }
    }

    public void turnAtEdge()
        {
            if (isAtEdge()) {
                turn(17);  
            }
        }
    
    public void checkForCollision() 
    {    
        // Check for collision with Lobster
        if (isTouching(Lobster.class)) 
        {
            Greenfoot.playSound("au.wav");  
            Greenfoot.stop(); 
            getWorld().showText("You Lose!", getWorld().getWidth() / 2,getWorld().getHeight() / 2);
        }

        // Check for collision with Worm
        if (isTouching(worm.class)) 
        {
            removeTouching(worm.class); 
            Greenfoot.playSound("slurp.wav");  

            if (getWorld().getObjects(worm.class).isEmpty()) {
                Greenfoot.playSound("fanfare.wav");  
                Greenfoot.stop();  
                getWorld().showText("You Won!", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            }
        }
    }
}
            
    
