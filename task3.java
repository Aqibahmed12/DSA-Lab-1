public class task3 {
    public static void main(String[] args) {
        
        int[] arr = new int[6];
        arr[0]=18;
        arr[1]=16;
        arr[2]=24;
        arr[3]=32;
        arr[4]=40;
        
        System.out.println("Before insertion");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");   
        }
        
        int p=2;
        for(int i=arr.length-1; i>p; i--){
               arr[i]=arr[i-1];
        }
        
        int insert=250;
        arr[0]=insert;
        System.out.println("\n\nAfter insertion");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");   
        } 
    }
}
