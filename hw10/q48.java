package hw10;

public class q48 {
	public int drive(long car) {return 2;}
	public int drive(double car) {return 3;}
	public int drive(int car) {return 2;}
	public int drive(short car) {return 3;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte value=5;
		System.out.print(new q48().drive(value));
	}

}
