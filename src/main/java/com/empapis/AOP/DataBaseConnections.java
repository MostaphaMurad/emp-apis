package com.empapis.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author: Mostafa Murad
 * @created: 1/8/2023 on 1:57 PM
 **/
@Aspect
@Component
@Order(value = 2)
public class DataBaseConnections {
    //* com.empapis..ServicesImp..*(..)
    @Before(value = "execution(* com.empapis.ServicesImp.EmployeeServicesImp.findEmployee(Integer))" )
    public void connectionTest(){
        System.out.println("connected");
    }
    @After(value = "execution(* com.empapis.ServicesImp.EmployeeServicesImp.getEmployees()))")
    public void endConnection(){
        System.out.println("connectio n ended ");
    }
}
