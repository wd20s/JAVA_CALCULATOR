public class CalCulator_Plus {
    int[] numbers;
    int result=0;
    int getResult(int ... numbers){
        for(int num : numbers){
            result+=num;
        }
        return result;
    }
}
