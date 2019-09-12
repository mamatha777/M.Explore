package com;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FindTopKLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int noOfelements=sc.nextInt();
		int[] inputarray=new int[noOfelements];
		System.out.print("Enter array elements : ");
		for(int i=0;i<noOfelements;i++){
			inputarray[i]=sc.nextInt();
		}
		System.out.print("Enter k : ");
		int key=sc.nextInt();
		List<Integer> resultList=topKLargest(inputarray,key);
		System.out.println(resultList);
		
		
		
	}
	public static List<Integer> topKLargest(int[] arr,int k){
		
		TreeSet<Integer> sortedlist=new TreeSet<>();
		
		for(int i:arr){
			sortedlist.add(i);
			if(sortedlist.size()>k)
				sortedlist.pollFirst();
		}
		
			
		
		return sortedlist.stream().collect(Collectors.toList());
	}

}
