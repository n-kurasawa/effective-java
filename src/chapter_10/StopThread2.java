package chapter_10;

import java.util.concurrent.TimeUnit;

/**
 * Created by naohiro on 2014/04/03.
 */
public class StopThread2 {
    public static volatile boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        canStop();
    }

    public static void canStop() throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!stopRequested) {
                    i++;
                }
            }
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}
