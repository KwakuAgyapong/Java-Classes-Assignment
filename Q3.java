package javaclassesassignment;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Rectangle r = new Rectangle();	
	Rectangle r1 = new Rectangle();
	
	r.insert (4,5);
	r1.insert (5,8);
	
	r.calculateArea();
	r1.calculateArea();
	}
}	
		class Rectangle {
	int lenght; 
	int breath;
	
	void insert (int l, int b ) {
		lenght = l;
		breath = b;	
	}
void calculateArea() {System.out.println("Area : " + lenght*breath); }

}
	
class Rectangle1 {
	
}

	

