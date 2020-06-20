package hw10;

public class q73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bike1="speedy";
		String bike2=new String("speedy");
		boolean test1 = bike1==bike2;
		boolean test2=bike1.equals(bike2);
		System.out.println(test1+"  "+test2);
	}

}
