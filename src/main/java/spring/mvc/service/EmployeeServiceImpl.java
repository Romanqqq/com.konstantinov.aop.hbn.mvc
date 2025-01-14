package spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.mvc.dao.EmployeeDAO;
import spring.mvc.entity.Employee;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }


    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    @Override
    @Transactional
    public Employee getEmployee(int id) {
        return employeeDAO.getEmployees(id);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
     employeeDAO.deleteEmployee(id);

    }
}
