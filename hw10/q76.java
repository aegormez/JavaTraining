package hw10;
import java.time.*;
public class q76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate time = LocalDate.of(1, 11);
		while (time.getHour()<1) {
			time.plusHours(1);
			System.out.print("in loop");
		}
	}
}
//code does not compile