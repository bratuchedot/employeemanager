package mk.ukim.finki.employeemanager.service;

import mk.ukim.finki.employeemanager.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee employee);

    List<Employee> findAllEmployees();

    Employee findEmployeeById(Long id);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(Long id);

}
