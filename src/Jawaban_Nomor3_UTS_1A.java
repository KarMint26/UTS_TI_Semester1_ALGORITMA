import java.util.ArrayList;
import java.util.Scanner;

public class Jawaban_Nomor3_UTS_1A {

    /**
     * Sebuah Mall memiliki lahan parkir 3 lantai, setiap lantai mampu menampung maksimal 150 mobil.
     * Daya beban setiap lantai berbeda-beda, yaitu
     * 1. Lantai 1 mampu menampung 450.000 ton
     * 2. lantai 2 mampu menampung 200.000 ton
     * 3. lantai 3 mampu menampung 150.000 ton
     * Buatlah program dalam Java untuk menginput mobil parkir di setiap lantai, apabila parkiran melebihi
     * kapasitas tonase daya dan melebihi dari jumlah maksimal mobil maka mobil tersebut dialihkan ke lantai
     * parkir yang lain.
     * KETENTUAN : 1. Pada Waktu Mobil Masuk ke Parkir, akan ditanya plat nomor, dan bobot kendaraan
     *             2. Buatlah proses dan aplikasi sesuai dengan kreativitas anda untuk mengimplementasikan
     *                Method Tipe 1 dan Method Tipe 2 dengan menggunakan array
     *             3. Tampilkan Informasi Jumlah Mobil dan Tonase Pada Setiap Lantai.
     */

    public static Scanner inputUser = new Scanner(System.in);
    public static int jumlahMobil, lantaiSatu, lantaiDua, lantaiTiga, tonaseSatu, tonaseDua, tonaseTiga = 0;
    public static int[] Lantai_1 = new int[450_000];
    public static int[] Lantai_2 = new int[200_000];
    public static int[] Lantai_3 = new int[150_000];

    public static String scannerInput(String indexStr){
        System.out.print(indexStr + " : ");
        return inputUser.nextLine();
    }

    public static void frontEndApp(){
        while (true) {
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("   PROGRAM PARKIR MOBIL MALL NUSA INDAH BALI");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.println("1. Masuk Parkir Mall");
            System.out.println("X. Keluar Program Aplikasi");
            String yourChoose = scannerInput("\nMasukkan Pilihan Anda");

            if (yourChoose.equals("1")) {
                masukParkirApp();
            } else if (yourChoose.equals("X")) {
                System.out.println("\nEXIT APLIKASI..............");
                break;
            } else {
                System.out.println("Pilihan Tidak Valid");
                frontEndApp();
            }
        }
    }

    public static void masukParkirApp(){
        System.out.println("\n  SELAMAT DATANG DI PARKIRAN MALL NUSA INDAH BALI");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        String platMobil = scannerInput("\nMasukkan Plat Mobil");
        int bobotKendaraan = Integer.parseInt(scannerInput("Masukkan Bobot Mobil"));

        if (platMobil.isBlank() || bobotKendaraan == 0){
            System.out.println("\nTOLONG LENGKAPI IDENTITAS MOBIL");
            masukParkirApp();
        } else if (bobotKendaraan <= Lantai_1.length) {
            System.out.println("\nPlat Mobil : " + platMobil);
            System.out.println("Bobot Mobil : " + bobotKendaraan + " Ton");
            addCarAndTonase(Lantai_1, bobotKendaraan);
            infoParkir();
        } else if (bobotKendaraan <= Lantai_2.length) {
            System.out.println("\nPlat Mobil : " + platMobil);
            System.out.println("Bobot Mobil : " + bobotKendaraan + " Ton");
            addCarAndTonase(Lantai_2, bobotKendaraan);
            infoParkir();
        } else if (bobotKendaraan <= Lantai_3.length) {
            System.out.println("\nPlat Mobil : " + platMobil);
            System.out.println("Bobot Mobil : " + bobotKendaraan + " Ton");
            addCarAndTonase(Lantai_3, bobotKendaraan);
            infoParkir();
        }
    }

    public static void addCarAndTonase(int[] myArray, int numberIndex){
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 0){
                myArray[i] = numberIndex;
            }
        }
    }

    public static void infoParkir(){
        for(int a : Lantai_1){
            if (a != 0){
                lantaiSatu++;
                tonaseSatu += a;
                break;
            }
        }
        for(int b : Lantai_2){
            if (b != 0){
                lantaiDua++;
                tonaseDua += b;
                break;
            }
        }
        for(int c : Lantai_3){
            if (c != 0){
                lantaiTiga++;
                tonaseTiga += c;
                break;
            }
        }

        jumlahMobil = lantaiSatu + lantaiDua + lantaiTiga;
        System.out.println("\nJumlah Mobil Di Lantai 1 : " + lantaiSatu + " Mobil" + " | Tonase Mobil Lantai 1 : " + tonaseSatu + " Ton");
        System.out.println("Jumlah Mobil Di Lantai 2 : " + lantaiDua + " Mobil" + " | Tonase Mobil Lantai 2 : " + tonaseDua + " Ton");
        System.out.println("Jumlah Mobil Di Lantai 3 : " + lantaiTiga + " Mobil" + " | Tonase Mobil Lantai 3 : " + tonaseTiga + " Ton");
        System.out.println("Jumlah Semua Mobil Yang Terparkir Di Mall Nusa Indah Bali : " + jumlahMobil + " Mobil");
    }

    public static void main(String[] args) {
        frontEndApp();
    }
}
