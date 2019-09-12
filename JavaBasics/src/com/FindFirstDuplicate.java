package com;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindFirstDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		int index=firstDuplicate(input);
	}
	
	public static int firstDuplicate(String s){
		
		Set<Character> stringSet=new HashSet<>();
		for(int i=0;i<s.length();i++){
			
			if(stringSet.contains(s.charAt(i)))
				return i;
			else stringSet.add(s.charAt(i));
		}
		return -1;
	}

}
