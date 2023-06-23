package OOP;

import java.util.Arrays;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch(){
        startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void end(){
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }
    public static void main(String[] args) {
        int [] arr = new int[100000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
        StopWatch stopWatch = new StopWatch();

        Arrays.sort(arr);
        stopWatch.end();
        System.out.println("Time is : " + stopWatch.getElapsedTime() + " miliseconds ");
    }

}
