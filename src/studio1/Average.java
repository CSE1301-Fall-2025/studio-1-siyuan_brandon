package studio1;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insert a value");
		double First = in.nextDouble();

        System.out.println("Insert a value");
        double Second = in.nextDouble();

        double Average = (First + Second)/2;
        
        System.out.println(Average);
    }
}