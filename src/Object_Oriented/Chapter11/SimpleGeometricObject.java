package Object_Oriented.Chapter11;

import java.util.Date;

class SimpleGeometricObject {
    // Data fields
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    // Constructor
    public SimpleGeometricObject(){
        dateCreated = new java.util.Date();
    }

    public SimpleGeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        dateCreated = new java.util.Date();
    }

    // Methods
    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public boolean isFilled() {
        return filled;

    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "SimpleGeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }
}

class SimpleGeometricObjectTest{
    public static void main(String[] args) {
        SimpleGeometricObject Rectangle = new SimpleGeometricObject("blue",true);

        System.out.println(Rectangle.toString());
        System.out.println("Ez +25 MMR");
    }
}