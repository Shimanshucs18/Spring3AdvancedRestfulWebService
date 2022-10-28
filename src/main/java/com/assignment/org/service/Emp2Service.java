package com.assignment.org.service;

import com.assignment.org.entity.Employee;
import org.springframework.stereotype.Component;


import java.util.Arrays;
import java.util.List;

@Component
public class Emp2Service {

    private static List<Employee> empList;

    static{
        empList=Arrays.asList(new Employee("Shimanshu",10001l,"password12"),
                new Employee("Yogi",10002l,"Password13"),
                new Employee("Modi",10003l,"Pas@13"));
    }

    public List<Employee> getAll(){
        return empList;
    }
    public void addOne(Employee e){
        empList.add(e);
    }
    public void delOne(long id){
        empList.removeIf(e->e.getId()==id);
    }

}
