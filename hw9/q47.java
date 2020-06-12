package hw9;
import java.util.*;
import java.util.function.*;
public class q47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("-5");
		list.add("0");
		list.add("5");
		print(list,e -> e <0);
	}
	public static void print(List<String> list,Predicate<Integer> p) {
		for(String num : list) {
			if (p.test(num))
				System.out.println(num);
		}
	}
}
