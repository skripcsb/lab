import java.util.regex.*;

public class NumberFinder {
    public static void main(String[] args) {
        String text = "Цена товара составляет 1999.99 рублей, а стоимость доставки — 499.99 рублей.";
        Pattern pattern = Pattern.compile("\\d+\\.\\d+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}