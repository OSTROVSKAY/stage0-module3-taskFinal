package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {

        int exit;

        exit = (number % 10) * 100;

        number = (number - number % 10)/10;

        exit = exit + (number % 10) * 10;

        number = (number - number % 10)/10;

        exit = exit + number;

        System.out.println(exit);

    }
}
