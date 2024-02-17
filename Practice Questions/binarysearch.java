public class binarysearch {

    public static int binarySearch(int arrray[], int key){

        int start=0, end= arrray.length-1 , mid;

        while (start<=end) {
            mid = (start+end)/2;

            if(arrray[mid] == key){
                return mid;
            }
            if(arrray[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            
        }
        return -1;

    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key =1;
        System.out.println(binarySearch(numbers, key));
    }
    
}
