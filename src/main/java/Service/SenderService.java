package Service;

import Interfaceses.ISender;
import Model.MessageDTO;
import Exception.CountExceedException;

import java.util.List;

public class SenderService {
    private List<ISender> senders;

    public SenderService(List<ISender> senders) {
        this.senders = senders;
    }

    public void sendMessage(MessageDTO messageDTO) throws CountExceedException {
        for (ISender sender : senders) {
            try {
                sender.send(messageDTO);
            } catch (CountExceedException exceedException){
                System.out.println(exceedException.getMessage());
            }

        }
    }
}

