import java.util.Scanner;

public class latihan_soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Masukkan angka");
            int angka =
            scanner.nextInt();

            if(angka == 0) {
                System.out.println("Angka adalah NOL");
            } else if (angka % 2 == 0)
            {
                System.out.println("Angkanya Genap");
            } else {
                System.out.println("Angkanya Ganjil");
    }
    scanner.close();
}

// Melihat beberapa refernsi dari StackOverflow 
