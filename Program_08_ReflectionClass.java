import java.lang.reflect.Modifier;

class Eagle{
    public String breed;
    private boolean cnaSwim;

    public void fly(){
        System.out.println("Fly");
    }

    public void eat(){
        System.out.println("Eat");
    }
}

public class Program_08_ReflectionClass {
    public static  void main(String[] args){
        //object of normal class
        Eagle eagleObj = new Eagle();
        eagleObj.fly();
        eagleObj.eat();

        //creating reflection of class
        Class eagle = Eagle.class;
        System.out.println(eagle.getName());
        System.out.println(Modifier.toString(eagle.getModifiers()));
    }
}
