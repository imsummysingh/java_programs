import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

//Readwrite lock example
class sharedRes1{
    boolean isAvailable=false;
    public void Producer(ReadWriteLock lock){
        try{
            lock.readLock().lock();
            System.out.println("Read lock acquired by: "+Thread.currentThread().getName());
            Thread.sleep(4000);
        }catch (Exception e){}finally {
            lock.readLock().unlock();
            System.out.println("Read lock released by: "+Thread.currentThread().getName());
        }
    }

    public void Consumer(ReadWriteLock lock){
        try{
            lock.writeLock().lock();
            System.out.println("Write lock acquired by: "+Thread.currentThread().getName());
            isAvailable=false;
        } catch (Exception e) {

        }finally {
            lock.writeLock().unlock();
            System.out.println("Write lock released by: "+Thread.currentThread().getName());
        }
    }
}

public class Program_27_ReadWriteLock {
    public static void main(String[] args){
        sharedRes1 res1 = new sharedRes1();
        ReadWriteLock lock = new ReentrantReadWriteLock();

        Thread t1 = new Thread(()->{
            res1.Producer(lock);
        });
        Thread t2 = new Thread(()->{
           res1.Producer(lock);
        });

        sharedRes1 res2 = new sharedRes1();
        Thread t3 = new Thread(()->{
            res2.Consumer(lock);
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
