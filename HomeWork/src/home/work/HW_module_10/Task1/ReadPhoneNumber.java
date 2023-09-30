package home.work.HW_module_10.Task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ReadPhoneNumber {

    public void readPhoneNumber(String st) throws IOException {
        System.out.println("\nPhone Numbers:");

        try (BufferedReader reader = new BufferedReader(new FileReader(st))) {

            String line;
            Pattern pattern = Pattern.compile("\\(\\d{3}\\) \\d{3}-\\d{4}|\\d{3}-\\d{3}-\\d{4}");

            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.matches()) {
                    System.out.println(line);
                }
            }
        }
    }
}
