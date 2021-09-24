package com.aliciabrandt.javaweek3;

import java.util.Arrays;

public class Week3Java {

	public static void main(String[] args) {

// Question 1.A
		System.out.print("Q1.A: ");
		int ages[] = { 3, 9, 23, 64, 2, 8, 28, 93 };
		getDifference(ages);
// Question 1.B
		System.out.print("Q1.B: ");
		int ages2[] = { 3, 9, 23, 64, 2, 8, 28, 93, 50 };
		getDifference(ages2);
// Question 1.C
		System.out.print("Q1.C: ");
		findAverage(ages2);
// Question 2.A
		System.out.print("Q2.A: ");
		String names[] = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		averageLettersPerString(names);
// Question 2.B
		System.out.print("Q2.B: ");
		concatStrings(names);

// Question 3
		System.out.println("\nQ3: Use array[array.length-1] to get the final element of any array.");
		
// Question 4
		System.out.println("Q4: Use array[0] to get the first element of any array.");
		
// Question 5
		System.out.print("Q5: ");
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.println(Arrays.toString(nameLengths));
// Question 6
		System.out.print("Q6: ");
		int sum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sum += nameLengths[i];
		}
		System.out.println(sum);
// Question 7
		System.out.print("Q7: ");
		System.out.println(multiplyString("Hello", 3));

// Question 8
		System.out.print("Q8: ");
		String firstName = "Frasier";
		String lastName = "Crane";
		String fullName = createFullName(firstName, lastName);
		System.out.println(fullName);
// Question 9
		System.out.print("Q9: ");
		int[] arr = {1, 2, 3, 4};
			isGreaterThan100(arr);
		
// Question 10
		System.out.print("Q10: ");
		double[] doubleArr = {1.2, 1.5, 2.5, 1.4, 5.5};
		System.out.println(getAverage(doubleArr));
// Question 11
		System.out.print("Q11: ");
		double[] arr1 = {4, 8, 15, 16, 23, 42};
		double[] arr2 = {3, 4, 7, 23, 56, 72};
			oneIsGreater(arr1, arr2);
// Question 12
		System.out.print("Q12: ");
			willBuyDrink(75,1.50);
			willBuyDrink(100,20.00);
			willBuyDrink(50,7.75);
		
// Question 13
		System.out.print("Q13: ");
		// Problem: What should we do for dinner?
		// This method will take a boolean "weGotGroceries" 
		// and a double "moneyInChecking"
		// to determine whether we should cook at home or get take-out. 
			whatAboutDinner(true,300.00);
			whatAboutDinner(false,300.00);
			whatAboutDinner(true,50.0);
	}		



// * * * * *
// Question 1A and 1B
	public static void getDifference(int x[]) {
		int a = x[0];
		int b = x[x.length - 1];
		int getDifference = b - a;
		System.out.println(getDifference);
	}

// Question 1C
	public static void findAverage(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum = sum + arr[i];
		int avg = sum / arr.length;
		System.out.println(avg);
	}

// Question 2A	
	public static void averageLettersPerString(String[] names) {
		int letterCount = 0;
		int avgLetters = 0;
		for (int i = 0; i < names.length; i++) {
			letterCount += names[i].length();
		}
		avgLetters = letterCount / names.length;
		{
			System.out.println(avgLetters);
		}
	}

// Question 2B
	public static void concatStrings(String[] names) {
		// this can also be achieved without using a loop
		// String concatStr = String.join(" ", names);

		// enhanced for loop also works
		for (String name : names) {
			System.out.print(name + " ");

		}
	}
// Question 7
	public static String multiplyString(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) { 
			result += word; }
		return result;
		}
// Question 8
	public static String createFullName(String a, String b) {
		return a + " " + b;
		
	}
// Question 9	
	public static void isGreaterThan100(int[] arr) {
		int[] a = {};
		int sum = 0;
		for (int i : a)
			{sum += i;}
		if (sum > 100) 
			{System.out.println("true");}
			else {
				System.out.println("false");
			}
	}
// Question 10	
	public static double getAverage(double[] d) {
		double sum = 0.0;
		for (int i = 0; i < d.length; i++)
			sum = sum + d[i];
		double average = sum / d.length;
		return average;		
	}
// Question 11	
	private static void oneIsGreater(double[] a1, double[] a2) {
		double[] arr1 = {};
		double[] arr2 = {};
		if (getAverage(arr1) > getAverage(arr2)) { 
			System.out.println("true");}
			else System.out.println("false");;
	}	
// Question 12
	private static void willBuyDrink(double g, double h) {
		boolean isHotOutside = g > 75.0;
		double moneyInPocket = h;
		if ((isHotOutside == true) && (moneyInPocket > 10.50)) {
			System.out.println("Sure, I'll buy a drink!");
		} else {
			System.out.println("I don't think I'll buy a drink right now.");
		}
		
	}
// Question 13
	private static void whatAboutDinner(boolean r, double s) {
		if ((r == true) && (s < 100.00)) {
			System.out.println("Hay comida en la casa! Cook something at home!");
		}	else if ((r == true) && (s > 100.00)) {
			System.out.println("It's okay to get take-out tonight, but we should deinitely cook at home tomorrow.");
		}	else {
			System.out.println("Get take-out tonight and go grocery shopping tomorrow!");
		} 	
		}
		
	}

// * * * * *	

