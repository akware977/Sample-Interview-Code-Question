package com.amcat;

/*
 * Problem Statement :-
 * While sending a message over network some char gone missing. Write a code to 
 * search those char in string. 
 * */

/**
 * Class Auther:- @Akshay Ware
 * Date :- 16/11/2019*/
public class FindMissigChar {

	
	public static void main(String[] args) {
		String sent = "abcde";
		String received = "abc";
		
		findChar(sent, received);
	}

	private static void findChar(String sent, String received) {
		  
		//comparison in existing char
		for(int i=0; i<received.length(); i++) {
			
			if( sent.charAt(i) != received.charAt(i)) {
				System.out.println("Char foud Missig is:" +sent.charAt(i));
			}
		}
		
		//extra char
		for(int k = received.length(); k< sent.length(); k++) {
			System.out.println("Extra charcter foud missing is:" +sent.charAt(k));
		}
		
	}

}
