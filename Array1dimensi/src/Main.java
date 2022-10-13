import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] angka = new int[5];

        Scanner scan = new Scanner(System.in);

        for(int i =0; i<angka.length; i++){
            System.out.print("angka ke-" + i + ": ");
            angka[i] = scan.nextInt();
        }

        System.out.println("---------------------------");

        for(int a : angka){
            System.out.println(a);
        }
    }
}