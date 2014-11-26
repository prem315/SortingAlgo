/*
Given a sorted list with an unsorted number V in the right-most cell, 
can you write some simple code to insert V into the array so it remains sorted?

Print the array every time a value is shifted in the array until the array is fully sorted. 
The goal of this challenge is to follow the correct order of insertion sort.

Input Format
	 Two lines of input:
	 s - the size of the array
	 ar - the sorted array of integers
	 
Output Format
	 On each line, output the entire array every time an item is shifted in it.

Sample Input

5
2 4 6 8 3
Sample Output

2 4 6 8 8 
2 4 6 6 8 
2 4 4 6 8 
2 3 4 6 8 

*/
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
