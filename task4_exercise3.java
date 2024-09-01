import java.util.Arrays;
public class task4_exercise3 {
    public static void main(String[] args) {

        int arr[]={11, 22, 33, 44, 55};

        int left = 0;
        int right =arr.length-1;
        int middle;

        int search=33;

        boolean flag=false;

        Arrays.sort(arr);

        while(left <= right){
            middle=left+(right-left)/2;

            if(arr[middle]==search){
                flag=true;
                System.out.println("Element "+search+" found at index "+middle);
                break;
            }
            if (arr[middle] < search) {
                left=middle+1;
            }
            else{
                right=middle-1;
            }
        }
        if (flag==false) {
            System.err.println("Element "+search +" not found in array");
        }

    }
}