package hw9;

import java.util.ArrayList;
import java.util.List;

public class q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> chars = new ArrayList<>(); 
		chars.add('a'); 
		chars.add('b'); 
		chars.set(1, 'c'); 
		chars.remove(0); 
		System.out.print(chars.length()); 

	}

}
