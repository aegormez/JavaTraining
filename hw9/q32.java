package hw9;

import java.time.LocalDate;
import java.util.function.Predicate;

public class q32 {

	public static void main(String[] args) {
		LocalDate xmas = LocalDate.of(2016, 12, 25);
		xmas.plusDays(-1);
		System.out.println(xmas.getDayOfMonth()); 

	}

}
