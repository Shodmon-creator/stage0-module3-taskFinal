package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int first=number%10;
        int second=number%100-first;
        int third=number%1000-second-first;
        int fourth=number/1000;
        System.out.println(first+second+third+fourth);
    }
}
