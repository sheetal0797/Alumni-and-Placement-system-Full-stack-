package com.example.project.controller;
import com.example.project.bean.Employees;
import com.example.project.service.EmployeeService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import java.net.URISyntaxException;

@Path("employee")
public class EmployeeController {
    EmployeeService employeeService=new EmployeeService();
    @POST
    @Path("/login")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response loginStudent(Employees employees) throws URISyntaxException {
        if(employeeService.verifyEmail(employees) && employeeService.verifyPassword(employees)){
            return Response.ok().build();
        }else{
            return Response.status(203).build();
        }
    }
}
