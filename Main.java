
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        Masyarakat masyarakat = new Masyarakat();
        Petugas petugas = new Petugas();
        Lelang lelang = new Lelang();
        Laporan laporan = new Laporan();
        
        laporan.Laporan(petugas);
        
        System.out.println("========= SILAHKAN LELANGKAN BARANG =========");
        System.out.print("Masukkan ID Petugas\t: ");
        int idPet = o.nextInt();
        
        Barang barang = new Barang();
        laporan.Laporan(barang);
        laporan.Laporan(masyarakat);
        lelang.prosesLelang(masyarakat, lelang, barang);
    }
}
