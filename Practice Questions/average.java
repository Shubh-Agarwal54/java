import java.util.*;

public class average {

    public static float averageNumber(float a, float b, float c){
        float avgn = (a + b + c)/3;
        return avgn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float result =averageNumber(a, b, c);
        System.out.println(result);

    }
    
}
