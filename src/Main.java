package LoginSystem;
public class Main {

    public static void main(String[] args) {

        LoginSystem.IDandPasswords idandPasswords = new LoginSystem.IDandPasswords();
        LoginSystem.LoginPage loginPage = new LoginSystem.LoginPage(idandPasswords.getLoginInfo());

    }
}
