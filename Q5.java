package javaclassesassignment;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ComplexNumber c1 = new ComplexNumber(3,4);
ComplexNumber c2 = new ComplexNumber(5,7);
ComplexNumber temp = sum(c1,c2);
System.out.println("Sum is: " + temp.real + " + " + temp.imaginary + "i");
	}


	public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
		ComplexNumber temp = new ComplexNumber(0,0);
	temp.real = c1.real + c2.real;
	temp.imaginary = c1.imaginary + c2.imaginary;
	
	return temp;
	}
	}

	class ComplexNumber {
		int real, imaginary;
		
			ComplexNumber (int r, int i){
		this.real = r;
		this.imaginary = i;
			}
	
}
