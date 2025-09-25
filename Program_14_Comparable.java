import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Car1 implements Comparable<Car1>{
    String carName;
    String carType;

    Car1(String name, String type){
        this.carName = name;
        this.carType=type;
    }

    @Override
    public int compareTo(Car1 o) {
        return this.carType.compareTo(o.carType);
    }
}

public class Program_14_Comparable {
    public static void main(String[] args){
        List<Car1> cars = new ArrayList<>();
        cars.add(new Car1("SUV","Petrol"));
        cars.add(new Car1("Sedan","Diesel"));
        cars.add(new Car1("HatchBack","CNG"));

        //sort using comparable
        Collections.sort(cars);

        for(Car1 car: cars){
            System.out.println(car.carName +" "+car.carType);
        }
    }
}
