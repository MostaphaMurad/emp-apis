package com.empapis.ServicesImp;

import com.empapis.Models.Employee;
import com.empapis.Repository.EmpRepository;
import com.empapis.Services.EmployeeServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class EmployeeServicesImp implements EmployeeServices {
    private final EmpRepository empRepository;
    @Override
    public List<Employee> getEmployees() {
        return empRepository.findAll();
    }
    @Override
    public Employee findEmployee(Integer id) {
       return empRepository.findById(id).get();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return empRepository.save(employee);
    }

    @Override
    public boolean deleteEmployee(Integer id) throws Exception {
        try {
            empRepository.deleteById(id);
            return true;
        }catch (Exception e){
            throw new Exception("cant delete employee");
        }
    }

    @Override
    public Employee updateEmployee(Employee employee) {
       Employee old=empRepository.findById(employee.getId()).get();
       old.setAddress(employee.getAddress());
       old.setName(employee.getName());
       old.setEmail(employee.getEmail());
       old.setPhone(employee.getPhone());
       old.setJobTitle(employee.getJobTitle());
       return empRepository.save(old);
    }
}
