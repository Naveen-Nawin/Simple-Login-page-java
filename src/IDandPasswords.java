package LoginSystem;


import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    public IDandPasswords() {

        logininfo.put("Nawin", "126127");
        logininfo.put("Brometheus", "PASSWORD");
        logininfo.put("BroCode", "abc123");

    }

    public HashMap getLoginInfo() {
        return logininfo;
    }
}
