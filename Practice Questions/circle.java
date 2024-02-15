import java.util.*;

public class circle {
    public static float cirfAreaCircle(float r){
        float circumference = (2*22*r)/7;
        return circumference;
    }
    public static void main(String[] args) {
        System.out.println("Enter radius:");
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        System.out.println("circumference is "+cirfAreaCircle(radius));
    }
    
}
