/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prem
 */
public class SelectionSort {
    
    public static int[] sort(int[] a){
        
        int n = a.length-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    //swap
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
        
    }
/*    
    public void swap(int[] a,int p, int q){
        int temp = a[p];
        a[p] = a[q];
        a[q] = temp;
    }
  */  
    public static void main(String ar[]){
        int[] a = {5,6,2,4,9,10,23,15,7,0};
        int[] b = sort(a);
        System.out.println("Sorted Array");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
