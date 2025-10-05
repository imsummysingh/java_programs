import java.util.concurrent.Semaphore;

class SharedRes3{
    boolean isAvailable = false;
    Semaphore lock = new Semaphore(2);

    public void Producer(){
        try{
            lock.acquire();
            System.out.println("Lock acquired by: "+Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(3000);
        }catch(Exception e){}finally {
            lock.release();
            System.out.println("Lock released by: "+Thread.currentThread().getName());
        }
    }
}

public class Program_29_SemaphoreLock {
    public static void main(String[] args){
        SharedRes3 res = new SharedRes3();

        Thread t1 = new Thread(()->{
            res.Producer();
        });

        Thread t2 = new Thread(()->{
            res.Producer();
        });
        Thread t3 = new Thread(()->{
            res.Producer();
        });

        Thread t4 = new Thread(()->{
            res.Producer();
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
