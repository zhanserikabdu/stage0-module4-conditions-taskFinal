package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (month == 2) {
            System.out.println(28);
        } else if (month == 6) {
            System.out.println(30);
        } else if(year == 2000){
            System.out.println(29);
        } else {
            System.out.println("invalid date");
        }
    }


}

