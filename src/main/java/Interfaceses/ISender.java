package Interfaceses;

import Model.MessageDTO;
import Exception.CountExceedException;

public interface ISender {
    void send(MessageDTO messageDTO) throws CountExceedException;
}
