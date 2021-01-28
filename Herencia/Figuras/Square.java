import java.awt.*;

/**
 * A square that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */

public class Square extends Figura
{
    private int size;
    

    /**
     * Create a new square at default position with default color.
     */
    public Square()
    {
        super();
        size = 60;
        xPosition(310); 
        yPosition(120);
        color("red");
       
    }
    
     /**
     * area 
     */
    public double getArea()
    {
        double area = size*size;
        return area; 
    }

    /**
     * Make this square visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        super.makeVisible();
        draw();
    }
    
    /**
     * Make this square invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
       super.makeInvisible();
       draw(); 
    }
    
    /**
     * Move the square a few pixels to the right.
     */
    public void moveRight()
    {
        super.moveRight();
    }

    /**
     * Move the square a few pixels to the left.
     */
    public void moveLeft()
    {
        super.moveLeft();
    }

    /**
     * Move the square a few pixels up.
     */
    public void moveUp()
    {
        super.moveUp();
    }

    /**
     * Move the square a few pixels down.
     */
    public void moveDown()
    {
        super.moveDown();
    }

    /**
     * Move the square horizontally by 'distance' pixels.
     */
    public void moveHorizontal(int distance)
    {
        super.moveHorizontal(distance);
        draw();
    }

    /**
     * Move the square vertically by 'distance' pixels.
     */
    public void moveVertical(int distance)
    {
        super.moveVertical(distance);
        draw();
    }

    /**
     * Slowly move the square horizontally by 'distance' pixels.
     */
    public void slowMoveHorizontal(int distance)
    {
        super.slowMoveHorizontal(distance);
    }

    /**
     * Slowly move the square vertically by 'distance' pixels.
     */
    public void slowMoveVertical(int distance)
    {
        super.slowMoveVertical(distance);
    }

    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    public void changeSize(int newSize)
    {
        super.erase();
        size = newSize;
        draw();
    }

    /**
     * Change the color. Valid colors are "red", "yellow", "blue", "green",
     * "magenta" and "black".
     */
    public void changeColor(String newColor)
    {
        super.changeColor(newColor);
        draw();
    }

    /**
     * Draw the square with current specifications on screen.
     */
    private void draw()
    {
                
        if(super.getvisible()) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, super.getcolor(),
                        new Rectangle(super.getxPosition(), super.getyPosition(), size, size));
            canvas.wait(10);
        }
    }

  
}
