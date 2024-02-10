package second_java_project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SimpleTextEditor {
    private static ArrayList<String> document = new ArrayList<>();
    private static File currentFile;

    public static void main(String[] args) {
        currentFile = new File("C:\\\\Users\\\\정동진\\\\Desktop\\\\default.txt"); // Set a default file path

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. New Document");
            System.out.println("2. Import Document");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    newDocument(scanner);
                    break;
                case 2:
                    importDocument(scanner);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void newDocument(Scanner scanner) {
        document.clear();
        currentFile = new File("C:\\Users\\정동진\\Desktop\\default.txt"); // Set a default file path

        while (true) {
            System.out.println("Enter text (TAB to finish):");
            String line = scanner.nextLine();

            if (line.equals("\t")) {
                break;
            }

            document.add(line);
        }

        printDocument();
        editMenu(scanner);
    }


    private static void importDocument(Scanner scanner) {
        System.out.println("Enter file path to import:");
        String filePath = scanner.nextLine();
        currentFile = new File(filePath);

        try (Scanner fileScanner = new Scanner(currentFile)) {
            document.clear();

            while (fileScanner.hasNextLine()) {
                document.add(fileScanner.nextLine());
            }

            System.out.println("Document imported successfully.");
        } catch (IOException e) {
            System.out.println("Error importing document: " + e.getMessage());
        }

        printDocument();
        editMenu(scanner);
    }

    private static void editMenu(Scanner scanner) {
        while (true) {
            System.out.println("1. Modify Text");
            System.out.println("2. Save and Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    modifyText(scanner);
                    break;
                case 2:
                    saveDocument();
                    System.out.println("Document saved successfully.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void saveDocument() {
        try (FileWriter writer = new FileWriter(currentFile)) {
            for (String line : document) {
                writer.write(line + System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Error saving document: " + e.getMessage());
        }
    }

    private static void modifyText(Scanner scanner) {
        printDocument();
        System.out.println("Enter line number to modify:");

        int lineNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (lineNumber >= 1 && lineNumber <= document.size()) {
            System.out.println("Enter new text:");
            String newLine = scanner.nextLine();
            document.set(lineNumber - 1, newLine);
            printDocument();
        } else {
            System.out.println("Invalid line number. Please try again.");
        }
    }

    private static void printDocument() {
        System.out.println("Document Content:");
        for (String line : document) {
            System.out.println(line);
        }
    }
}