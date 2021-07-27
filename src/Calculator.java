public class Calculator {
    public static void main(String[] args) {
        CalculatorLog log = new CalculatorLog();
        double a = 10.2;
        double b = 12.6;
        log.addition = a + b;
        System.out.println(log.addition);

        log.subtraction = a - b;
        System.out.println(log.subtraction);

        log.multi = a * b;
        System.out.println(log.multi);

        log.division = a / b;
        System.out.println(log.division);
    }

}
