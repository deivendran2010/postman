package demo.springbootpostman.service;

import demo.springbootpostman.model.employee;

import java.util.List;

public interface serviceemployee

{


public List<employee> getAllEmployee();
public employee getById(Long id);
public void saveupdate(employee employee);
public void deleteEmployeeId(Long id);








}
