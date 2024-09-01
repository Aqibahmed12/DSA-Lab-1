public class task4_exercise2 {
    public static void main(String[] args) {

        int [] arr={4, 6, 2, 8, 10};
        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        int search=8;
        boolean flag=false;
        System.out.println("\nSearch Element "+search+ " in array");
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i]==search) {
                flag=true;
                System.out.println("Element "+search+" found at index "+ i);
                break;
            }
            
        }
        if (flag==false) {
            System.out.println("Element "+search+" not found in array");
        }

    }
}