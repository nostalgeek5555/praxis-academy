/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package concurrentExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class MainApp {

    public void startThread()
    {
        ExecutorService taskList = Executors.newFixedThreadPool(2);
        for (int i=0; i < 5; i++)
        {
            taskList.execute(new Counter(this, i+1, "tasl " + (i + 1)));
        }
        taskList.shutdown();
    }

    public void pause(double seconds)
    {
        try
        {
            Thread.sleep(Math.round(1000.0 * seconds));
        }

        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new MainApp().startThread();
    }
}
