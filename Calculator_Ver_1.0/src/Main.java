import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Main c = new Main();
        int result1 = 0;
        CalCulator_Plus plus = new CalCulator_Plus();
        CalCulator_Divide div = new CalCulator_Divide();
        CalCulator_Minus minus = new CalCulator_Minus();
        CalCulator_Multiply mul = new CalCulator_Multiply();
        List<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("+ , - , / , * 중 원하는 사칙연산타입을 고르시오 ");
        String OperatorType = sc.nextLine();

//        while(sc.hasNextInt()){
//            list.add(sc.nextInt());
//        }

        if(OperatorType.equals("+")){
            System.out.println("값을 입력해주세요 : ");
            while (sc.hasNextInt()) {
                list.add(sc.nextInt());
            }
            for(int i=0; i<=list.size()-1; i++) {
                result1 = plus.getResult(list.get(i));
            }
            System.out.println(result1);

        }else if(OperatorType.equals("-")) {
            System.out.println("값을 입력해주세요 : ");
            while (sc.hasNextInt()) {
                list.add(sc.nextInt());
            }
            for (int i = 1; i <= list.size() - 1; i++) {
                result1 = minus.getResult(list.get(0), list.get(i));
            }
            System.out.println(result1);
        }else if(OperatorType.equals("/")) {
            System.out.println("값을 입력해주세요 : ");
            while (sc.hasNextInt()) {
                list.add(sc.nextInt());
            }
            String result2 = null;
            result2 = div.getResult(list.get(0), list.get(1));
            System.out.println(result2);
        }else if(OperatorType.equals("*")){
            System.out.println("값을 입력해주세요 : ");
            while (sc.hasNextInt()) {
                list.add(sc.nextInt());
            }
            for(int i=0; i<=list.size()-1; i++){
                result1 = mul.getResult(list.get(i));
            }
            System.out.println(result1);
        }else {
            System.out.println("잘못된입력입니다");
        }











//        for(int i=0; i<=list.size()-1; i++) {
//            result1 = plus.getResult(list.get(i));
//        }


    }
}