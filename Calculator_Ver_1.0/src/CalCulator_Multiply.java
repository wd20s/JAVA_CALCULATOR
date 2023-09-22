public class CalCulator_Multiply {

    int[] numbers;
    int result = 1;

    int getResult(int ... numbers){
        for(int num : numbers){
            result *= num;
        }
        return result;
    }
}
