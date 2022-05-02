public class StopWatch {
    private long startTime;
    private long endTime;

    void start(){
        startTime = System.currentTimeMillis();
    }

    void stop(){
        endTime = System.currentTimeMillis();
    }

    long getElapsedTime(){
        return (endTime-startTime);
    }
}
