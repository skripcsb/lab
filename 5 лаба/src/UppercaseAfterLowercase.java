import java.util.regex.*;

public class UppercaseAfterLowercase {
    public static void main(String[] args) {
        String text = "аммонитыНазвалиВЧестьДревнеегипетскогоБогаАмона";
        Pattern pattern = Pattern.compile("(?<=[а-я])(?=[А-Я])");
        Matcher matcher = pattern.matcher(text);
        String result = matcher.replaceAll("!");
        System.out.println(result);
    }
}