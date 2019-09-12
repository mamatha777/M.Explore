package com;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SumOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int noOfelements=sc.nextInt();
		int[] inputarray=new int[noOfelements];
		System.out.print("Enter array elements : ");
		for(int i=0;i<noOfelements;i++){
			inputarray[i]=sc.nextInt();
		}
		System.out.print("Enter Key : ");
		int key=sc.nextInt();
		boolean status=twoSum(inputarray,key);
		
		
	}
	public static boolean twoSum(int[] arr,int key){
		
		Set<Integer> sumset=new HashSet<>();
		
		for(int i:arr){
			
			if(sumset.contains(i))
				return true;
			else sumset.add(key-i);
		}
		
		return false;
	}

}
