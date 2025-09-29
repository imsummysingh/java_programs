class MultiThreading implements Runnable{

    @Override
    public void run() {
        System.out.println("Code Executed by thread: "+Thread.currentThread().getName());
    }
}

public class Program_21_RunnableThreading {
    public static void main(String[] args){
        System.out.println("Inside the Main Method: "+Thread.currentThread().getName());
        MultiThreading th = new MultiThreading();
        Thread thread = new Thread(th);
        thread.start();
        System.out.println("Finishing Main Method: "+Thread.currentThread().getName());
    }
}
