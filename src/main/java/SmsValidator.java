import Model.MessageDTO;
import Exception.CountExceedException;

public class SmsValidator implements IValidator{
    @Override
    public boolean isValid(MessageDTO messageDto) throws CountExceedException {
        // todo : exception

        if(messageDto.getSender().isExceedSms()){
            throw new CountExceedException(messageDto.getSender().getLanguage().print("Sms"));
        }
        return  messageDto.getReceiver()!=null;
    }
}
