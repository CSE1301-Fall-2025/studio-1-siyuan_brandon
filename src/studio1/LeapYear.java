package studio1;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Give us the year you want to know if it is a Leap Year");
        int Year = in.nextInt();

        boolean a = ( Year % 4 == 0 );
        boolean b = ( Year % 100 == 0);
        boolean c = ( Year % 400 == 0);

        boolean d = ( a || b );
        boolean f = ( b && c );

        boolean g = ( d || f );

        System.out.println(Year + "is a Leap Year " + g);

}
}
