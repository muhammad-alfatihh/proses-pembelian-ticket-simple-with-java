import java.util.Scanner;

public class ticket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int duit = 100000;
        int harga = 25000;
        

        System.out.println("=== SELAMAT DATANG DI BIOSKOP XRPL ===");
        System.out.println("Daftar Film Hari Ini:");
        System.out.println("1. lord of the rings");
        System.out.println("2. the hobbit");
        System.out.println("3. narnia");
        System.out.println("4. harry potter");
        System.out.println("");

        System.out.println("Masukkan nomor film yang ingin ditonton:");  
        String film = input.nextLine(); 
        switch (film) {
            case "1":
                film = "lord of the rings";
            case "2":
                film = "the hobbit";
            case "3":
                film = "narnia";
            case "4": 
                film = "harry potter";
        }

        System.out.println("Masukan jumlah  ticket yang ingin dibeli:");
        int jumlah = input.nextInt();
        input.nextLine();

        System.out.println("Masukkan nama Anda:");
        String nama = input.nextLine();

        System.out.println("Metode pembayaran:");
        System.out.println("cash, debit, e-Wallet, credit");
        String metode = input.nextLine();


        System.out.println("=== STRUK PEMESANAN BIOSKOP ===");
        System.out.println("nama pemesan : " + nama);
        System.out.println("nama film yang ditonton : " + film);
        System.out.println("jumlah ticket yang dibeli : " + jumlah);
        System.out.println("total harga : " + (harga * jumlah));
        System.out.println("sisa uang anda : " + (duit - (harga * jumlah)));
        System.out.println("metode pembayaran :" + metode);
        System.out.println("===============================");
        System.out.println("");
        System.out.println("terima kasih telah memesan ticket di bioskop XRPL uwu");


        



    }
    
}