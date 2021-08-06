/**
 *
 */
public class Calculator {
    /**
     * @param num1
     * @param num2
     */
    final void add(final int num1, final int num2) {
        int res;
        res = num1 + num2;
        System.out.println("the addition is\t" + res);
    }


    /**
     * @param num1
     * @param num2
     */
    final void sub(final int num1, final int num2) {
        int res;
        res = num1 - num2;
        System.out.println("the subtraction is\t" + res);
    }


    /**
     * @param num1
     * @param num2
     */
    final void mul(final int num1, final int num2) {
        int res;
        res = num1 * num2;
        System.out.println("the multiplication is\t" + res);
    }

    final void div(final double num1, final double num2) {
        double res;
        res = num1 / num2;
        System.out.println("the division is" + res);
    }


}

