package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if(dividend % divider == 0){
            System.out.println("can be divided completely");
        }else{
            System.out.println("cannot be divided completely");
        }
    }
}
