package hw10;

public class q50 {
	public static void swing (int... beats)throws ClassCastException{
		try {
			System.out.print("1"+beats[2]);
		} catch (RuntimeException e) {
			System.out.print("2");
		}catch(Exception e) {
			System.out.print("3");
		}finally {
			System.out.print("4");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new q50().swing(0,0);
		System.out.print("5");
	}

}
