import Model.MessageDTO;
import Exception.CountExceedException;

public class MailValidator implements IValidator {
    @Override
    public boolean isValid(MessageDTO messageDto) throws CountExceedException {
        // todo : exception

        if(messageDto.getSender().isExceedEmail()){
            throw new CountExceedException(messageDto.getSender().getLanguage().print("Mail"));
        }
        return  messageDto.getReceiver()!=null;
        /*
        * for (UserDTO userObject: messageDto.getReceiver())
        {
            if(messageDto.getSender().isExceedEmail()){

                throw new CountExceedException(messageDto.getSender().getLanguage().print("Mail"));
            }
            return  userObject.getUserEmail()!=null;
        }*/
    }
}
