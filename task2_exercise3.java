/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EURO COMPUTERS
 */
public class task2_exercise3 {
    public static void main(String[] args) {
        
        int[] arr = new int[6];
        arr[0]=3;
        arr[1]=6;
        arr[2]=9;
        arr[3]=12;
        arr[4]=15;
        
        System.out.println("Before insertion");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");   
        }

        int insert=18;
        arr[5]=insert;
        System.out.println("\n\nAfter insertion");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");   
        } 
    }
}
