import java.util.HashMap;

public class IdAndPasswords {
    
    private HashMap<String,String> loginInfo = new HashMap<String,String>();

    public IdAndPasswords(){
        loginInfo.put("John", "password");
        loginInfo.put("Cathy", "abc123");
        loginInfo.put("Zac", "dogfood");
    }

    public HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }
}
