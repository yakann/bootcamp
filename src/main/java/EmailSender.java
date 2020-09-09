import Exception.CountExceedException;
import Interfaceses.ISender;
import Model.MessageDTO;
import Model.UserDTO;

public class EmailSender implements ISender {

    private IValidator validator;

    public EmailSender(IValidator validator) {
        this.validator = validator;
    }

    @Override
    public void send(MessageDTO messageDto) throws CountExceedException {
        if (validator.isValid(messageDto)) {
            for (UserDTO userObject: messageDto.getReceiver())
            {
                System.out.println(messageDto.getSender().getUserName() +
                        " is sending this Mail: " + messageDto.getText() +
                        "to " + userObject.getUserName());
                messageDto.getSender().increaseEmailCount();
            }

        }
    }
}
