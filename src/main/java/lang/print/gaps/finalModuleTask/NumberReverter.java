package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int first=number%10;
        int second=(number%100-first)/10;
        int third=number/100;
        System.out.println(100*first+10*second+third);
//        System.out.println(100*(number%10)+(number%100-first)+number/100);
    }
}
