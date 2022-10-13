import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String nama;
        int NIM;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nama anda: ");
        nama = keyboard.nextLine();

        System.out.print("NIM: ");
        NIM = keyboard.nextInt();//ini adalah comment
    }
}