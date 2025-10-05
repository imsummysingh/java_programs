import java.util.concurrent.*;

public class Program_30_ThreadPoolExecuter {
    public static void main(String[] args){
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2,5,1, TimeUnit.HOURS,
                new ArrayBlockingQueue<>(10), new CustomThreadFactor(), new CustomRejectHandler());

        poolExecutor.allowCoreThreadTimeOut(true);

        //submit task-which will run the task
        for(int i=0;i<=25;i++){
            poolExecutor.submit(()->{
                try{
                    Thread.sleep(5000);
                    System.out.println("Thread Name: "+Thread.currentThread().getName());
                } catch (Exception e) {

                }
            });
        }
        poolExecutor.shutdown();
    }
}

class CustomRejectHandler implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        //logging rejected task
        System.out.println("Task Rejected: "+r.toString());
    }
}

class CustomThreadFactor implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        Thread th = new Thread(r);
        th.setPriority(Thread.NORM_PRIORITY);
        th.setDaemon(false);
        return th;
    }
}
