import java.lang.reflect.Array;
import java.util.Arrays;

class Car{
    String carName;
    String carType;

    Car(String name, String type){
        this.carName = name;
        this.carType=type;
    }
}

public class Program_13_Comparator {
    public static void main(String[] args){
        Car[] carArray = new Car[3];
        carArray[0]=new Car("SUV","Petrol");
        carArray[1]=new Car("Sedan","Diesel");
        carArray[2]=new Car("HatchBack","CNG");

        //will sort the carArray object with comparator
        //it will sort the objects in descending order with car type
        Arrays.sort(carArray, (Car obj1, Car obj2)->obj2.carType.compareTo(obj1.carType));
        for(Car car: carArray){
            System.out.println(car.carName +" "+car.carType);
        }

        System.out.println();

        //it will sort the object in ascending order with car type
        Arrays.sort(carArray, (Car obj1, Car obj2)->obj1.carType.compareTo(obj2.carType));

        for(Car car: carArray){
            System.out.println(car.carName +" "+car.carType);
        }
    }
}
