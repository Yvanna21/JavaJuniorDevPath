package Streams_and_Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsLambdas {
    public static void main(String[] args) {
        List<Employee> employees=Arrays.asList(
            new Employee("Doe",  10000),
            new Employee("Jane", 8000),
            new Employee("Alice", 12000),
            new Employee("Bob",  9000),
            new Employee("Charlie", 11000),
            new Employee("David", 7000),
            new Employee("Emily", 63000),
            new Employee("Frank", 14000) // adding more employees for testing purposes.
        );
        double salaryThreshold =60000;
        //Using Stream API and Lambda Expression
        List<String> highSalariedEmployeeNames=employees.stream() //creates a stream from the employee list
                                                        .filter(employee -> employee.getSalary()>salaryThreshold) //filters employees whose salary exceeds the threshold
                                                        .map(Employee::getName) //maps filtered employees by retrieving only their name.
                                                        .collect(Collectors.toList()); //collects the names of filtered employees into a new list.
        System.out.println("Employees with salary above "+salaryThreshold+":");
        for (String name : highSalariedEmployeeNames) { //A for loop is used to iterate through the list of filtered employee names and display them.
            System.out.println(name);
        }
    }
}
