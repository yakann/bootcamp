import Model.MessageDTO;
import Exception.CountExceedException;

public interface IValidator {
    boolean isValid(MessageDTO messageDto) throws CountExceedException;
}