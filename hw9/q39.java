package hw9;

public class q39 {

	public static void main(String[] args) {
		String happy = " : ) - ( : ";
		String really =happy.trim ();
		String question = happy.substring(1, happy.length()-1);
		System.out.print(really.contentEquals(question));
	}

}
