package com.qa.factorials;

import java.util.ArrayList;
import java.util.*;

public class Runner {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();

		for (int i = 1; i <= 100; i++) {
			nums.add(i);
		}
		int remove = 10;
		nums.remove(remove - 1);
		
		
		System.out.println(nums);
		ArrayList<String> strNums = new ArrayList<String>();
		
		for (Integer num : nums) {
			strNums.add(place(num));
		}
			
		System.out.println(strNums);

	}
	
	public static String place (int num) {
		if (num < 20) {
			switch(num) {
			case 1: return "1st";
			case 2: return "2nd";
			case 3: return "3rd";
			case 4: return "4th";
			case 5: return "5th";
			case 6: return "6th";
			case 7: return "7th";
			case 8: return "8th";
			case 9: return "9th";
			case 10: return "10th";
			case 11: return "11th";
			case 12: return "12th";
			case 13: return "13th";
			case 14: return "14th";
			case 15: return "15th";
			case 16: return "16th";
			case 17: return "17th";
			case 18: return "18th";
			case 19: return "19th";	
			default : return "";
			}
		} else {
			return num + unitToPlace(num);			
		}
	}
	public static String unitToPlace (int num) {
		String strNum = Integer.toString(num);
		char numChar = strNum.charAt(1);
		switch(numChar) {
		case '1': return "st";
		case '2': return "nd";
		case '3': return "rd";
		case '4': return "th";
		case '5': return "th";
		case '6': return "th";
		case '7': return "th";
		case '8': return "th";
		case '9': return "th";
		case '0': return "th";
		}
		
		return "";
	}
	
}
