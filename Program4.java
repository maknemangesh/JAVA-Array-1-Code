//Write a program to take 7 characters as input ,print only vowels from the array 
//input : a b c d p e
//output: a e
//


import java.util.*;

class ArrayDemo{

	public static void main(String[] args){

		int sum=0;

		Scanner br=new Scanner(System.in);

		System.out.println("Enter the size of  array");

		int size=br.nextInt();

		char carr[]=new char[size];

		System.out.println("Enter the array elements");

		for(int i=0;i<size;i++){

			carr[i]=br.next().charAt(0);
		}
		for(int i=0;i<carr.length;i++){

			if(carr[i]=='a'||carr[i]=='e'||carr[i]=='i'||carr[i]=='o'||carr[i]=='u'||carr[i]=='A'||carr[i]=='E'||carr[i]=='I'||carr[i]=='O'||carr[i]=='U'){
			
				System.out.print(carr[i]+" ");

			}
		}

		System.out.println();
	}
}

