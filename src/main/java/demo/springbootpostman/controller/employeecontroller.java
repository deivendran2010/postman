package demo.springbootpostman.controller;


import demo.springbootpostman.model.employee;
import demo.springbootpostman.service.serviceemployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value="/api")
public class employeecontroller
{


@Autowired
serviceemployee ser;



@PostMapping("save")
    public employee save(@RequestBody employee employee)
{
    ser.saveupdate(employee);
    return employee;


}
@GetMapping("/list")
    public List<employee> list()
{
    return ser.getAllEmployee();
}



    @GetMapping("/list/{id}")
    public employee getbyId(@PathVariable Long id) {
    return ser.getById(id);
}



}
