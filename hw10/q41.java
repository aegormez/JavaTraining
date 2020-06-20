package hw10;
import java.util.*;
public class q41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"natural history","science","art"};
		List<String> museums = new ArrayList<>();
		museums.add(array[0]);
		museums.add(array[1]);
		museums.add(array[2]);
		museums.remove(2);
		System.out.println(museums);
	}

}
