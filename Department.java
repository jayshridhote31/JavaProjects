public class Employee {
    static void taxRate;
    static {
        taxRate = 18.0;
        System.out.println("Common Tax Rate initialized to: "+taxRate+ "%");
    }
}
public class Main{
    public static void main(String[] args){
        Employee e1 = new Employee();
        Employee e2 = new Employee();
    }
}
