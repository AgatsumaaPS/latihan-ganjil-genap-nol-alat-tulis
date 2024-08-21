import java.util.Scanner;
public class latihan_soal_alattulis {

    public static void main(String[] args) {
        String[] suplai = {"Pensil", "Penghapus", "Buku Tulis", "Spidol"};

        if (args.length == 0) {
            System.out.println("Pilihlah Angka 1-4");
            return;
        }
        int pilihan = Integer.parseInt(args[0]);
                if (pilihan >= 1 && pilihan <= suplai.length) {
                    System.out.println("Kamu memlihih" + suplai[pilihan -1]);

                } else {
                    System.out.println("Pilihan tidak tepat, silahkan pilih angka 1-4");
                }

    }
}

// Melihat beberapa referensi dari stackoverflow dan AI