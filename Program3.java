// Write a program to take size of array from user and also take integer elements from user print product of odd index only.
// array:  1 2 3 4 5 6
// output: 1*3*5=15


import java.util.*;
class ArrayDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements in the array");
		for(int i= 0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int prod=1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==1){
			prod=prod*arr[i];
			}
		}
		System.out.println("Enter The product of odd elements only:"+prod);
	}
}

