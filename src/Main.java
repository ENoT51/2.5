//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final String REGEX = "^[a-zA-Z0-9_]*$";
    public static void main(String[] args) {
        try {
            checkAuthorization("adminN", "1234", "1234");
            System.out.println("Проверка пройдена");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Проверка не пройдена");;
        }
    }
    public static void checkAuthorization(String login, String password, String confirmPassword){
    if (login.length() > 20 ){
        throw new WrongLoginException();
        }
    if (!login.matches(REGEX)){
        throw new WrongLoginException();
    }
    if (password.length() > 20 ){
        throw new WrongPasswordException();
    }
    if (!password.matches(REGEX)){
        throw new WrongPasswordException();
    }
    if (!password.equals(confirmPassword)){
        throw new WrongPasswordException();
    }


    }
}