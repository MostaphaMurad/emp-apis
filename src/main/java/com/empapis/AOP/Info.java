package com.empapis.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author: Mostafa Murad
 * @created: 1/8/2023 on 4:11 PM
 **/
@Aspect
@Component
@Order(value = 1)
public class Info {
    @Before(value = "execution(* com.empapis.ServicesImp.EmployeeServicesImp.findEmployee(Integer))")
    public void end(){
        System.out.println("end .................");
    }
}
