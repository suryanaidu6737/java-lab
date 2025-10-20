//program to demonstrate the features of java.time package
import java.time.*;
import java.time.format.*;
import java.time.temporal.*;
class TimeDemo
{
	public static void main(String[] args)
	{
		LocalDate date=LocalDate.now();
		System.out.println(date);
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println(datetime);
		DateTimeFormatter formtime = DateTimeFormatter.ofPattern("dd/MM/yyyy,hh:mm:ss");
		System.out.println(datetime.format(formtime));
		LocalDate nextmonday=date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println(nextmonday);
		LocalDate previousmonday=date.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println(previousmonday);
		LocalDate daymonth=date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println(daymonth);
		DayOfWeek first=daymonth.getDayOfWeek();
		System.out.println(first);
		LocalDate lastdaymonth=date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(lastdaymonth);
		DayOfWeek last=lastdaymonth.getDayOfWeek();
		System.out.println(last);
		
	}
}
