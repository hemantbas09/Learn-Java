package ClassesObjects;
// Create a Date class with day, month, year and a method isValid() that checks ranges (e.g., month 1-12, day 1-31).

public class Date {

    private int day;
    private int month;
    private int year;

    Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isValid(){
        if(month < 1 || month > 12){
            return false;
        }
        if(day < 1 || day > 31){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Date d1 = new Date(25, 12, 2025);   // valid
        Date d2 = new Date(45, 12, 2025);   // day 45 → invalid
        Date d3 = new Date(15, 13, 2025);   // month 13 → invalid
        Date d4 = new Date(0, 5, 2025);     // day 0 → invalid

        System.out.println(d1.isValid());   // true
        System.out.println(d2.isValid());   // false
        System.out.println(d3.isValid());   // false
        System.out.println(d4.isValid());   // false
    }
}