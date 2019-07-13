package employeeApp;
public class Main{    
    public static void main(String[] args){
        HealthPlan h1 = new HealthPlan("My health plan 1");
        HealthPlan h2 = new HealthPlan("My health plan 2");
        System.out.println(h1);
        System.out.println(h2);
        Company c1 = new Company("Company A", 1000);
        Employee empl1 = new Employee("Steve", "Green", 50000, true, c1.id, h1.getId());
        Employee empl2 = new Employee("May", "Ford", 80000, true, c1.id, h2.getId());
        System.out.println(empl1.getFname());
        System.out.println(empl2.getName());

    }
}
