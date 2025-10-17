package org.example.Factory;

public class Client {
    public static void main(String [] args)
    {
       Employee employee1=EmployeeFactory.getEmployee("javafullstackdeveloper");
       System.out.println(employee1.getSalary());

        Employee employee2=EmployeeFactory.getEmployee("mernstackdeveloper");
        System.out.println(employee2.getSalary());

        Employee employee3=EmployeeFactory.getEmployee("frontenddeveloper");
        System.out.println(employee3.getSalary());

    }

}
