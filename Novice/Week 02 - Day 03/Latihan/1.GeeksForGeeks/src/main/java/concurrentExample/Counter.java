package concurrentExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import concurrentExample.MainApp;

public class Counter implements Runnable {

    private final MainApp mainApp;
    private final int loopLimit;
    private final String task;
    
    public Counter (MainApp mainApp, int loopLimit, String task) 
    {
        this.mainApp = mainApp;
        this.loopLimit = loopLimit;
        this.task = task;
    }
    
    @Override
    public void run() 
    {
        for (int i = 0; i < loopLimit; i++) 
        {
            System.out.println("Thread: " + Thread.currentThread().getName() + " Counter: " + (i + 1) + "Task : " + task);
            mainApp.pause(Math.random());
        }
    }    
}
