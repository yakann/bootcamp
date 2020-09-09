package Model;

//import org.graalvm.compiler.lir.LIRInstruction;

import java.util.List;

public class MessageDTO {

    private CompanyDTO sender;
    private List<UserDTO> receiver;
    private String text;

    public CompanyDTO getSender() { return sender; }

    public void setSender(CompanyDTO sender) {
        this.sender = sender;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<UserDTO> getReceiver() {
        return receiver;
    }

    public void setReceiver(List<UserDTO> receiver) {
        this.receiver = receiver;
    }
}
