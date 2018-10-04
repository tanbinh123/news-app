package pl.braintelligence.requirement.task.domain.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY)
public class InvalidEntityException extends RuntimeException {

    public InvalidEntityException(ErrorCode code) {
        super(code.toString());
    }
}

