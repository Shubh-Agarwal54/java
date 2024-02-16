import java.util.Scanner;

public class linearsearch {

    //time complexity of linear search is O(n)

    public static int linearSearch(int array[], int key){
        for(int i=0; i<array.length; i++){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int number[] ={2,5,56,496,645};
        int key = 496;
        
        System.out.println(linearSearch(number, key));
    }
}
