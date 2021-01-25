package password;

public class Main {

    public static void main(String[] args) {
        String password = "123asd123A_";
        Password pd = new PasswordSimple();
        Password pm = new PasswordIntermedia();
        Password pf = new PasswordFuerte();

        pd.setValue(password);
        pm.setValue(password);
        pf.setValue(password);
    }
}
