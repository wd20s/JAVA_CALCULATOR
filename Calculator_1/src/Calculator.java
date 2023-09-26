import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("프로그램을 종료하려면 [ l ] 을 입력하세요");
        CalculatorModule cal = new CalculatorModule();
        cal.FirstOperation();
    }
}
