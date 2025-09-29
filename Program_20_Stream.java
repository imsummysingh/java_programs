import java.util.ArrayList;
import java.util.List;

public class Program_20_Stream {
    public static void main(String[] args){
        List<Integer> salaryList = new ArrayList<>();
        salaryList.add(2000);
        salaryList.add(3100);
        salaryList.add(1000);
        salaryList.add(5100);
        salaryList.add(9000);
        salaryList.add(2900);

        //Find salary > 3000
        //normal way
        int count=0;
        for(Integer val:salaryList){
            if(val>3000){
                count++;
            }
        }
        System.out.println("Total Emp with salary>3000: "+count);

        //stream way
        long output = salaryList.stream().filter((Integer val)->val>3000).count();
        System.out.println("Total Emp with salary>3000: "+output);
    }
}
