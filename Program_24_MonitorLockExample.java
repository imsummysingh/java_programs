//Example of Monitor Lock using producer and consumer
class SharedResource{
    boolean isItemAvailable = false;

    public synchronized void addItem(){
        isItemAvailable=true;
        System.out.println("Producer Thread calling the notify method, so waiting thread get invoked");
        notifyAll();
    }

    public synchronized void consumeItem(){
        System.out.println("Consumer Thread inside ConsumeItem method");
        if(!isItemAvailable){
            try {
                System.out.println("Consumer Thread is waiting, will release the monitor lock");
                wait();
            }catch (Exception e){
                //exception handling
            }
        }
        System.out.println("Consumer Thread consumed the Itemco");
        isItemAvailable=false;
    }
}

public class Program_24_MonitorLockExample {
    public static  void main(String[] args){
        SharedResource sharedResourceObj = new SharedResource();

        Thread producerThread = new Thread(()->{
            try{
                Thread.sleep(2000);
            }catch (Exception e){}
            sharedResourceObj.addItem();
        });

        Thread consumerThread = new Thread(()->{
            sharedResourceObj.consumeItem();
        });

        producerThread.start();
        consumerThread.start();

    }
}
