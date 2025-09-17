class outerClass1{
    int instanceVariable=10;
    static int staticVariable=20;

    class innerClass{
        //it can access both static and instance variable
        public void print(){
            System.out.println("Sum of both variable: "+(instanceVariable+staticVariable));
        }
    }
}

public class Program_06_InnerClass {
    public static void main(String[] args){
        outerClass1 obj = new outerClass1();
        outerClass1.innerClass innerObj = obj.new innerClass();
        innerObj.print();
    }
}

