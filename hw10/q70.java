package hw10;

public class q70 {
	public int adjustPropellers (int length,String[] type) {
		length++;
		type[0]="LONG";
		return length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q70 h=new q70();
		int length=5;
		String[] type=new String[1];
		length = h.adjustPropellers(length, type);
		
		System.out.print(length+" "+type[0]);
	}

}
