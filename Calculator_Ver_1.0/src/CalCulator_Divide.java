public class CalCulator_Divide {
    int result;
    String total;
    int number2;
    String getResult(int number1 , int number2){
        this.number2 = number2;
        if(this.number2  == 0){
            return "0으로 나눌 수 없습니다.";

        }else {
            result = number1/number2;
            total = String.valueOf(result);
            return total;
        }
    }
}
