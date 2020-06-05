package hw8;

public class q20 extends Element {
	public int getSymbol() {return 8;}
	public static void main(String[] args) {
		try {
			System.out.print(getSymbol());
		} catch{
			System.out.print("Unable to read data!!");
		}
	}

}
class GasException extends Exception {}
class Element{
	public int getSymbol() throws GasException{return -1;}
}
