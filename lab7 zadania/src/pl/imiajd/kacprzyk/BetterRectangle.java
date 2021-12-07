package pl.imiajd.kacprzyk;

public class BetterRectangle extends java.awt.Rectangle {

    public BetterRectangle(int x,int y,int width,int height)
    {
        super(x,y,width,height);
        this.setLocation(x,y);
        this.setSize(width,height);


    }
    public int getPerimeter()
    {
        return this.width*this.height;
    }
    public int getArea()
    {
        return 2*width+2*height;
    }
}
