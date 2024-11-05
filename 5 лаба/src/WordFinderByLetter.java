import java.util.regex.*;

public class WordFinderByLetter {
    public static void main(String[] args) {
        String text = "Зубы мегалодона вырастали до 18 см в длину";
        char letter = 'м';
        Pattern pattern = Pattern.compile("\\b" + letter + "[а-яА-Я]*\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}