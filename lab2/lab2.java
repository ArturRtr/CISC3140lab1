import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
public class lab2{
    public static void main (String[] args){
        //set the dates for upcoming important assignments
        LocalDate today = LocalDate.now();
        LocalDate lab2 = LocalDate.of(2022, Month.OCTOBER, 26);
        LocalDate lab3 = LocalDate.of(2022, Month.NOVEMBER, 23);
        LocalDate lab4 = LocalDate.of(2022, Month.DECEMBER, 7);
        LocalDate Quiz3 = LocalDate.of( 2022, Month.OCTOBER, 26);
        LocalDate Quiz4 = LocalDate.of(2022, Month.NOVEMBER, 16);
        LocalDate Quiz5 = LocalDate.of( 2022, Month.DECEMBER, 7);
        LocalDate classFinal = LocalDate.of( 2022, Month.DECEMBER, 19);
        Scanner input = new Scanner(System.in);
        LocalDate holder1;
        LocalDate holder2;
        //done.tolowerCase() != "done"
        System.out.println("Do you want to use existing or custom dates (type existing or custom)");
        String done = input.nextLine();
        if(done.toLowerCase().equals("existing")){
            System.out.println("choose one from the existing dates: today,lab2,lab3,lab4,quiz3,quiz4,quiz5,final");
            done = input.nextLine();
           if(done.toLowerCase().equals("today")){
                holder1 = today;
                holder2 = classFinal; 
                Period DayDiff = Period.between(holder1, holder2);
                System.out.println(holder1+ " is "+DayDiff.getDays()+" days away from "+holder2);
            }
            else if(done.toLowerCase().equals("lab2")){
                //holder1 = lab2;
                holder1 = lab2;
                holder2 = classFinal; 
                Period DayDiff = Period.between(holder1, holder2);
                System.out.println(holder1+ " is "+DayDiff.getDays()+" days away from "+holder2);
            }
            else if(done.toLowerCase().equals("lab3")){
                //holder1 = lab3;
                holder1 = lab3;
                holder2 = classFinal; 
                Period DayDiff = Period.between(holder1, holder2);
                System.out.println(holder1+ " is "+DayDiff.getDays()+" days away from "+holder2);
            }
            else if(done.toLowerCase().equals("lab4")){
                //holder1 = lab4;
                holder1 = lab4;
                holder2 = classFinal; 
                Period DayDiff = Period.between(holder1, holder2);
                System.out.println(holder1+ " is "+DayDiff.getDays()+" days away from "+holder2);
            }
            else if(done.toLowerCase().equals("quiz3")){
                //holder1 = Quiz3;
                holder1 = Quiz3;
                holder2 = classFinal; 
                Period DayDiff = Period.between(holder1, holder2);
                System.out.println(holder1+ " is "+DayDiff.getDays()+" days away from "+holder2);
            }
            else if(done.toLowerCase().equals("quiz4")){
                 //holder1 = Quiz4;
                holder1 = Quiz4;
                holder2 = classFinal; 
                Period DayDiff = Period.between(holder1, holder2);
                System.out.println(holder1+ " is "+DayDiff.getDays()+" days away from "+holder2);
            }
            else if(done.toLowerCase().equals("quiz5")){
                 //holder1 = Quiz5;
                holder1 = Quiz5;
                holder2 = classFinal; 
                Period DayDiff = Period.between(holder1, holder2);
                System.out.println(holder1+ " is "+DayDiff.getDays()+" days away from "+holder2);
            }
            else if(done.toLowerCase().equals("final")){
                 //holder1 = classFinal;
                holder1 = classFinal;
                holder2 = classFinal; 
                Period DayDiff = Period.between(holder1, holder2);
                System.out.println(holder1+ " is "+DayDiff.getDays()+" days away from "+holder2);
            }
            else{
                 System.out.println("Does not match existing dates");
            }
        }
        else if(done.toLowerCase().equals("custom")) {
            System.out.println("type in your custom date as MM/DD/YYYY or MM-DD");
            done = input.nextLine();
            //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-YY");
            //SimpleDateFormat format = new simpleDateFormat("yyyy-MMM-dd");
            holder1 = LocalDate.parse(done);
            holder2 = classFinal;
            Period DayDiff = Period.between(holder1, holder2);
            System.out.println(holder1+ " is "+DayDiff.getDays()+" days away from "+holder2);
        }
        
    }
}
