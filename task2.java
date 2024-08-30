
public class task2 {
    public static void main(String[] args) {
        
        int[] arr = new int[6];
        arr[0]=12;
        arr[1]=24;
        arr[2]=36;
        arr[3]=48;
        arr[4]=60;
        
        System.out.println("Before insertion");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");   
        }
        
        int insert=6;
        for(int i=arr.length-1; i>0; i--){
               arr[i]=arr[i-1];
        }
        
        arr[0]=insert;
        System.out.println("\n\nAfter insertion");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");   
        }    
    }
}
