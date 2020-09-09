import Interfaceses.ISender;
import Interfaceses.ITariff;
import Language.Turkish;
import Model.MessageDTO;
import Model.UserDTO;
import Model.CompanyDTO;
import Service.SenderService;
import Exception.CountExceedException;
import Tariff.MailTariff;
import Tariff.SmsTariff;

import java.util.ArrayList;
import java.util.List;


public class main {
    public static void main(String[] args) throws CountExceedException {
        //UserDTO senderCompany = new UserDTO();
        //senderCompany.setUserName("YAKAN A.S.");
        //senderCompany.setLanguage(new Turkish());
        CompanyDTO senderCompany = new CompanyDTO();
        senderCompany.setCompanyName("YAKAN A.S.");
        senderCompany.setLanguage(new Turkish());
        senderCompany.setCompanyOwnedTariffs(new SmsTariff(1000));
        senderCompany.setCompanyOwnedTariffs(new MailTariff(1000, senderCompany));

        List<ITariff> tariffs = new ArrayList<>();
        tariffs.add(new SmsTariff());

        UserDTO receiver1 = new UserDTO();
        receiver1.setUserName("Sila");
        receiver1.setUserSurname("Eryilmaz");
        receiver1.setUserEmail("slaeryilmaz3@gmail.com");
        receiver1.setUserPhone("05077780056");

        UserDTO receiver2 = new UserDTO();
        receiver2.setUserName("Mahmut");
        receiver2.setUserSurname("Yakan");
        receiver2.setUserEmail("mahmut_yakan44@hotmail.com");
        receiver2.setUserPhone("05077780056");

        List<UserDTO> customers = new ArrayList<>();
        customers.add(receiver1);
        customers.add(receiver2);

        MessageDTO messageDTO = new MessageDTO();
        messageDTO.setText("Hello TechTalent");
        messageDTO.setReceiver(customers);
        messageDTO.setSender(senderCompany);


        List<ISender> senders=new ArrayList<>();
        senders.add(new EmailSender(new MailValidator()));
        senders.add(new SmsSender(new SmsValidator()));

        SenderService senderService = new SenderService(senders);
        senderService.sendMessage(messageDTO);
        /*
        * //Firma oluştur
        CompanyDTO company1 = new CompanyDTO("Yakan A.Ş.");

        //Firma paketi tanımlanacak


        //USER LIST
            //User1
        UserDTO user1 = new UserDTO();
        user1.setUserName("Ece");
        user1.setUserSurname("Eren");
        user1.setUserPhone("05326670399");
        user1.setUserEmail("eceren@gmail.com");

            //User2
        // Userları listeye alan list class(Gönderici grubu)

        //MessageDTO ile mesajı gönderen firma ve alıcı firma tanımı yapılacak.

        List<ISender> senders=new ArrayList<>();
        senders.add(new EmailSender(new MailValidator()));
        senders.add(new SmsSender(new SmsValidator()));

        SenderService senderService = new SenderService(senders);
        senderService.sendMessage(messageDto);
        *
        * */

    }
}
