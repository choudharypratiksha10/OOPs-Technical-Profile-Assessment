import java.util.Scanner;

class Employee {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    float Calculate() {
        return basic + hra + da;
    }

    void havedata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Emp No: ");
        empno = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        ename = sc.nextLine();
        System.out.print("Basic: ");
        basic = sc.nextFloat();
        System.out.print("HRA: ");
        hra = sc.nextFloat();
        System.out.print("DA: ");
        da = sc.nextFloat();

        netpay = Calculate();
    }

    void dispdata() {
        System.out.println("Emp No: " + empno);
        System.out.println("Name: " + ename);
        System.out.println("Net Pay: " + netpay);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.havedata();
        e.dispdata();
    }
}