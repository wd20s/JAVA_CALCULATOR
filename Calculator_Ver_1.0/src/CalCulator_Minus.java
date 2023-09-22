public class CalCulator_Minus {
    int[] numbers;
    int result;
    int first;

    int totalnum;
    int getResult(int first, int ... numbers){
        for(int num : numbers){
            totalnum+=num;
            result= first-totalnum;
        }
        return result;
    }
}
