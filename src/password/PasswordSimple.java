package password;

public class PasswordSimple extends Password{
    public PasswordSimple() {
        super("^(?=.*[0-9])(?=.*[a-z])(?=\\S+$).{8,20}$");
    }
}
