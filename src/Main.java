/**
 * @author Benjamin "BAWG" Gustavsen
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Number number = new Number();
        Text text = new Text();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(number.zero());
        numbers.add(number.one(10));
        numbers.add(number.two(10, 10));
        System.out.println("Original Numbers:\n" + numbers);

        List<Integer> NumbersOver90 = numbers
                .stream()
                .filter(integer -> integer > 90)
                .collect(Collectors.toList());
        System.out.println("Filtered Numbers:\n" + NumbersOver90);

        List<String> texts = new ArrayList<>();
        texts.add(text.zero());
        texts.add(text.one("one parameter"));
        texts.add(text.two("method with", "two parameters"));
        System.out.println("Original Strings:\n" + texts);

        List<String> textsOver15 = texts
                .stream()
                .filter(string -> string.length() > 15)
                .collect(Collectors.toList());
        System.out.println("Filtered Strings:\n" + textsOver15);
    }
}