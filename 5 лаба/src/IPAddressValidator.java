import java.util.regex.*;

public class IPAddressValidator {
    public static void main(String[] args) {
        String ip = "132.198.1.1";
        Pattern pattern = Pattern.compile("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
        Matcher matcher = pattern.matcher(ip);
        if (matcher.matches()) {
            System.out.println("Valid IP address!");
        } else {
            System.out.println("Invalid IP address!");
        }
    }
}