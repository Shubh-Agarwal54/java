import java.util.Scanner;

public class vote {

    public static void isvote(int age){
        if(age >17){
            System.out.println("Eligible for vote ");
        }
        else{
            System.out.println("Not eligible for vote");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter age");
        Scanner sc =new Scanner(System.in);
        int age = sc.nextInt();
        isvote(age);
    }
    
}
