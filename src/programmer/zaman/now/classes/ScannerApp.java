package programmer.zaman.now.classes;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nama : ");
        String nama = scanner.nextLine();

        System.out.print("Umut : ");
        Integer age = scanner.nextInt();

        System.out.println("Hello, ".concat(nama).concat(", Umur anda adalah ").concat(age.toString()));
    }
}
