import java.util.Scanner;

public class Calculator_2 {
    private static final String INIT_COMMAND = "초기화";
    private static final String EXIT_COMMAND = "종료";

    private static double firstOperand = 0.0;
    private static double secondOperand = 0.0;
    private static String operator = "";
    static boolean isRunning = false;

    private static double add(double a, double b) {
        return a + b;
    }

    private static double subtract(double a, double b) {
        return a - b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return Double.NaN; // NaN (Not a Number)을 반환하여 오류를 나타냄
        }
        return a / b;
    }

    private static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    private static void operate() {
        double a = firstOperand;
        double b = secondOperand;
        double result = 0;

        switch (operator) {
            case "+":
                result = add(a, b);
                break;
            case "-":
                result = subtract(a, b);
                break;
            case "*":
                result = multiply(a, b);
                break;
            case "/":
                result = divide(a, b);
                break;
            case "^":
                result = power(a, b);
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                return;
        }

        if (!Double.isNaN(result)) {
            System.out.println(result);
            firstOperand = result;
            secondOperand = 0.0;
        }
    }

    private static void init() {
        firstOperand = 0.0;
        secondOperand = 0.0;
        operator = "";
        System.out.println("계산 결과가 초기화되었습니다.");
    }

    private static void exit(Scanner scanner) {
        System.out.println("프로그램이 종료됩니다.");
        isRunning = false;
        scanner.close();
    }

    public static void main(String[] args) {
        System.out.println(" ------- 계산기 시작 ------- ");
        isRunning = true;

        Scanner scanner = new Scanner(System.in);

        while (isRunning) {
            String input = scanner.next();

            if (input.matches("-?\\d+(\\.\\d+)?")) {
                if (operator.isEmpty() || operator.equals(null)) {
                    firstOperand = Double.parseDouble(input);
                    continue;
                } else {
                    secondOperand = Double.parseDouble(input);
                    operate();
                }
            } else {
                switch (input) {
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                    case "^":
                        operator = input;
                        break;
                    case INIT_COMMAND:
                        init();
                        break;
                    case EXIT_COMMAND:
                        exit(scanner);
                        break;
                    default:
                        System.out.println("올바른 명령을 입력하세요.");
                        System.out.println("+, -, *, /, ^, " + INIT_COMMAND + ", " + EXIT_COMMAND);
                        break;
                }
            }
        }

        System.out.println(" ------- 계산기 종료 ------- ");
        System.exit(0);
    }
}
