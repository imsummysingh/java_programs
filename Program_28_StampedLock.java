import java.util.concurrent.locks.StampedLock;

class SharedRes2{
    int a = 10;
    StampedLock lock = new StampedLock();

    public void Producer(){
        long stamp = lock.tryOptimisticRead();
        try{
            System.out.println("Taken Optimistic Lock");
            a=11;
            Thread.sleep(6000);
            if(lock.validate(stamp)){
                System.out.println("Updated a value succesfully");
                System.out.println("stamp value: "+a);
            }else{
                System.out.println("rollabck of work");
                a=10;   //rollback
            }
        } catch (Exception e) {

        }
    }

    public void Consumer(){
        long stamp = lock.writeLock();
        System.out.println("Write lock acquired by: "+Thread.currentThread().getName());
        try{
            System.out.println("Performing work");
            a=9;
        }finally {
            lock.unlock(stamp);
            System.out.println("Write lock released by: "+Thread.currentThread().getName());
        }
    }
}

public class Program_28_StampedLock {
    public static void main(String[] args){
        SharedRes2 res = new SharedRes2();

        Thread t1 = new Thread(()->{
            res.Producer();
        });

        Thread t2 = new Thread(()->{
            res.Consumer();
        });

        t1.start();
        t2.start();
    }
}
