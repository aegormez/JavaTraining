package hw8;

public class q17 {
	public int travel() throws Exception {return 4;};
	public static void main(String[] args) throws Exception {
		try {
			System.out.print(new q17().travel());
		} catch (Exception e) {
			System.out.print(8);
		}

	}

}
class CapsizedException extends Exception {}
class Transport{
	public int travel() throws CapsizedException{return 2;}
}
