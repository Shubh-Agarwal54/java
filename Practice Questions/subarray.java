public class subarray {

    public static void subArray(int array[]){
        //total number of sub array is n(n+1)/2
        for(int i=0;i<array.length;i++){
            for(int j=i;j<=array.length;j++){
                for(int k=i;k<j;k++){
                    System.out.print(array[k] +" ");
                }

                System.out.print("     ");

            }
            System.err.println();
        }
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5};

        subArray(number);
    }
    
}
