package home.work.HW_module_10.Task1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WritePhoneNumber {


    public void writeNumberInFile(String st) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream(st,true);
        System.out.println("Write phone number");
        //String PhoneNumber = "Phone number :";
        String output = scanner.nextLine()+ "\n" ;
        fos.write(output.getBytes());
        fos.close();
        scanner.close();
    }
}
