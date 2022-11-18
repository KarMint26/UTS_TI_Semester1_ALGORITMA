import java.util.Random;
import java.util.Scanner;

public class Jawaban_Nomor3_UTS_1B {

    /**
     * Soal No 3 Kelas B
     * Poltek Harapan Bersama membuka Penerimaan Mahasiswa Baru untuk Prodi Teknik Informatika, DKV, dan Teknik
     * Komputer. Untuk Prodi TI kapasitas yang tersedia adalah 500 mahasiswa, untuk DKV 300 mahasiswa, dan untuk
     * Teknik Komputer 250 mahasiswa. Buatlah Program Java untuk Registrasi Mahasiswa Baru dengan kriteria sebagai
     * berikut.
     * 1. Mahasiswa yang mendaftar akan ditanyakan nama, dan prodi yang diinginkan
     * 2. Sistem akan membuat NIK otomatis dengan panjang 12 digit sesuai dengan Prodinya dengan format :
     *    Prodi TI dengan awalan TI22XXXXXXXX
     *    Prodi DKV dengan awalan DK22XXXXXXXX
     *    Prodi TK dengan awalan TK22XXXXXXXX
     *    Keterangan: XXXXXXXX adalah angka RANDOM
     * 3. Tampilkan info jumlah siswa setiap prodi yang sudah mendaftar dan sisa kursi yang tersedia
     * 4. Buatlah Jawaban dengan menggunakan Method Tipe 1 dan Tipe 2 dan implementasikan menggunakan array
     */
    public static Scanner inputUser = new Scanner(System.in);
    public static Random randomNumber = new Random();
    public static String[] teknikInformatika = new String[500];
    public static String[] designKomunikasiVisual = new String[300];
    public static String[] teknikKomputer = new String[250];
    public static int jumlahSeluruhMahasiswaBaru = teknikInformatika.length + designKomunikasiVisual.length + teknikKomputer.length;

    public static String scanner(String index){
        System.out.print(index + " : ");
        return inputUser.nextLine();
    }

    public static void viewFrontApp(){
        label:
        while (true){
            System.out.println("\n   SELAMAT DATANG DI KAMPUS POLITEKNIK HARAPAN BERSAMA");
            System.out.println("*********************************************************");
            System.out.println("* 1. Masuk Menu Pendaftaran   *");
            System.out.println("* 2. Info Mahasiswa Baru      *");
            System.out.println("* 3. Exit Aplikasi            *");
            String pilihanAnda = scanner("\nMasukkan Pilihan Anda");

            switch (pilihanAnda) {
                case "1":
                    menuPendaftaranMahasiswaBaru();
                    break;
                case "2":
                    infoDataMahasiswaBaru();
                    break;
                case "3":
                    break label;
                default:
                    System.out.println("Pilihan Anda Salah / Tidak Tersedia");
                    break;
            }
        }
    }

    public static void menuPendaftaranMahasiswaBaru(){
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("   SELAMAT DATANG DI MENU PENDAFTARAN MAHASISWA BARU POLITEKNIK HARAPAN BERSAMA");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\nProdi Yang Membuka Pendaftaran");
        System.out.println("1. Teknik Informatika");
        System.out.println("2. Design Komunikasi Visual");
        System.out.println("3. Teknik Komputer");
        String yourName = scanner("\nMasukkan Nama Anda");
        String Prodi = scanner("Masukkan Nama Prodi Yang Diinginkan");

        if (yourName.isEmpty() || Prodi.isBlank()){
            System.out.println("\nTolong Lengkapi Identitas Anda");
            menuPendaftaranMahasiswaBaru();
        } else {
            System.out.println("\n    Form Pendaftaran Akan Segera di Cek Oleh Sistem");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            perolehanNikMahasiswa(yourName, Prodi);
        }
    }

    public static void perolehanNikMahasiswa(String name, String prodi){
        switch (prodi) {
            case "Teknik Informatika" -> {
                addNameToArrays(teknikInformatika, name);
                System.out.println("\nSelamat Anda Terdaftar di Prodi Teknik Informatika");
                NIKrandom(prodi, name);
                semuaDataMahasiswa();
            }
            case "Design Komunikasi Visual" -> {
                addNameToArrays(designKomunikasiVisual, name);
                System.out.println("\nSelamat Anda Terdaftar di Prodi Design Komunikasi Visual");
                NIKrandom(prodi, name);
                semuaDataMahasiswa();
            }
            case "Teknik Komputer" -> {
                addNameToArrays(teknikKomputer, name);
                System.out.println("\nSelamat Anda Terdaftar di Prodi Teknik Komputer");
                NIKrandom(prodi, name);
                semuaDataMahasiswa();
            }
            default -> {
                System.out.println("\nProdi Yang Anda Masukkan Tidak Tersedia");
                menuPendaftaranMahasiswaBaru();
            }
        }
    }

    public static int infoNikRandom(){
        int result;
        result = randomNumber.nextInt(0,9)+1;

        return result;
    }

    public static void NIKrandom(String yourProdi, String yourName){
        switch (yourProdi){
            case "Teknik Informatika" -> {
                int nikResultAll = infoNikRandom();
                int nikResultAll2 = infoNikRandom();
                int nikResultAll3 = infoNikRandom();
                int nikResultAll4 = infoNikRandom();
                int nikResultAll5 = infoNikRandom();
                int nikResultAll6 = infoNikRandom();
                int nikResultAll7 = infoNikRandom();
                int nikResultAll8 = infoNikRandom();
                System.out.println("Nama Anda Adalah " + yourName);
                System.out.println("NIK anda adalah TI22" + nikResultAll + nikResultAll2 + nikResultAll3 + nikResultAll4 + nikResultAll5 + nikResultAll6 + nikResultAll7 + nikResultAll8);
            }
            case "Design Komunikasi Visual" -> {
                int nikResultAll = infoNikRandom();
                int nikResultAll2 = infoNikRandom();
                int nikResultAll3 = infoNikRandom();
                int nikResultAll4 = infoNikRandom();
                int nikResultAll5 = infoNikRandom();
                int nikResultAll6 = infoNikRandom();
                int nikResultAll7 = infoNikRandom();
                int nikResultAll8 = infoNikRandom();
                System.out.println("Nama Anda Adalah " + yourName);
                System.out.println("NIK anda adalah DK22" + nikResultAll + nikResultAll2 + nikResultAll3 + nikResultAll4 + nikResultAll5 + nikResultAll6 + nikResultAll7 + nikResultAll8);
            }
            case "Teknik Komputer" -> {
                int nikResultAll = infoNikRandom();
                int nikResultAll2 = infoNikRandom();
                int nikResultAll3 = infoNikRandom();
                int nikResultAll4 = infoNikRandom();
                int nikResultAll5 = infoNikRandom();
                int nikResultAll6 = infoNikRandom();
                int nikResultAll7 = infoNikRandom();
                int nikResultAll8 = infoNikRandom();
                System.out.println("Nama Anda Adalah " + yourName);
                System.out.println("NIK anda adalah TK22" + nikResultAll + nikResultAll2 + nikResultAll3 + nikResultAll4 + nikResultAll5 + nikResultAll6 + nikResultAll7 + nikResultAll8);
            }
            default -> System.out.println("Maaf Prodi Tidak Tersedia");
        }
    }

    public static void addNameToArrays(String[] thisArray, String name){
        for (int i = 0; i < thisArray.length; i++) {
            if (thisArray[i] == null){
                thisArray[i] = name;
                break;
            }
        }
    }

    public static void semuaDataMahasiswa(){
        int sisaKursiYangTersedia;
        int teknikInformatikaData = 0;
        for (String s : teknikInformatika) {
            if (s != null) {
                teknikInformatikaData++;
            }
        }

        int teknikDkvData = 0;
        for(String t : designKomunikasiVisual){
            if (t != null){
                teknikDkvData++;
            }
        }

        int teknikKomputerData = 0;
        for(String u : teknikKomputer){
            if (u != null){
                teknikKomputerData++;
            }
        }

        sisaKursiYangTersedia = jumlahSeluruhMahasiswaBaru - teknikInformatikaData - teknikDkvData - teknikKomputerData;
        System.out.println("\nMahasiswa Prodi Teknik Informatika Terdaftar : " + teknikInformatikaData + " Mahasiswa" + " | Sisa Kuota Prodi Teknik Informatika : " + (teknikInformatika.length - teknikInformatikaData) + " Mahasiswa");
        System.out.println("Mahasiswa Prodi Design Komunikasi Visual Terdaftar : " + teknikDkvData + " Mahasiswa" + " | Sisa Kuota Prodi Design Komunikasi Visual : " + (designKomunikasiVisual.length - teknikDkvData) + " Mahasiswa");
        System.out.println("Mahasiswa Prodi Teknik Komputer Terdaftar : " + teknikKomputerData + " Mahasiswa" + " | Sisa Kuota Prodi Teknik Komputer : " + (teknikKomputer.length - teknikKomputerData) + " Mahasiswa");
        System.out.println("Sisa kursi yang tersedia adalah : " + sisaKursiYangTersedia);
    }

    public static void infoDataMahasiswaBaru(){
        System.out.println("\n   SELAMAT DATANG DI MENU INFO PMB");
        System.out.println("=====================================");
        semuaDataMahasiswa();
    }

    public static void main(String[] args) {
        viewFrontApp();
    }
}
