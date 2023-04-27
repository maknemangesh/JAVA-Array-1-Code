// Write a program , take 10 input from the user and print only elements that are divisible by 5
// input 10 2 3 4 6 20 25
// output: 10 20 25

import java.util.*;

class ArrayDemo{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of array");

		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter the elements in the array");

		for(int i=0;i<arr.length;i++){

			arr[i]=sc.nextInt();

		}
		System.out.println("The elements is divisible by 5 in the array:");

		for(int i=0;i<arr.length;i++){

			if(arr[i]%5==0){

				System.out.println(arr[i]+ " ");
			}
		}
		System.out.println();
	}
}
		

