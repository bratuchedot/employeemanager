package mk.ukim.finki.employeemanager.repository;

import mk.ukim.finki.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
