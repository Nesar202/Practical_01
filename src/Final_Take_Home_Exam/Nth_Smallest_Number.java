package Final_Take_Home_Exam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Nth_Smallest_Number {

	public static void main(String[] args) {

		    Random rand = new Random();
		    int[] arr = new int[500];
		    for (int i = 0; i < arr.length; i++) {
		      arr[i] = rand.nextInt(1000);
		    }
		    Arrays.sort(arr);
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Enter the Nth smallest number: ");
		    int n = sc.nextInt();
		    System.out.println("The " + n + "th smallest number is: " + arr[n - 1]);
		  }
		}

		
	


