package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int min = first < second ? first : second;
        int result = 1;
        if(first != 0 && second != 0){
            for(int i = 1; i <= min; i++){
                if(
                    first % i == 0
                    && second % i == 0
                    && i > result
                ){
                    result = i;
                }
            }
        } else result = first == 0 ? second : first;
        System.out.println(result);
    }
}
