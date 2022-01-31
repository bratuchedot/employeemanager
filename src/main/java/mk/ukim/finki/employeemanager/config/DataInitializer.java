package mk.ukim.finki.employeemanager.config;

import mk.ukim.finki.employeemanager.model.Employee;
import mk.ukim.finki.employeemanager.service.EmployeeService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataInitializer {

    private final EmployeeService employeeService;

    public DataInitializer(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostConstruct
    public void initData() {
        employeeService.addEmployee(new Employee(
                "Jay Navarro",
                "jaynavarro@employee.com",
                "Java Programmer",
                "123123123",
                "https://www.bootdey.com/app/webroot/img/Content/avatar/avatar1.png"));
        employeeService.addEmployee(new Employee(
                "Maverick Glover",
                "maverickglover@employee.com",
                "Java Programmer",
                "123222222",
                "https://www.bootdey.com/app/webroot/img/Content/avatar/avatar2.png"));
        employeeService.addEmployee(new Employee(
                "Kara Ramirez",
                "kararamirez@employee.com",
                "UI/UX Designer",
                "123333333",
                "https://www.bootdey.com/app/webroot/img/Content/avatar/avatar3.png"));
        employeeService.addEmployee(new Employee(
                "Rocco Smirnov",
                "roccosmirnov@employee.com",
                "UI/UX Designer",
                "123333222",
                "https://www.bootdey.com/app/webroot/img/Content/avatar/avatar4.png"));
        employeeService.addEmployee(new Employee(
                "Vincent Casey",
                "vincentcasey@employee.com",
                "Python Developer",
                "123333111",
                "https://www.bootdey.com/app/webroot/img/Content/avatar/avatar5.png"));
        employeeService.addEmployee(new Employee(
                "Emily Johns",
                "emilyjohns@employee.com",
                "UI/UX Designer",
                "123121212",
                "https://www.bootdey.com/app/webroot/img/Content/avatar/avatar8.png"));
    }

}
