package OOP_Class.Week3;
/*
Implement a class named Rectangle to represent a rectangle. The class contains:
        ● Two double data fields named width and height that specify the width and
        height of the rectangle. The default values are 1 for both width and height.
        ● A no-arg constructor that creates a default rectangle.
        ● A constructor that creates a rectangle with the specified width and height.
        ● A method named getArea() that returns the area of this rectangle.
        ● A method named getPerimeter() that returns the perimeter.
        Write a test program that creates two Rectangle objects—one with width 4 and height 40 and the other with width 3.5 and height 35.9.
        Display the width, height, area, and perimeter of each rectangle in this order.

 */
class Rectangle {
    double width;
    double height;

    //A no-arg constructor that creates a default rectangle.
    Rectangle (){
        width = 1;
        height =1;
    }

    // A constructor that creates a rectangle with the specified width and height.
    Rectangle (double x, double y) { ;
        width = x;
        height = y;
    }

    //A method named getArea() that returns the area of this rectangle.
    /*public double getArea (double x, double y){
        return (width*height);
    }
     */
    double getArea(){
        return this.height * this.width;
    }

    //A method named getPerimeter() that returns the perimeter.
    double getPerimeter(){
        return 2*(this.width+this.height);
    }
}
class RectangleTest {
    public static void main(String[] args) {

        //Rectangle 1
        Rectangle Rectangle1  = new Rectangle(4,40);
        System.out.println("The Area of the Rectangle 1 is: ");
        System.out.printf("%1.2f\n",Rectangle1.getArea());
        System.out.println("The Perimeter of the Rectangle 1 is: ");
        System.out.printf("%1.2f\n",Rectangle1.getPerimeter());
        System.out.println("-----*****-----");

        //Rectangle 2
        Rectangle Rectangle2 = new Rectangle(3.5,35.9);
        System.out.println("The Area of the Rectangle 2 is: ");
        System.out.printf("%1.2f\n",Rectangle2.getArea());
        System.out.println("The Perimeter of the Rectangle 2 is: ");
        System.out.printf("%1.2f",Rectangle2.getPerimeter());
    }
}