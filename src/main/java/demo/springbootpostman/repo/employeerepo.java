package demo.springbootpostman.repo;

import org.springframework.data.repository.CrudRepository;
import demo.springbootpostman.model.employee;

public interface employeerepo extends CrudRepository<employee,Long>
{
}
