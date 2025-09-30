import java.util.LinkedList;
import java.util.Queue;

class SharedRes{
    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedRes(int bufferSize){
        sharedBuffer = new LinkedList<>();
        this.bufferSize=bufferSize;
    }

    public synchronized void Produce(int item) throws Exception{
        //if buffer is full, wait for consumer to consume item
        while (sharedBuffer.size()==bufferSize){
            System.out.println("Buffer is full, producer is waiting");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("Produced Item: "+item);
        //notify consumer to consume item
        notify();
    }

    public synchronized int Consume() throws Exception{
        //buffer is empty, wait for producer to add item
        while(sharedBuffer.isEmpty()){
            System.out.println("Buffer is empty, Consumer is waiting");
            wait();
        }
        int item = sharedBuffer.poll();
        System.out.println("Consumed Item: "+item);
        notify();
        return item;
    }
}

public class Program_25_ProducerConsumerProblem {
    public static void main(String[] args){
        SharedRes resObj = new SharedRes(3);

        //producer thread
        Thread producerThread = new Thread(()->{
            try{
                for(int i=0;i<=6;i++){
                    resObj.Produce(i);
                }
            } catch (Exception e) {
                //
            }
        });

        //consumer thread
        Thread consumerThread = new Thread(()->{
            try{
                for(int i=0;i<=6;i++){
                    resObj.Consume();
                }
            } catch (Exception e) {
                //
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}

