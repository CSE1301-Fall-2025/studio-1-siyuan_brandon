package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt(); 
		System.out.println("Value for y?");
		int y = in.nextInt(); 
		System.out.println("Value for z?");
		int z = in.nextInt(); 
		boolean b = (x < y);
		boolean c = (y < z); 
		boolean t = (x > y);
		boolean p = (y > z);
		boolean d = (b && c);
		boolean e = (t && p);
		boolean isorded = (d || e);
		System.out.println(isorded);
	}

}

