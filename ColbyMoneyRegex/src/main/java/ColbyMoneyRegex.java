import java.util.regex.*;

public class ColbyMoneyRegex {

    public static void main(String[] args) {
        System.out.println("Problem 9: US Phone Number (xxx) xxx-xxxx");
        String text = "(987) 654-3210"; //positive case
        Pattern p = Pattern.compile("^\\(\\d{3}\\)\\s\\d{3}-\\d{4}$");
        Matcher m = p.matcher(text);
        if (m.find()) {
            System.out.println(text.substring(m.start(), m.end()) + " ");
        }
        text = "012-345-6789"; //negative case
        if (m.find()) {
            System.out.println(text.substring(m.start(), m.end()) + " ");
        }
        else { System.out.println("No match."); }

        System.out.println("\nProblem 10: US Social Security xxx-xx-xxxx");
        text = "420-69-1337"; //positive case
        p = Pattern.compile("^\\d{3}-\\d{2}-\\d{4}$");
        m = p.matcher(text);
        if (m.find()) {
            System.out.println(text.substring(m.start(), m.end()) + " ");
        }
        text = "012-345-6789"; //negative case
        if (m.find()) {
            System.out.println(text.substring(m.start(), m.end()) + " ");
        }
        else { System.out.println("No match."); }

        System.out.println("\nProblem 11: An odd number");
        text = "279"; //positive case
        p = Pattern.compile("^\\d*[13579]");
        m = p.matcher(text);
        if (m.find()) {
            System.out.println(text.substring(m.start(), m.end()) + " ");
        }
        text = "300"; //negative case
        if (m.find()) {
            System.out.println(text.substring(m.start(), m.end()) + " ");
        }
        else { System.out.println("No match."); }

        System.out.println("\nProblem 12: Email address xxx@xxx.(com|org|edu|net)");
        text = "blipblorp@jipjup.com"; //positive case
        p = Pattern.compile("^\\w+@\\w+\\.(com|org|edu|net)$");
        m = p.matcher(text);
        if (m.find()) {
            System.out.println(text.substring(m.start(), m.end()) + " ");
        }
        text = "billybob.net"; //negative case
        if (m.find()) {
            System.out.println(text.substring(m.start(), m.end()) + " ");
        }
        else { System.out.println("No match."); }

        System.out.println("\nProblem 13: A string that:\ncontains a and b only\nstarts and ends with a");
        text = "abbaabababaa"; //positive case
        p = Pattern.compile("^(a|a([ab])*a)$");
        m = p.matcher(text);
        if (m.find()) {
            System.out.println(text.substring(m.start(), m.end()) + " ");
        }
        text = "abc"; //negative case
        if (m.find()) {
            System.out.println(text.substring(m.start(), m.end()) + " ");
        }
        else { System.out.println("No match."); }

        System.out.println("\nProblem 14: US Zip Code such as 75007-1234 or 64082");
        text = "13579-2468"; //positive case
        p = Pattern.compile("^\\d{5}(-\\d{4})?$");
        m = p.matcher(text);
        if (m.find()) {
            System.out.println(text.substring(m.start(), m.end()) + " ");
        }
        text = "314159-beans"; //negative case
        if (m.find()) {
            System.out.println(text.substring(m.start(), m.end()) + " ");
        }
        else { System.out.println("No match."); }
    }
}
