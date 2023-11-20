package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {

        int sum;

        sum = number % 10;

        number = (number - number % 10) / 10;

        sum = sum + number % 10;

        number = (number - number % 10) / 10;

        sum = sum + number % 10;

        number = (number - number % 10) / 10;

        sum = sum + number;

        System.out.println(sum);

    }
}
