package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        for(int i = 1; i <= lengthOfLastNumber; i++){
            String nines = "9";
            for(int j = 1; j < i; j++){
                nines += 9;
            }
            sum += Integer.parseInt(nines);
        }
        System.out.println(sum);
    }
}
