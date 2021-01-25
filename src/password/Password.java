package password;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    private final String regex;
    private String password;

    public Password(String regex) {
        this.regex = regex;
    }

    public void setValue(String pwd){
        Pattern pattern = Pattern.compile(this.regex);
        Matcher matcher = pattern.matcher(pwd);
        boolean match = matcher.matches();

        if(match){
            this.password = pwd;
            System.out.println("la contraseña ha sido modificada correctamente");
        } else {
            throw new RuntimeException("La contraseña no cumple con el formato requerido ");
        }
    }
}
