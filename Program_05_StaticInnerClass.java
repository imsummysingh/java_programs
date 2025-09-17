class outerClass{
    int instanceVariable = 10;
    static int staticVariable = 20;

    static class nestedClass{
        public void print(){
            System.out.println(staticVariable);
        }
    }

}

public class Program_05_StaticInnerClass {
    public static void main(String[] args){
        outerClass.nestedClass obj = new outerClass.nestedClass();
        obj.print();
    }
}
