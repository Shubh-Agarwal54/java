public class arraypairs {

    public static void pairsInArray(int array[]){
        //time complexity of pairs in array is O(n^2)
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                System.out.print("("+array[i] +"," +array[j] +")");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        int numbers[] = {0,1,2,3,4,5};
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]);
        }
        System.err.println();
        pairsInArray(numbers);
    }
    
}
