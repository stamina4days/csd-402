import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Random;
import java.util.Scanner;

/**
 * Author: Prince Hubbard
 * Course: CSD402 Java for Programmers
 * Assignment: Module 9.2 - Program 2
 * Creates or appends to data.file, then reopens and displays its contents.
 */
public class PrinceFileIOTest {
    /** @param args command-line arguments (not used) */
    public static void main(String[] args) {
        Path file = Paths.get("data.file");
        Random random = new Random();

        try {
            boolean hasExistingData = Files.exists(file) && Files.size(file) > 0;

            // CREATE makes a missing file; APPEND preserves existing numbers.
            try (BufferedWriter writer = Files.newBufferedWriter(file,
                    StandardCharsets.UTF_8, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND)) {
                if (hasExistingData) {
                    writer.write(" ");
                }
                for (int count = 0; count < 10; count++) {
                    if (count > 0) {
                        writer.write(" ");
                    }
                    writer.write(Integer.toString(random.nextInt(100)));
                }
            }

            // The writer is closed before the file is reopened for reading.
            System.out.println("Added 10 random integers (0 through 99) to data.file.");
            System.out.println("File location: " + file.toAbsolutePath());
            System.out.println("All numbers in data.file:");
            try (Scanner reader = new Scanner(file, StandardCharsets.UTF_8.name())) {
                boolean first = true;
                while (reader.hasNextInt()) {
                    if (!first) {
                        System.out.print(" ");
                    }
                    System.out.print(reader.nextInt());
                    first = false;
                }
                System.out.println();
            }
        } catch (IOException exception) {
            System.out.println("Unable to access data.file: " + exception.getMessage());
        }
    }
}
