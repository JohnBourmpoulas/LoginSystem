public class Main {
    public static void main(String[] args) throws Exception {
        IdAndPasswords idandPasswords = new IdAndPasswords();
        
        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());
    
    }
}
