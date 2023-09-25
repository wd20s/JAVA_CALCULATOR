import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        int i = 1;
        int inp = 0;
        int result = 0;
        int result2 = 0;
        int result3 = 0;
        CalCulator_Plus plus = new CalCulator_Plus();
        CalCulator_Divide div = new CalCulator_Divide();
        CalCulator_Minus minus = new CalCulator_Minus();
        CalCulator_Multiply mul = new CalCulator_Multiply();
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("\n사칙연산 계산기 Ver 2.0");

        while (true) {
            System.out.printf("%d 번째 값을 입력해주세요 > ", i);
            int FirstNumber = sc.nextInt();
            list.add(FirstNumber);
            inp += list.get(i-1);
            System.out.print("현재 값 : " +inp+"\n");

            sc.nextLine();
            System.out.print("[ + , - , * , / ] 사칙연산 타입을 입력해주세요 > ");
            String OperatorType = sc.nextLine();

            i++;

            System.out.printf("%d 번째 값을 입력해주세요 > ", i);
            int NNumber = sc.nextInt();
            list.add(NNumber);

            for(int NowValue=0; NowValue<=list.size()-1; NowValue++){
                result2 += list.get(NowValue);
            }
            sc.nextLine();
            System.out.printf("현재 값 : %d \n계속하시겠습니까? Y / N > ",result2);
            String ContinueCal = sc.nextLine();

            if(OperatorType.equals("+")){
                for(int NowValue=0; NowValue<=list.size()-1; NowValue++){
                    result2 += list.get(NowValue);
                }
            }


            if(ContinueCal.equals("N")){
                if(OperatorType.equals("+")){
                    for (int j = 0; j <= list.size() - 1; j++) {
                        result = plus.getResult(list.get(j));

                    }
                    System.out.println(result);
                    break;
                }else if(OperatorType.equals("-")){

                }else if(OperatorType.equals("*")){

                }else if(OperatorType.equals("/")){

                }
            }else if(ContinueCal.equals("Y")){

            }

//            if(ContinueCal.equals("Y")){
//                inp = result2;
//                System.out.printf("현재 값 : "+result2+"\n");
//                result2 = 0;
//                System.out.print("[ + , - , * , / ] 사칙연산 타입을 입력해주세요 > ");
//                OperatorType = sc.nextLine();
//                i++;
//            }else if(OperatorType.equals("+")) {
//                if (ContinueCal.equals("N")) {
//                    for (int j = 0; j <= list.size() - 1; j++) {
//                        result = plus.getResult(list.get(j));
//
//                    }
//                    System.out.println(result);
//                    break;
//                }
//            }else if(OperatorType.equals("-")){
//                if(ContinueCal.equals("N")){
//                    for (int j = 0; j <= list.size() - 1; j++) {
//                        result = minus.getResult(FirstNumber,list.get(j));
//                    }
//                    System.out.println(result);
//                    break;
//                }
//            }
        }
    }
}