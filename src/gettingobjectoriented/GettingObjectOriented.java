package gettingobjectoriented;
import java.util.*;
public class GettingObjectOriented {
    public static void main(String[] args) {
        Scanner reader  = new Scanner(System.in);
        Person john = new Person("John", "Smisthonanos", new GregorianCalendar(1988,1,5));
//        john.firstName = "John";
//        john.lastName = "Smithonian";
//        john.birthday = new GregorianCalendar(1988,1,5);
        System.out.println("My name is: " + john.fullName() + " and i am " + john.age(new GregorianCalendar()));
        /*Following is my grappling with Calendar and GregorianCalendar objects.*/
//        Calendar newdate = new GregorianCalendar();
//        System.out.println("Year: " + newdate.get(Calendar.YEAR));
//        System.out.println("Month: " + newdate.get(Calendar.MONTH));
//        System.out.println("Day: " + newdate.get(Calendar.DATE));
//        System.out.println("Day of the Year: " + newdate.get(Calendar.DAY_OF_YEAR));
    }
    
}
