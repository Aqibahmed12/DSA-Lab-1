public class task3 {
    public static void main(String[] args) {
        
        int[] arr = {8,16,24,32,40};

        System.out.println("Before Deletion");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");   
        }
        
        int p=2;
        for(int i=p; i<arr.length-1;  i++){
               arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
        
        
        System.out.println("\n\nAfter deletion");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");   
        } 
    }
}
