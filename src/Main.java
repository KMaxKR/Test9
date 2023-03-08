import testPackage.Employee;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("", 18);
        Employee employee2 = new Employee("", 19);

        employee1.setName("K. Max");
        employee2.setName("K. Max");

        System.out.println(employee1.equals(employee2));


        Set<Employee> list = new HashSet<>();
        list.add(new Employee("K", 18));
        list.add(new Employee("A", 19));


        System.out.println(list.size());

    }
}