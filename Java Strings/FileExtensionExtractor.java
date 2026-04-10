import java.util.Scanner;

class FileExtensionExtractor {
    public static void main(String[] args) {

        String fileName = "report.pdf"; // use given data or set null

        if (fileName == null) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter file name: ");
            fileName = sc.nextLine();
        }

        int index = fileName.lastIndexOf(".");
        String extension = fileName.substring(index + 1);

        System.out.println("File Extension: " + extension);
    }
}