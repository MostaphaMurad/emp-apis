package com.empapis.Services;

import com.empapis.Models.Employee;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface EmployeeServices {
    List<Employee>getEmployees() throws InterruptedException;
    Employee findEmployee(Integer id);
    Employee saveEmployee(Employee employee);
    boolean deleteEmployee(Integer id) throws Exception;
    Employee updateEmployee(Employee employee);

}
