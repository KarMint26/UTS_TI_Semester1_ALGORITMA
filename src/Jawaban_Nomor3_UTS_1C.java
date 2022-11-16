import java.util.Scanner;

public class Jawaban_Nomor3_UTS_1C {

    /**
     * SOAL NO 3 UTS
     * Sebuah outlet Kopi Kenangan Jiwa, memiliki 4 menu favorite, yaitu Kopi Latte Don't Be Late,
     * Kopi Goncang Jiwa, Kopi Jalan Kenangan, dan Kopi Pahit Tanpa Rasa. Pemilik outlet kopi tersebut,
     * kesulitan untuk mendapatkan informasi mengenai kopi yang paling disukai dan kopi yang paling
     * tidak disukai pada setiap hari penjualan. Sehingga pemilik kopi tersebut membatasi setiap produk
     * Kopi yang dijual dengan menerapkan kuota pada setiap produk kopi yaitu :
     * Don't Be Late 400 cup, Goncang Jiwa 300 cup, Jalan Kenangan 300 cup, tanpa rasa 250 cup
     * Ketentuan :
     * 1. Buatlah Program Java untuk mencatat setiap transaksi dari penjualan 4 menu kopi tersebut.
     * 2. Tampilkan Informasi Jumlah Kopi Terbanyak atau MAX.
     * 3. Tampilkan Informasi dari setiap transaksi mengenai jumlah Cup tersisa dari setiap 4 menu kopi
     * 4. Buatlah program di atas menggunakan Method Tipe 1 atau Tipe 2 dan Array sesuai dengan
     *    Kreativitas Anda.
     */
    public static Scanner inputUser = new Scanner(System.in);
    public static int JumlahSemuaKuotaKopi = 1250;
    public static String[] KopiLatte = new String[400];
    public static String[] KopiGoncangJiwa = new String[300];
    public static String[] KopiJalanKenangan = new String[300];
    public static String[] KopiTanpaRasa = new String[250];

    public static String scanner(String index){
        System.out.print(index + " : ");
        return inputUser.nextLine();
    }

    public static void viewShowApp(){
        while (true){
            System.out.println("\n   KOPI KENANGAN JIWA");
            System.out.println("========================");
            System.out.println("\nDaftar Menu");
            System.out.println("1. Kopi Latte Don't Be Late");
            System.out.println("2. Kopi Goncang Jiwa");
            System.out.println("3. Kopi Jalan Kenangan");
            System.out.println("4. Kopi Pahit Tanpa Rasa");

            System.out.println("\nSilahkan Pilih Menu dibawah ini");
            System.out.println("1. Pesan Kopi");
            System.out.println("x. Exit Aplikasi");
            String pilihMenu = scanner("Pilih Menu Button");

            if (pilihMenu.equals("1")){
                menuPesanKopi();
            } else if (pilihMenu.equals("x")) {
                System.out.println("     Keluar Dari Aplikasi");
                System.out.println("==============================");
                break;
            } else {
                System.out.println("Pilihan Yang Anda Masukkan Tidak Valid");
                System.out.println();
                viewShowApp();
            }
        }
    }

    public static void menuPesanKopi(){
        System.out.println("\n  Menu Pesan Kopi Kenangan Jiwa");
        System.out.println("=================================");
        String name = scanner("Masukkan Nama Anda");
        String kopiName = scanner("Masukkan Pesanan Kopi Anda");

        if (name.isBlank() || kopiName.isBlank()){
            System.out.println("\nTolong Lengkapi Form Pesan");
            System.out.println("1. Lanjutkan Pesanan");
            System.out.println("2. Keluar Dari Menu Pesanan");
            String pilihButton = scanner("Masukkan Pilihan");

            if (pilihButton.equals("1")){
                menuPesanKopi();
            } else if (pilihButton.equals("2")) {
                viewShowApp();
            } else {
                System.out.println("Pilihan Anda Tidak Valid");
            }
        } else {
            viewAddCoffe(name, kopiName);
            System.out.println();
        }
    }

    public static void viewAddCoffe(String indexName, String indexCoffee){
        if (indexCoffee.equals("Kopi Latte Don't Be Late")){
            addCoffeToArray(KopiLatte, indexName);
            System.out.println("\nNama Anda Adalah " + indexName);
            System.out.println("Kopi Yang Anda Pesan Adalah " + indexCoffee);
            viewAllDataApp();
        } else if (indexCoffee.equals("Kopi Goncang Jiwa")) {
            addCoffeToArray(KopiGoncangJiwa, indexName);
            System.out.println("\nNama Anda Adalah " + indexName);
            System.out.println("Kopi Yang Anda Pesan Adalah " + indexCoffee);
            viewAllDataApp();
        } else if (indexCoffee.equals("Kopi Jalan Kenangan")) {
            addCoffeToArray(KopiJalanKenangan, indexName);
            System.out.println("\nNama Anda Adalah " + indexName);
            System.out.println("Kopi Yang Anda Pesan Adalah " + indexCoffee);
            viewAllDataApp();
        } else if (indexCoffee.equals("Kopi Pahit Tanpa Rasa")) {
            addCoffeToArray(KopiTanpaRasa, indexName);
            System.out.println("\nNama Anda Adalah " + indexName);
            System.out.println("Kopi Yang Anda Pesan Adalah " + indexCoffee);
            viewAllDataApp();
        } else {
            System.out.println("Input Pesanan Anda Salah");
        }
    }

    public static void addCoffeToArray(String[] thisArray, String indexName){
        for (int i = 0; i < thisArray.length; i++) {
            if (thisArray[i] == null){
                thisArray[i] = indexName;
                break;
            }
        }
    }

    public static void viewAllDataApp(){
        int sisaKopiKenangan = 0;
        int KopiLatteData = 0;
        for (int i = 0; i < KopiLatte.length; i++) {
            if (KopiLatte[i] != null){
                KopiLatteData++;
            }
        }
        int KopiGoncangJiwaData = 0;
        for (int i = 0; i < KopiGoncangJiwa.length; i++) {
            if (KopiGoncangJiwa[i] != null){
                KopiGoncangJiwaData++;
            }
        }
        int KopiJalanKenanganData = 0;
        for (int i = 0; i < KopiJalanKenangan.length; i++) {
            if (KopiJalanKenangan[i] != null){
                KopiJalanKenanganData++;
            }
        }
        int KopiPahitTanpaRasaData = 0;
        for (int i = 0; i < KopiTanpaRasa.length; i++) {
            if (KopiTanpaRasa[i] != null){
                KopiPahitTanpaRasaData++;
            }
        }

        String jumlahKopiTerbanyakTerjual = null;

        if (KopiLatteData > KopiGoncangJiwaData){
            if (KopiLatteData > KopiJalanKenanganData){
                if (KopiLatteData > KopiPahitTanpaRasaData){
                    jumlahKopiTerbanyakTerjual = "Kopi Latte Don't Be Late";
                }
            }
        }

        if (KopiGoncangJiwaData > KopiLatteData){
            if (KopiGoncangJiwaData > KopiJalanKenanganData){
                if (KopiGoncangJiwaData > KopiPahitTanpaRasaData){
                    jumlahKopiTerbanyakTerjual = "Kopi Goncang Jiwa";
                }
            }
        }

        if (KopiJalanKenanganData > KopiGoncangJiwaData){
            if (KopiJalanKenanganData > KopiLatteData){
                if (KopiJalanKenanganData > KopiPahitTanpaRasaData){
                    jumlahKopiTerbanyakTerjual = "Kopi Jalan Kenangan";
                }
            }
        }

        if (KopiPahitTanpaRasaData > KopiGoncangJiwaData){
            if (KopiPahitTanpaRasaData > KopiJalanKenanganData){
                if (KopiPahitTanpaRasaData > KopiLatteData){
                    jumlahKopiTerbanyakTerjual = "Kopi Pahit Tanpa Rasa";
                }
            }
        }

        sisaKopiKenangan = JumlahSemuaKuotaKopi - KopiLatteData - KopiGoncangJiwaData - KopiJalanKenanganData - KopiPahitTanpaRasaData;
        int maxOne = Math.max(KopiLatteData, KopiGoncangJiwaData);
        int maxTwo = Math.max(KopiJalanKenanganData, KopiPahitTanpaRasaData);
        int PenjualanKopiTerbanyak = Math.max(maxOne, maxTwo);
        System.out.println("\nSisa Kuota Kopi Latte Don't Be Late : " + KopiLatteData + " Cup");
        System.out.println("Sisa Kuota Kopi Goncang jiwa : " + KopiGoncangJiwaData +  " Cup");
        System.out.println("Sisa Kuota Kopi Jalan Kenangan : " + KopiJalanKenanganData + " Cup");
        System.out.println("Sisa Kuota Kopi Pahit Tanpa Rasa : " + KopiPahitTanpaRasaData + " Cup");
        System.out.println("\nPenjualan Kopi Terbanyak Adalah : " + PenjualanKopiTerbanyak + " Cup");
        System.out.println("Penjualan Kopi Terbanyak " + PenjualanKopiTerbanyak + " Cup" + " | Nama Kopinya Adalah " + jumlahKopiTerbanyakTerjual);
        System.out.println("Kuota Kopi Yang Tersedia adalah " + JumlahSemuaKuotaKopi + " Cup" + " | Kopi Yang Tersisa Dari 4 Jenis Menu adalah " + sisaKopiKenangan +  " Cup");
    }

    public static void main(String[] args) {
        viewShowApp();
    }
}


