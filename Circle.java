import java.util.*;
public class Circle {
    public static float Circumference(float r){
        float c=0;
        float a=3.14F;
        c= 2 * a * r;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius");
        float r=sc.nextFloat();
        float result;
        result= (Circumference(r));
            System.out.println("The circumference of the circle is "+result);


    }
}