import java.util.Scanner;

public class CalculatorModule {
    double num1, num2;
    double result, result2 = 0;
    Scanner sc = new Scanner(System.in);

    void setOperands(double num1, String operator, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    double add() {
        return this.num1 + this.num2;
    }

    double minus() {
        return this.num1 - this.num2;
    }

    double div() {
        if (num2 == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다");
        }
        return this.num1 / this.num2;
    }

    double mul() {
        return this.num1 * this.num2;
    }

    void clear() {
        this.num1 = 0;
        this.num2 = 0;
    }

    void operatorProgram(double num1, String operator, double num2) {
        switch (operator) {
            case "+":
                result2 += add();
                result += add();
                System.out.print("결과 값 : " + result + "\n");
                result = 0;
                break;
            case "-":
                result2 += minus();
                result += minus();
                System.out.print("결과 값 : " + result+ "\n");
                result = 0;
                break;
            case "*":
                result2 += mul();
                result += mul();
                System.out.print("결과 값 : " + result+ "\n");
                result = 0;
                break;
            case "/":
                result2 += div();
                result += div();
                System.out.print("결과 값 : " + result+ "\n");
                result = 0;
                break;
            default:
                throw new IllegalArgumentException("지원하지 않는 연산자입니다");
        }
    }
    void processRecentValue() {
        System.out.println("\n최근 값으로 연산하시겠습니까? [ Y / N ]");
        while (true) {
            String recent = sc.nextLine();
            if (recent.equalsIgnoreCase("Y")) {
                num1 = result2;

                System.out.print("기호를 입력하세요1 > ");
                String operator = sc.nextLine();

                System.out.print("수를 입력하세요1 > ");
                double num2 = sc.nextDouble();

                setOperands(num1, operator, num2);

                try {
                    operatorProgram(num1, operator, num2);
                } catch (ArithmeticException e) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    continue;
                } catch (IllegalArgumentException e) {
                    System.out.println("지원하지 않는 연산자입니다.\n다시 입력해주세요");
                    continue;
                }

                FirstOperation();

            } else if (recent.equalsIgnoreCase("N")) {
                FirstOperation();
            }
        }
    }
    void FirstOperation(){
        while (true) {
            System.out.print("\n수를 입력하세요 > ");
            String num1 = sc.nextLine();
            if (num1.equals("l")) {
                System.out.println("프로그램이 종료되었습니다");
                break;
            }
            System.out.print("\n기호를 입력하세요 > ");
            String operator = sc.nextLine();
            if (operator.equals("l")) {
                System.out.println("프로그램이 종료되었습니다");
                break;
            }
            System.out.print("\n수를 입력하세요 > ");
            String num2 = sc.nextLine();
            if (num2.equals("l")) {
                System.out.println("프로그램이 종료되었습니다");
                break;
            }
            double parsedNum1 = Double.parseDouble(num1);
            double parsedNum2 = Double.parseDouble(num2);

            setOperands(parsedNum1, operator, parsedNum2);
            try {
                operatorProgram(parsedNum1, operator, parsedNum2);
                processRecentValue();
            }

            catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다.");
                continue;
            } catch (IllegalArgumentException e) {
                System.out.println("지원하지 않는 연산자입니다. 다시 입력해주세요");
                continue;
            }
        }
    }

}
