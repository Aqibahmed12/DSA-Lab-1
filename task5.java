public class task5{
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};
        
        System.out.println("Array Before : ");

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");  
        }

        System.out.println("\n\nArray after reverse : ");

        for (int i=4; i>=0; i--) {
            System.out.print(arr[i]+" ");  
        }
    }
}