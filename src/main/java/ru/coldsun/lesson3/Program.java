package ru.coldsun.lesson3;

import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Employee> employees = Worker.getEmployees(10);
        employees.addAll(Freelancer.getEmployees(10));

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        Collections.sort(employees, new EmployeeNameComparator());
        System.out.println();

        for (Employee employee: employees) {
            System.out.println(employee);
        }

    }

}
