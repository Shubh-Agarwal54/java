import java.util.Scanner;

public class arrayasagg {

    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]*2;
            System.out.println(marks[i]);
        }
        return;
    }
    public static void main(String[] args) {
        int marks[] = new int [5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<marks.length;i++){
            marks[i] = sc.nextInt();
        }
        update(marks);

    }
    
}
