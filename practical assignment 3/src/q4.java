import com.sun.javaws.Main;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        AreaOfRectangle a = new AreaOfRectangle();
        a.area();
        a.dispResult();
        a.concrete();
    }
}
abstract class P {
    abstract void area();
    void concrete() {
        System.out.println("This is a concrete method in abstract class.");
    }
}
class AreaOfRectangle extends P {
    int length,width;
    int area;
    void area() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        length = sc.nextInt();
        System.out.print("Enter width : ");
        width = sc.nextInt();
        area = length * width;
        sc.close();
    }
    void dispResult() {
        System.out.println("The area of rectangle is : " + area);
    }
}

// This is not valid.

// class AreaOfTriangle extends A {
//     double area;
//     void dispResult(double b,double h) {
//         area = 0.5 * b * h;
//         System.out.println("The area of triangle is : " + area);
//     }
// }