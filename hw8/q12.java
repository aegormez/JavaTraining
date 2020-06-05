package hw8;

public class q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.print(1);
			throw new ClassCastException();
		}catch (ArrayIndexOutOfBoundsException ex) {
			System.out.print(2);
		}catch(Throwable ex) {
			System.out.print(3);
		}finally {
			System.out.print(4);
		}
		System.out.print(5);
	}

}
