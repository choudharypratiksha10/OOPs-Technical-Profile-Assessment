import java.util.Scanner;

interface Filterable {
    void apply_filter(String type);
    void reset_filter();
}

class ImageProcessor implements Filterable {
    public void apply_filter(String type) {
        System.out.println("Image filter: " + type);
    }
    public void reset_filter() {
        System.out.println("Image reset");
    }
}

class DataAnalyzer implements Filterable {
    public void apply_filter(String type) {
        System.out.println("Data filter: " + type);
    }
    public void reset_filter() {
        System.out.println("Data reset");
    }
}

class TestFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter filter type: ");
        String type = sc.nextLine();

        Filterable f1 = new ImageProcessor();
        Filterable f2 = new DataAnalyzer();

        f1.apply_filter(type);
        f2.apply_filter(type);
    }
}