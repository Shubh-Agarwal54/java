import java.util.*;

public class largestnumber {

    public static int largestNumber(int array[]){
        int key = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            if (array[i]>key) {
                key=array[i];
            }
        }
        return key;
    }
    public static void main(String[] args) {
        int number[] ={4,8,45,12,78,4,02,7};
        System.out.println(largestNumber(number));
    }
    
}
