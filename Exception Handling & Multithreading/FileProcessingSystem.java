class FileProcessingSystem {
    public static void main(String[] args) {

        try {
            System.out.println("Reading file...");
            int a = 10 / 2; // simulate work
        } catch (Exception e) {
            System.out.println("Error while reading file");
        } finally {
            System.out.println("Closing file resources");
        }
    }
}