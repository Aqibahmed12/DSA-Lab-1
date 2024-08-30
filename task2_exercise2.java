/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EURO COMPUTERS
 */
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
