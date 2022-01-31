package mk.ukim.finki.employeemanager.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class InvalidEmployeeIdException extends RuntimeException {
    public InvalidEmployeeIdException(Long id) {
        super(String.format("Employee with id: %d was not found", id));
    }
}
