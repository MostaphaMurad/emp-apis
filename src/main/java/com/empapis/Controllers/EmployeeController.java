package com.empapis.Controllers;

import com.empapis.Models.Employee;
import com.empapis.ServicesImp.EmployeeServicesImp;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/emp/v1/api")
@AllArgsConstructor
@CrossOrigin("http://localhost:4200")
public class EmployeeController {
    private EmployeeServicesImp employeeServicesImp;
    @GetMapping("/home")
    public String home(@RequestHeader("Accept-Language")String lang){
        System.out.println(lang);
        return "ok";
    }
    @GetMapping(value = "/emps",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Employee>>getEmployees() throws InterruptedException {
      //  System.out.println(lang);
        return new ResponseEntity<>(employeeServicesImp.getEmployees(), OK);
    }
    @PostMapping("/save")
    public ResponseEntity<Employee>saveEmployee(@RequestBody  Employee employee){
        return new ResponseEntity<>(employeeServicesImp.saveEmployee(employee),HttpStatus.CREATED);
    }
    @GetMapping("/findemp/{id}")
    public ResponseEntity<Employee>findEmployee(@PathVariable("id")Integer id){
        return new ResponseEntity<>(employeeServicesImp.findEmployee(id),OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean>deleteEmployee(@PathVariable("id")Integer id) throws Exception {
        return new ResponseEntity<>(employeeServicesImp.deleteEmployee(id),OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Employee>updateEmployee(@RequestBody Employee employee,@PathVariable("id")Integer id){
        return new ResponseEntity<>(employeeServicesImp.updateEmployee(employee),HttpStatus.ACCEPTED);
    }
}
