package Model;
import Language.ILanguage;

public class UserDTO {
    private String userName;
    private String userSurname;
    private String userPhone;
    private String userEmail;
    private ILanguage language;


    private static int emailCount;
    private static int smsCount;

    public ILanguage getLanguage() {
        return language;
    }

    public void setLanguage(ILanguage language) {
        this.language = language;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() { return userEmail; }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }


    public static int getEmailCount() {
        return emailCount;
    }

    public static void setEmailCount(int emailCount) {
        UserDTO.emailCount = emailCount;
    }

    public static int getSmsCount() {
        return smsCount;
    }

    public static void setSmsCount(int smsCount) {
        UserDTO.smsCount = smsCount;
    }

    public boolean isExceedEmail(){
        return emailCount>10000;
    }

    public boolean isExceedSms(){
        return smsCount>1000;
    }

    public void increaseEmailCount(){
        emailCount++;
    }

    public void increaseSmsCount(){
        smsCount++;
    }
}
