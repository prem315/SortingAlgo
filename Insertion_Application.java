
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prem
 */
public class Insertion_Application {
    public static void insertionSort(int[] ar){
        int v = ar[ar.length-1];
        int key = ar.length-1;
        while(ar[key]>=v && ar[key-1]>=v){
            ar[key]=ar[key-1];
            key--;
            for(int i=0;i<ar.length;i++){
                System.out.print(ar[i]+" ");
            }
            System.out.println();
        }
        ar[key]=v;
        for(int i=0;i<ar.length;i++){
                System.out.print(ar[i]+" ");
            }
    }
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++)
	arr[i]=in.nextInt();
	insertionSort(arr);
    }
}
