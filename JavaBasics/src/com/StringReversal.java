package com;

import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String inputString=sc.next();
		String resultString=reverseString(inputString);
		
	}
	public static String reverseString(String s){
		StringBuilder reverse=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--){
			reverse.append(s.charAt(i));
		}
		return reverse.toString();
	}
}
