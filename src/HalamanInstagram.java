import java.util.ArrayList;
import java.util.Scanner;

public class HalamanInstagram {
    private static void PrintTitle() {
        System.out.println("------------------------------");
        System.out.println("    H  H  H   H H H   H              HH      H       H      HH      H H H H H          HH HH        HH    H H H H H    HH      H     H   H H H H H     ");
        System.out.println("    H         H       H             H  H     H H   H H     H  H         H              HH  HH      H  H       H       H  H     H H   H   H               ");
        System.out.println("    H  H  H   H H H   H            H    H    H   H   H    H    H        H              HH   HH    H    H      H      H    H    H  H  H   H   H H H          ");
        System.out.println("          H   H       H           H  HH  H   H       H   H  HH  H       H              HH  HH    H  HH  H     H     H  HH  H   H   H H   H       H       ");
        System.out.println("    H  H  H   H H H   H  H  H    H        H  H       H  H        H      H              HH HH    H        H    H    H        H  H    HH   H H H H H        ");
        System.out.println("------------------------------");
        System.out.println(" HALAMAN - INSTAGRAM ");
        System.out.println("-------------------------------");
        System.out.println();
    }






    public static void main(String[] args) {
        String Email;
        String Password;
        String NamaUser;

        System.out.println("LOGIN");

        Email ="vikarosyida@gmail.com";
        Password="040403";
        NamaUser="Vika Rosyida";
        Scanner inputUser = new Scanner(System.in);
        PrintTitle();
        System.out.println("Masukan Email");
        System.out.println("Masukan Password");
        Email= inputUser.nextLine();
        Password= inputUser.nextLine();

        if ( Password.equals("040403")) {

            char pilihan = 0;
            do {
                PrintTitle();
                System.out.println();
                System.out.println("Beranda");
                System.out.println("[1]. Postingan");
                System.out.println("[2]. Search");
                System.out.println("[3]. Reels");
                System.out.println("[4]. Pesan");
                System.out.println("[0]. Keluar");
                System.out.println("Pilihan Anda    : ");
                pilihan = inputUser.nextLine().charAt(0);
                System.out.println();
                switch (pilihan) {
                    case '1' -> {
                        String Like;
                        String Comment;
                        String Share;
                        System.out.println("Nama");
                        System.out.println("Video/Foto");
                        System.out.println("[1]. Like" );
                        System.out.println("[2].Comment");
                        System.out.println("[3]. Share");
                        System.out.println("[0]. Keluar ");
                        System.out.println("Pilihan Anda : ");
                        pilihan = inputUser.nextLine().charAt(0);
                        System.out.println();

                        switch (pilihan){
                            case'1'->{
                                System.out.println("Sukses");
                            }
                            case'2'->{
                                String comment;
                                Scanner InputUser = new Scanner(System.in);
                                System.out.println("Masukan Comment = ");
                                comment=InputUser.nextLine();

                            }
                        }


                    }
                    case '2' -> {
                        String Nama;
                        System.out.println("[1]. Masukan Nama");
                        System.out.println("[2]. Cari");
                        System.out.println("[0]. Keluar");
                        System.out.println("Pilihan Anda : ");
                        pilihan = inputUser.nextLine().charAt(0);
                        System.out.println();

                        switch (pilihan){
                            case '1'->{
                                String nama;
                                Scanner InputUser = new Scanner(System.in);
                                System.out.println("Masukkan Nama = ");
                                nama=InputUser.nextLine();
                            }
                            case '2'-> {
                                System.out.println("Sukses");
                            }
                        }
                    }
                    case '3' -> {
                        String nama;
                        System.out.println("Video");
                    }
                    case '4' -> {
                        String Nama;
                        String Pesan;
                        System.out.println("Nama");
                        System.out.println("Pesan");

                        switch (pilihan){
                            case'1'->{
                                String pesan;
                                Scanner InputUser = new Scanner(System.in);
                                System.out.println("Ketik Pesan = ");
                                pesan=InputUser.nextLine();
                            }
                            case'2'->{
                                System.out.println("[1]. Kirim");
                                System.out.println("[0]. Tidak");
                            }
                    }
                    }
                    default -> throw new IllegalStateException("Unexpected value: " + pilihan);
                }
            }while(pilihan!='0');
        }

    }

}
