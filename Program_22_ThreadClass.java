class MultiThreading1 extends Thread{

    @Override
    public void run() {
        System.out.println("Code Executed by thread: "+Thread.currentThread().getName());
    }
}
public class Program_22_ThreadClass {
    public static void main(String[] args){
        System.out.println("Inside the Main Method: "+Thread.currentThread().getName());
        MultiThreading1 th = new MultiThreading1();
        th.start();
        System.out.println("Finishing Main Method: "+Thread.currentThread().getName());
    }
}
