package Stack.CarFleet;

public class carFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        int res = 0;
        double[] timeArr = new double[target];
        for(int i = 0; i < position.length; i++){
            timeArr[position[i]] = (double) (target - position[i]) / speed[i];
        }
        double prev = 0;
        for(int i = target - 1; i >= 0; i--){
            double curr = timeArr[i];
            if(curr > prev){
                prev = curr;
                res++;
            }
        }
        return res;
    }
}