public class task2_exercise2 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0]=100;
        arr[1]=200;
        arr[2]=300;
        arr[3]=400;
        arr[4]=500;
        
        System.out.println("Before insertion");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");   
        }
        
        int insert=250;
        int p=2;
        for(int i=arr.length-1; i>p; i--){
               arr[i]=arr[i-1];
        }
        
        
        arr[p]=insert;
        System.out.println("\n\nAfter insertion");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");   
        } 
    }
}
