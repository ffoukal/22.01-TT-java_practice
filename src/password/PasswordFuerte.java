package password;

public class PasswordFuerte extends Password{

    public PasswordFuerte() {
        super("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=._,])(?=\\S+$).{8,20}$");
    }
}
