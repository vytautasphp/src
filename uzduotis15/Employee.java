package uzduotis15;

public class Employee {

    private String name;

   public Employee(String name) {
       this.name = name;
   }

    public int compareTo(Employee e2) {
        Employee employee = (Employee) e2;
        return name.compareTo(employee.name);
    }
        @Override
        public String toString() {
            return "Vardas: " + name;

    }
}
