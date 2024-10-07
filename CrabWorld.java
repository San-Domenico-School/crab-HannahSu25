import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepareScene();
    }
    
    /**
     * Prepare the world for the start of the program
     * This is create the initial objects and them them to the world
     */
    
    private void prepareScene()
    {
        addPlayer();
        addFood();
        addEnemy();
    }
    
    private void addPlayer()
    {
            addObject(new Crab(), 100, 100);
            // instantiate new objects
            
            
            // add them to the world
    }
    
    private void addFood()
    {
        System.out.println("Food added");
        for (int i = 0; i < 8; i++) {
            worm worm = new worm();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight()); 
            addObject(worm, x, y);
        }       
    }
    
    private void addEnemy()
    {
        System.out.println("Enemy Added");
        Lobster lobster = new Lobster();
        addObject(lobster, 8, 6);  
    }
 }



    