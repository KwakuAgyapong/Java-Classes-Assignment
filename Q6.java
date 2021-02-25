package javaclassesassignment;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
room room1;
room room2;

room1 = new room();
room2 = new room();

room1.setdata(1,"master",13.5,"Samsung");
room2.setdata(2,"living",30.55,"LG");

room1.display();
room2.display();
	}
}

class room {
	int roomno;
	String roomtype;
	double roomarea;
	String ACmachine;
	
	void setdata (int rn, String rt, double ra, String aC) {
		roomno = rn;
		roomtype = rt;
		roomarea = ra;
		ACmachine = aC;
	}
		
void display() {System.out.println("Room : " + roomno + " " + roomtype + " " + roomarea +"sq"  + " " +  ACmachine);}

	}

	
	
