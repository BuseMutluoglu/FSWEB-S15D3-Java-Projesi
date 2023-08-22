package com.workintech.S15D3.model;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Employee employee1=new Employee(1,"Buse","Mutlu");
        Employee employee2=new Employee(2,"Omer","Omer");
        Employee employee3=new Employee(3,"Milan","Milan");
        Employee employee4=new Employee(4,"Buse","Mutlu");

        List<Employee> employees=new LinkedList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(new Employee(5,"San", "waa"));

        System.out.println(employees);

        Map<Integer, Employee> employeeMap=new HashMap<>();
        List<Employee> removedEmployees=new ArrayList<>();

        Iterator<Employee> iterator= employees.iterator(); //Collectionsa iterator kullanılır
        while (iterator.hasNext()){
            Employee employee=  iterator.next();
            if(employeeMap.containsKey(employee.getId())){
                removedEmployees.add(employee);
            } else employeeMap.put(employee.getId(),employee);
        }

        removedEmployees.clear();
        System.out.println(removedEmployees);
        System.out.println(employeeMap);


    }
}
