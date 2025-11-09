// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        double radius, area, circumference;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter radius of a circle");
        radius=sc.nextDouble();
        System.out.println("radius of circle=\t"+radius);
        //area of circlegit
        area=(22/7)*Math.pow(radius,2);
        System.out.println("area of circle is=\t"+area);
        
        //circumfarence
        circumference=2*(22/7)*radius;
        System.out.println("Circumfarence of a circle=\t"+circumference);
        
        sc.close();
    }
}