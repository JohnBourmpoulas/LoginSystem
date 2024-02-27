import java.util.HashMap;

public class IdAndPasswords {
    
    private HashMap<String,String> loginInfo = new HashMap<String,String>();

    public IdAndPasswords(){
        loginInfo.put("jack", "password");
        loginInfo.put("test", "abc123");
        loginInfo.put("Zac", "dogfood");
    }

    public HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }
}
