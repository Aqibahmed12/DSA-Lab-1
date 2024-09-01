public class task4 {
    public static void main(String[] args) {
        
        int[] arr={13,26,39,52,65};
        
        System.out.println("Exercise 4:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        int search=4;
        System.out.println("\n\nSearch element of "+search+" index\n");
        System.out.print("Element at the "+search+"th index is "+arr[search]);
    }
}