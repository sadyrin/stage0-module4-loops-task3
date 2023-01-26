package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public  void printDigitsSum(int t){
        int sum = 0;
        for(int i = 0; i < ("" + t).length(); i++){
            sum += ((("" + t).charAt(i) > 47) && (("" + t).charAt(i) < 58) ? ("" + t).charAt(i) - '0': 0);
        }
        System.out.println(sum);
    }
}
