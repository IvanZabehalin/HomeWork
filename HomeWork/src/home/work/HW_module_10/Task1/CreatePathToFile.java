package home.work.HW_module_10.Task1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreatePathToFile {
    File file = new File("D:\\MyWork\\Java\\goItHomeWork\\HomeWork\\src\\home\\work\\HW_module_10\\Task1\\PhoneNumbers.txt");
    Scanner scanner = new Scanner(System.in);

    public String createPathToFile() {
        System.out.println("Задайте шлях до файлу");
        String filePath = scanner.nextLine();
        System.out.println("Задайте назву файлу та розширення");
        String fileName = scanner.nextLine();
        return filePath + fileName;
    }

    public void createFile() throws IOException {
        //file = new File(new CreatePathToFile().createPathToFile());
        //яккщо файл не існує, то створюемо його
        if (!file.exists()) {
            boolean newFile = file.createNewFile();
            System.out.println("File is exists");
        }
        new WritePhoneNumber().writeNumberInFile(String.valueOf(file));
        new ReadPhoneNumber().readPhoneNumber(String.valueOf(file));
    }
}
