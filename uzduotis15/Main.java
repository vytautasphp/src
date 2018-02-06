package uzduotis15;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Antanas"));
        list.add(new Employee("Petras"));
        list.add(new Employee("Ona"));
        list.add(new Employee("Juozas"));


        list.sort((e1, e2) -> e1.compareTo(e2));

        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
}