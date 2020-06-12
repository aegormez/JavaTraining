package hw9;

public class q17 {
	interface Target { boolean needloAim(double angle);}
	static void prepare(double angle, Target t) {
		boolean ready = t.needloAim(angle); // k1
		System.out.println(ready);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prepare(45, d -> d > 5 || d < -5); // k2 

	}

}
