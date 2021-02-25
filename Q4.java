package javaclassesassignment;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
Area r = new Area();

System.out.println("Enter lenght :");
int l = s.nextInt();
System.out.println("Enter breath :");
int b = s.nextInt();
r.insert (l,b);

	r.returnArea();
		
		s.close();
}
}

class Area {
		int lenght;
		int breath;
		

		void insert (int l, int b ) {
			lenght = l;
			breath = b;
		}
	void returnArea() {System.out.println("Area : " + lenght*breath); }

	}


