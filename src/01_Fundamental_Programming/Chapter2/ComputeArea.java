package Chapter2;

public class ComputeArea {
    public static void main(String[] args) {
        
        //Step1: Read in radius
        double radius = 20;
        double area;
        
        //Step2: Compute Area
        area = radius * radius * 3.14159;
        
        //Step3: Display the Area
        System.out.println("The area is: "+area);
    }
}
