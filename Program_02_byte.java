class Employee{
    byte var;

    public void dummyMethod(){
        System.out.println(var);    //0
    }
}

public class Program_02_byte {
    public static void main(String[] args){
        Employee e = new Employee();
        e.dummyMethod();    //0
    }
}
