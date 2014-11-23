/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prem
 */
public class InsertionSort {
    
    public static int[] sort(int[] a){
        for(int j=1;j<a.length;j++){
            int key = a[j];
            int temp = j - 1;
            while((temp > -1)&&(a[temp] > key)){
                a[temp+1] = a[temp];
                temp--;
            }
            a[temp+1] = key;
        }
        return a;
    }
    
    public static void main(String ar[]){
        int[] a = {5,6,2,4,9,10,23,15,7,0};
        int[] b = sort(a);
        System.out.println("Sorted Array");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
