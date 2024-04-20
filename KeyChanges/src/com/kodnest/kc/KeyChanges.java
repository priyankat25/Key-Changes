package com.kodnest.kc;

public class KeyChanges {
	public static void main(String[] args) {
		String s = "aAabcD";
		int n = s.length();
		
		int count = 0;
		for(int i=1; i<s.length()-1; i++) {
			if(n == 6) {
				char ch = s.charAt(i-1);
				char ch1 = s.charAt(i);
				int res = Math.abs((int)ch-(int)ch1);
				if(res == 32) {
					count++;
				}
			}
		}
		System.out.println("Number of key Changes: " +count);
	}
}