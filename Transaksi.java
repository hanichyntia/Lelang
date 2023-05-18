
import java.util.ArrayList;
import java.util.Scanner;


public class Transaksi {
    ArrayList<Integer> idPelelang = new ArrayList<Integer>();
    ArrayList<Integer> idPenawar = new ArrayList<Integer>();
    ArrayList<String> namaBarang = new ArrayList<String>();
    ArrayList<Integer> hargaAwal = new ArrayList<Integer>();
    ArrayList<Integer> hargaTawar = new ArrayList<Integer>();
    
    Scanner o = new Scanner(System.in);
    public void LelangBarang(Barang barang, Masyarakat masyarakat){
        ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
        ArrayList<String> namaBarang = new ArrayList<String>();
        ArrayList<Integer> hargaAwal = new ArrayList<Integer>();
        
        System.out.println("Isi Data Pelelang di Bawah ini ");
        System.out.print("ID Pelelang\t: ");
        int idMas = o.nextInt();
        idPelelang.add(idMas);
        
        System.out.print("Barang\t: ");
        String nama = o.next();
        namaBarang.add(nama);
        barang.setNamaBarang(nama);
        System.out.println(namaBarang);
        
        System.out.print("Harga Awal\t: ");
        int harga = o.nextInt();
        hargaAwal.add(harga);
        barang.setHargaAwal(harga);
        
        barang.setStatus(true);
    }
    public void TawarBarang(Lelang lelang, Masyarakat masyarakat, Barang barang, Laporan laporan){
        System.out.println("Isi Data Penawar di Bawah ini ");
        
        System.out.print("ID Penawar\t: ");
        int idMas = o.nextInt();
        idPenawar.add(idMas);
        
        laporan.Laporan(barang);
        System.out.println("No Barang\t: ");
        int idBrg = o.nextInt();
        
        int inputHarTaw;
        do{
            System.out.print("Harga Tawar : ");
            inputHarTaw = o.nextInt();
            
            if (inputHarTaw > barang.getHargaAwal(idBrg)) {
                System.out.println("Anda bisa menawar barang");
                barang.editStatus(idBrg, false);
                hargaTawar.add(inputHarTaw);
                
            }
        }while(inputHarTaw < barang.getHargaAwal(idBrg));
        System.out.println("====================================");
        System.out.println("DETAIL PENAWARAN");
        System.out.println("====================================");
        System.out.println("Nama \tBarang \tHarga Awal \tHarga Akhir \tStatus");
        System.out.println(masyarakat.getNama(idMas)+"\t"+barang.getNamaBarang(idBrg)+"\t"+barang.getHargaAwal(idBrg)+"\t"+lelang.getHargaTawar(idBrg)+"\t"+barang.getStatus(idBrg));
    }
    public String getNamaBarang(int id){
        return this.namaBarang.get(id);
    }
    public int hargaTawar(int id){
        return this.hargaTawar.get(id);
    }
}
