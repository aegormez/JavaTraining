package hw8;

public class q10 {
	public void openDrawBridge() throws Exception {
		try {
			throw new Exception("Circle");
		} catch(Exception e) {
			System.out.print("Opening");
		} finally {
			System.out.print("Walls");
		}
	}

	public static void main(String[] moat) throws Exception{
		// TODO Auto-generated method stub
		new q10().openDrawBridge();
	}

}
