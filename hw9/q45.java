package hw9;
import java.time.*;
import java.time.format.*;
import java.util.ArrayList;
public class q45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LocalDate newYears=LocalDate.of(2017,1,1);
		Period period =Period.ofDays(1);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("mm-dd-yyyy");
		System.out.print(format.format(newYears.minus(period)));
	}

}
