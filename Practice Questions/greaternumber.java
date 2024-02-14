import java.util.*;

public class greaternumber {

    public static int greaterNumber(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter 1st number ");
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println("Enter 2nd number ");
        int b= sc.nextInt();
        System.out.println("greater of those two is "+greaterNumber(a, b));

    }
}