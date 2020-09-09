import Interfaceses.ISender;
import Model.MessageDTO;
import Exception.CountExceedException;
import Model.UserDTO;

public class SmsSender implements ISender {

    private IValidator validator;

    public SmsSender(IValidator validator){
        this.validator=validator;
    }

    @Override
    public void send(MessageDTO messageDto) throws CountExceedException {
        if(validator.isValid(messageDto)){
            for (UserDTO userObject: messageDto.getReceiver()
                 ) {
                System.out.println( messageDto.getSender().getCompanyName()+
                        " is sending this SMS: " +messageDto.getText() +
                        "to " +userObject.getUserName() );
                messageDto.getSender().increaseSmsCount();
            }
        }
    }
}
