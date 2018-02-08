package Challenges.HidePasswordFromJdbc;


public class PasswordHider {

    public static String hidePasswordFromConnection(String urlString) {
        int start = urlString.indexOf("password=") + "password=".length();
        int end = urlString.indexOf('&', start);
        if (end > 0) {
            return urlString.substring(0, start) + String.join("", java.util.Collections.nCopies(end - start, "*")) + urlString.substring(end);
        } else {
            return urlString.substring(0, start) + String.join("", java.util.Collections.nCopies(urlString.length() - start, "*"));
        }
    }
}
