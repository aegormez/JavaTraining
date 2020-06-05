package hw8;

public class q24 {
	public void compute() throws Exception{
		throw new RuntimeException("Error processing request");
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		try {
			new q24().compute();
			System.out.print("Ping");
		} catch(RuntimeException e) {
			System.out.print("Pong");
		}
	}

}
