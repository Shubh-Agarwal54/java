import java.util.*;

public class oddsum {

    public static void oddSumN(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        System.out.println("sum of odd number from 1 to " +(n*n));
    }

    public static void main(String[] args) {
        oddSumN();
    }
}
