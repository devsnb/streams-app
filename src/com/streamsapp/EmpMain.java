package com.streamsapp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EmpMain {
    public static void main(String[] args) {
        List<Employee> empList;

        Employee emp1 = new Employee("Snehangshu", "Kolkata", "123");
        Employee emp2 = new Employee("Rajsekhar", "Bangalore", "124");
        Employee emp3 = new Employee("Arun", "Mangalore", "125");
        Employee emp4 = new Employee("Sharmila", "Bangalore", "126");
        Employee emp5 = new Employee("Sabbu", "UP", "127");

        empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5);

//        Printing all Elements in the List
        System.out.println("Employees : ");
        for (Employee employee : empList) {
            System.out.println(employee);
        }

//        Sorting the empList
        List<Employee> filteredEmployees;

        filteredEmployees = empList.stream().filter(employee -> Objects.equals(employee.getCity(), "Bangalore")).collect(Collectors.toList());

        System.out.println("Filtered Employees :");
        System.out.println(filteredEmployees);

//        Sorting the empList
        List<Employee> sortedEmployees;

        sortedEmployees = empList.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee first, Employee second) {
                return first.getCity().compareTo(second.getCity());
            }
        }).collect(Collectors.toList());

        System.out.println("Sorted Employees");
        System.out.println(sortedEmployees);

//        Get Employee By id
        try {
            Employee foundEmployee = empList.stream()
                    .filter(employee -> Objects.equals(employee.getEid(), "126"))
                    .findFirst().orElseThrow(() -> new Exception("Not Found"));
            System.out.println("First found employee with the if of 126");
            System.out.println(foundEmployee);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

//        Printing all employees whose name start with k
        try {
            Employee myEmp;
            myEmp = empList.stream()
                    .filter(employee -> employee.getName().startsWith("k"))
                    .findFirst().orElseThrow(() -> new Exception("Not in first place"));
            System.out.println("Employee :");
            System.out.println(myEmp);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
