package hw8;

public class q9 {

	public static void main(String[] args) {
		try {
			System.out.print("A\n");
			throw new RuntimeException("Out of Bounds");
		}catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.print('B');
			throw aioobe;
		} finally {
			System.out.print('C');
		}

	}

}
