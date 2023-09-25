//import java.util.Scanner;
//
//public class example {
//    public static void main(String[] args) {
//        while(true) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("+ , - , / , * 중 원하는 사칙연산타입을 고르시오 \n 종료를 원하시면 "종료"를 입력해주세요.");
//            String OperatorType = sc.nextLine();
//
//            if (OperatorType.equals("+")) {
//                System.out.println("값을 입력해주세요 : ");
//                while (sc.hasNextInt()) {
//                    list.add(sc.nextInt());
//                }
//                for (int i = 0; i <= list.size() - 1; i++) {
//                    result1 = plus.getResult(list.get(i));
//                }
//                System.out.println(result1);
//
//            } else if (OperatorType.equals("-")) {
//                System.out.println("값을 입력해주세요 : ");
//                while (sc.hasNextInt()) {
//                    list.add(sc.nextInt());
//                }
//                for (int i = 1; i <= list.size() - 1; i++) {
//                    result1 = minus.getResult(list.get(0), list.get(i));
//                }
//                System.out.println(result1);
//            } else if (OperatorType.equals("/")) {
//                System.out.println("값을 입력해주세요 : ");
//                while (sc.hasNextInt()) {
//                    list.add(sc.nextInt());
//                }
//                String result2 = div.getResult(list.get(0), list.get(1));
//                System.out.println(result2);
//            } else if (OperatorType.equals("*")) {
//                System.out.println("값을 입력해주세요 : ");
//                while (sc.hasNextInt()) {
//                    list.add(sc.nextInt());
//                }
//                for (int i = 0; i <= list.size() - 1; i++) {
//                    result1 = mul.getResult(list.get(i));
//                }
//                System.out.println(result1);
//            }else if(OperatorType.equals("종료")){
//                System.out.println("프로그램이 종료됐습니다.");
//                break;
//            }else {
//                System.out.println("잘못된입력입니다");
//            }
//        }
//    }
//}
