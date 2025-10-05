import java.util.concurrent.locks.ReentrantLock;

//Reentrant lock does not depend on object, it depend on lock
class SharedReso{
    boolean isAvailable=false;

    public void Producer(ReentrantLock lock){
        try{
            //acquiring lock
            lock.lock();
            System.out.println("Lock Acquired by: "+Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(4000);
        }catch (Exception e){}finally {
            lock.unlock();
            System.out.println("Lock Released by: "+Thread.currentThread().getName());
        }
    }
}

public class Program_26_ReentrantLock {
    public static  void main(String[] args){
        ReentrantLock lock = new ReentrantLock();

        SharedReso res1 = new SharedReso();
        Thread t1 = new Thread(()->{
            res1.Producer(lock);
        });

        SharedReso res2 = new SharedReso();
        Thread t2 = new Thread(()->{
            res2.Producer(lock);
        });

        t1.start();
        t2.start();
    }
}
