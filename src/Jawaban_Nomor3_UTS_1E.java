import java.util.Scanner;

public class Jawaban_Nomor3_UTS_1E {
    /**
     * Soal No 3 sebagai Berikut
     * Sebuah waralaba makanan terkenal dari Cinde-Tegal KFC(Kamir From Cinde) akan mengadakan Tur Karyawan dengan
     * menggunakan 4 Bus Pariwisata. Adapun Bus Pariwisata itu dibagi menjadi tingkatan level manajemen sehingga notasi
     * arraynya adalah : String[] InfoBus = {"01-TopLevel", "02-MiddleLevel", "03-RegularStaff", "04-Staff"};
     * Sedangkan Pembagian Karyawan untuk Masuk Kedalam kategori tersebut sesuai dengan 10 Digit NIK Karyawan, yaitu
     * dengan format : C01XXXXXXX (artinya C untuk CEO, dan 01 adalah TopLevel
     *                 J02XXXXXXX (artinya J untuk Manager, dan 02 adalah MiddleLevel
     *                 N03XXXXXXX (artinya N untuk Supervisor, dan 03 adalah RegularStaff
     *                 P04XXXXXXX (artinya P untuk Staff
     * Buatlah Program Java untuk memisahkan masing-masing karyawan masuk Bus yang ditentukan sesuai dengan tingkatan level
     * Ketentuan: a. Registrasi sesuai dengan NIK
     *            b. Tentukan bahwa NIK tersebut sesuai dengan tingkatan level
     *               contoh : J0268673989 -> berarti NIK tersebut masuk ke Bus 02-MiddleLevel
     *            c. Tampilkan info setiap jumlah penumpang di masing-masing Bus dengan format : Jumlah TopLevel = 90, MiddleLevel = 30, dst
     *            d. Implementasikan Method 1 atau Method 2 dan Array sesuai dengan kreativitas anda
     */
    public static int TopLevel = 0;
    public static int MidLevel = 0;
    public static int RegularStaff = 0;
    public static int StaffLevel = 0;
    public static int KuotaBusYangSudahTerisi = 0;
    public static String[] infoBus = {"01-TopLevel", "02-MiddleLevel", "03-RegularStaff", "04-Staff"};
    /**
     * C01XXXXXXX artinya C untuk CEO, dan 01 adalah TopLevel
     * J02XXXXXXX artinya J untuk Manager, dan 02 adalah MiddleLevel
     * N03XXXXXXX artinya N untuk Supervisor, dan 03 adalah RegularStaff
     * P04XXXXXXX artinya P untuk Staff, dan 04 adalah Staff
     */
    public static Scanner inputUserData = new Scanner(System.in);
    public static void TampilanDepanAplikasi(){
        while (true) {
            System.out.println("          PROGRAM JAVA PENENTUAN BUS PARIWISATA");
            System.out.println(" Tour Karyawan ke Waralaba Makanan Terkenal Cinde-Tegal");
            System.out.println("=========================================================");
            System.out.print("Masukkan Nama Anda : ");
            String name = inputUserData.nextLine();
            System.out.print("Masukkan NIK Anda : ");
            String NIK = inputUserData.nextLine();

            if (name.isBlank() || NIK.isBlank()){
                System.out.println("Lengkapi Identitas Anda");
                TampilanDepanAplikasi();
            } else {
                penentuanBusLevel(name, NIK);
                System.out.println();
            }
        }
    }

    public static void penentuanBusLevel(String index, String NIKAnda){
        if (NIKAnda.startsWith("C01")){
            System.out.println("\nNama Anda Adalah " + index);
            System.out.println("Jabatan CEO | Anda Mendapatkan Bus 01-TopLevel");
            TampilanJumlahDataTour(NIKAnda);
        } else if (NIKAnda.startsWith("J02")) {
            System.out.println("Nama Anda Adalah " + index);
            System.out.println("Jabatan Manager | Anda Mendapatkan Bus 02-MiddleLevel");
            TampilanJumlahDataTour(NIKAnda);
        } else if (NIKAnda.startsWith("N03")) {
            System.out.println("Nama Anda Adalah " + index);
            System.out.println("Jabatan Supervisor | Anda Mendapatkan Bus 03-RegularStaff");
            TampilanJumlahDataTour(NIKAnda);
        } else if (NIKAnda.startsWith("P04")) {
            System.out.println("Nama Anda Adalah " + index);
            System.out.println("Jabatan Staff | Anda Mendapatkan Bus 04-Staff");
            TampilanJumlahDataTour(NIKAnda);
        } else {
            System.out.println("NIK yang anda masukkan salah");
        }
    }
    public static void TampilanJumlahDataTour(String x){
        if (x.startsWith("C01")){
            TopLevel += 1;
        } else if (x.startsWith("J02")) {
            MidLevel += 1;
        } else if (x.startsWith("N03")) {
            RegularStaff += 1;
        } else if (x.startsWith("P04")) {
            StaffLevel += 1;
        } else {
            System.out.println("ERROR");
        }

        KuotaBusYangSudahTerisi = TopLevel + MidLevel + RegularStaff + StaffLevel;
        System.out.println("\nJumlah Penumpang Bus Top Level : " + TopLevel);
        System.out.println("Jumlah Penumpang Bus Middle Level : " + MidLevel);
        System.out.println("Jumlah Penumpang Bus Regular Staff : " + RegularStaff);
        System.out.println("Jumlah Penumpang Bus Staff : " + StaffLevel);
        System.out.println("Jumlah Semua Penumpang Bus Dari Berbagai Jenis Yang Sudah Terisi Sebanyak : " + KuotaBusYangSudahTerisi);
    }

    public static void main(String[] args) {
        TampilanDepanAplikasi();
    }

}

