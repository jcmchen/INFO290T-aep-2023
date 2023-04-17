package edu.berkeley.aep;

public class Rectangle {

    //static factory method : static means create on class, not on object(create new instance of class)
    public static Rectangle createSquare(int side){
        return new Rectangle(side, side);

    }

    private final int width;
    private final int length;

    public Rectangle(int length, int width, int color){
        this(length, width);
        //this.color = color;
    }
    //another constructor
    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }

    public int area(){
        return width * length;
    }



}