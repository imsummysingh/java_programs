class Employee03{
    int empId;

    public int getEmpId(){
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}

public class Program_03_ClassNonPrimitiveType {

    public static void main(String[] args){
        Employee03 e = new Employee03();
        e.empId=101;
        System.out.println("EmpId: "+e.empId);
        modify(e);
        System.out.println("EmpId after object value modified: "+e.empId);
    }

    private static void modify(Employee03 emp){
        emp.empId=111;
    }

}
