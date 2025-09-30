class MonitorLockExample{
    //synchronized method for monitor thread
    public synchronized void task1(){
        try{
            System.out.println("Inside Task1");
            Thread.sleep(10000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    //not a synchronized method, but a block of synchronized code
    public void task2(){
        System.out.println("Inside Task2, before synchronized");
        synchronized (this){
            System.out.println("Inside Task2, After synchronized");
        }
    }

    public void task3(){
        System.out.println("Inside Task3");
    }
}

public class Program_23_ThreadMonitorLock {
    public static void main(String[] args){
        MonitorLockExample obj = new MonitorLockExample();
        Thread t1= new Thread(()->{obj.task1();});
        Thread t2= new Thread(()->{obj.task2();});
        Thread t3= new Thread(()->{obj.task3();});
        t1.start();
        t2.start();
        t3.start();
    }
}
