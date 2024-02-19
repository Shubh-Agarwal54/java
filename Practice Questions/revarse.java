import java.util.*;

public class revarse {
    public static void arrarReverse(int arrray[]){

        int first =0,last = arrray.length - 1;
        while (first<last) {
            int temp = arrray[last];
            arrray[last] = arrray[first];
            arrray[first] = temp;

            first++;
            last--;
        }
        for(int i=0;i<arrray.length; i++){
            System.out.print(arrray[i]);
        }
        
    }
    public static void main(String[] args) {
        int numbers[] = {1,7,8,4,2,6,8,2,3,4,9,6,0};
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]);
        }
        System.out.println();
        arrarReverse(numbers);
    }
    
}