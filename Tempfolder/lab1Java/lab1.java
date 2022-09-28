import java.util.Calendar;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
public class lab1{
    public static void main(String[] args){
        //Calendar date = Calendar.getInstance();
        //date.clear();
        //System.out.println(date.getTime());
        LocalDate today = LocalDate.now();
        LocalDate lab1 = LocalDate.of(2022, Month.SEPTEMBER, 28);
        LocalDate lab2 = LocalDate.of(2022, Month.OCTOBER, 26);
        LocalDate lab3 = LocalDate.of(2022, Month.NOVEMBER, 23);
        LocalDate lab4 = LocalDate.of(2022, Month.DECEMBER, 7);
        Period duelab1 = Period.between(today, lab1);
        Period duelab2 = Period.between(today, lab2);
        Period duelab3 = Period.between(today, lab3);
        Period duelab4 = Period.between(today, lab4);
        System.out.println("lab1 is due in "+duelab1.getMonths()+" months and "+duelab1.getDays()+" days");
        System.out.println("lab2 is due in "+duelab2.getMonths()+" months and "+duelab2.getDays()+" days");
        System.out.println("lab3 is due in "+duelab3.getMonths()+" months and "+duelab3.getDays()+" days");
        System.out.println("lab4 is due in "+duelab4.getMonths()+" months and "+duelab4.getDays()+" days");
    }
}