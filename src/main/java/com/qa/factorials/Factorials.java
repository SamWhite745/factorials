package com.qa.factorials;

public class Factorials {
	private int num;
	
	public Factorials(int num) {
		this.num = num;
	}
	
	public String reverseFactorial() {
		if (isFactorial() == 0) {
			return "Not a factorial";
		} else return isFactorial() + "!";
	}
		
	private int isFactorial() {
		int x = 1;
		int f = factorial(x);
		
		while (f < num) {
			f = factorial(x);
			if (f == num) {
				return x;
			} else {
				x++;
			}
		}
		
		return 0;

	}
	
	
	
	
	
	
	
	public int factorial(int number) {
		int fact = 1;
		
		for (int i = 1; i <= number; i++) {
			fact = fact*i;
		}
		
		return fact;
	}
}
