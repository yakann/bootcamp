package Model;
import Language.ILanguage;

public class UserDTO {
    private String userName;
    private String userSurname;
    private String userPhone;
    private String userEmail;


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

}
