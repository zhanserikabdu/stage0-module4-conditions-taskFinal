package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year == 2004) {
            System.out.println("leap year");
            {
                if (month == 2) {
                    System.out.println(28);
                } else {
                    System.out.println("invalid date");
                }
            }
        } else {
            System.out.println("not leap year");
        }
    }
}
