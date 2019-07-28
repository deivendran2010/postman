package demo.springbootpostman.service;

import demo.springbootpostman.model.employee;
import demo.springbootpostman.repo.employeerepo;
import demo.springbootpostman.service.serviceemployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class empserviceimpl implements serviceemployee {

  @Autowired
  employeerepo ep;


    @Override
    public List<employee> getAllEmployee() {
        return (List<employee>)ep.findAll();
    }

    @Override
    public employee getById(Long id) {
        return ep.findById(id).get();
    }

    @Override
    public void saveupdate(employee employee) {
      ep.save(employee);
    }

    @Override
    public void deleteEmployeeId(Long id) {
        ep.deleteById(id);

    }
}
