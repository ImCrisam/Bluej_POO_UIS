import java.awt.*;
import java.awt.geom.*;

/**
 * A circle that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */

public  class Circle extends Figura
{
    private int diameter;
   
    
    /**
     * Create a new circle at default position with default color.
     */
    public Circle()
    {
        super();
        diameter = 68;
        xPosition(230);
        yPosition(90);
        color ("blue");
               
    }
    
    /**
     * area 
     */
    public double getArea()
    {
        double area = 3.1415*(diameter/2)*(diameter/2);
        return area; 
    }

    /**
     * Make this circle visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        super.makeVisible();
        draw();
    }
    
    /**
     * Make this circle invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
        super.makeInvisible();
        draw(); 
    }
    
    /**
     * Move the circle a few pixels to the right.
     */
    public void moveRight()
    {
        super.moveRight();
    }

    /**
     * Move the circle a few pixels to the left.
     */
    public void moveLeft()
    {
       super.moveLeft();
    }

    /**
     * Move the circle a few pixels up.
     */
    public void moveUp()
    {
        super.moveUp();
    }

    /**
     * Move the circle a few pixels down.
     */
    public void moveDown()
    {
        super.moveDown();
    }

    /**
     * Move the circle horizontally by 'distance' pixels.
     */
    public void moveHorizontal(int distance)
    {
        super.moveHorizontal(distance);
        draw();
    }

    /**
     * Move the circle vertically by 'distance' pixels.
     */
    public void moveVertical(int distance)
    {
        super.moveVertical(distance);;
        draw();
    }

    /**
     * Slowly move the circle horizontally by 'distance' pixels.
     */
    public void slowMoveHorizontal(int distance)
    {
        super.slowMoveHorizontal(distance);
    }

    /**
     * Slowly move the circle vertically by 'distance' pixels.
     */
    public void slowMoveVertical(int distance)
    {
       super.slowMoveVertical(distance);
    }

    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    public void changeSize(int newDiameter)
    {
        super.erase();
        diameter = newDiameter;
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
     * Draw the circle with current specifications on screen.
     */
    private void draw()
    {
        if(super.getvisible()) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this,super.getcolor(), new Ellipse2D.Double(super.getxPosition(), super.getyPosition(), 
                                                          diameter, diameter));
            canvas.wait(10);
        }
    }

   
}
