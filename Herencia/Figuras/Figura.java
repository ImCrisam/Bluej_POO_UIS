
/**
 * Write a description of class figura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract  class Figura
{
    // instance variables - replace the example below with your own
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean visible;
    /**
     * Constructor for objects of class figura
     */
    public Figura()
    {
        visible = false; 
    }
    
    /**
     * mutador 
     */
    public void xPosition(int x)
    {
        xPosition = x; 
    }
    
     /**
     * mutador 
     */
    public void yPosition(int y)
    {
        yPosition =y; 
    }
    
     /**
     * mutador 
     */
    public void color(String col)
    {
        color = col; 
    }
    
     /**
     * mutador 
     */
    public void visible(boolean vis)
    {
        visible =vis; 
    }
    
    /**
     * get
     */
    public int getxPosition()
    {
        return xPosition;
    }
    /**
     * get
     */
    public int getyPosition()
    {
        return yPosition;
    }
    /**
     * get
     */
    public String getcolor()
    {
        return color;
    }
    /**
     * get
     */
    public boolean getvisible()
    {
        return visible;
    }
    
    /**
     * area
     */
    protected abstract double getArea();
    
    
    /**
     * Make this circle visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        visible = true;
    }
    
     /**
     * Make this circle invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
        erase();
        visible = false;
    }
    
    /**
     * Move the circle a few pixels to the right.
     */
    public void moveRight()
    {
        moveHorizontal(20);
    }
    
    /**
     * Move the circle a few pixels to the left.
     */
    public void moveLeft()
    {
        moveHorizontal(-20);
    }
    
        /**
     * Move the circle a few pixels up.
     */
    public void moveUp()
    {
        moveVertical(-20);
    }

    /**
     * Move the circle a few pixels down.
     */
    public void moveDown()
    {
        moveVertical(20);
    }

    /**
     * Move the circle horizontally by 'distance' pixels.
     */
    public void moveHorizontal(int distance)
    {
        erase();
        xPosition += distance;
        
    }

    /**
     * Move the circle vertically by 'distance' pixels.
     */
    public void moveVertical(int distance)
    {
        erase();
        yPosition += distance;
        
    }

    /**
     * Slowly move the circle horizontally by 'distance' pixels.
     */
    public void slowMoveHorizontal(int distance)
    {
        int delta;

        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            xPosition += delta;
            
        }
    }

    /**
     * Slowly move the circle vertically by 'distance' pixels.
     */
    public void slowMoveVertical(int distance)
    {
        int delta;

        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            yPosition += delta;
            
        }
    }
    
    /**
     * Change the color. Valid colors are "red", "yellow", "blue", "green",
     * "magenta" and "black".
     */
    public void changeColor(String newColor)
    {
        color = newColor;
        
    }
    /**
     * Erase the square on screen.
     */
    public void erase()
    {
        if(visible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
    
}
