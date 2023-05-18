
public class Laporan {
    public void Laporan(Barang barang){
        int x = barang.getJmlBarang();
        
        System.out.println();
        System.out.println("====================================");
        System.out.println("BARANG LELANG");
        System.out.println("====================================");
        System.out.println("ID \tNama Barang \tHarga Awal \tStatus");
        
        for (int i = 0; i < x; i++) {
            System.out.println(i+"\t"+barang.getNamaBarang(i)+"\t\t"+barang.getHargaAwal(i)+"\t\t"+barang.getStatus(i));
        }
    }
    public void Laporan (Petugas petugas){
        int x = petugas.getJmlPetugas();
        
        System.out.println();
        System.out.println("====================================");
        System.out.println("PETUGAS");
        System.out.println("====================================");
        System.out.println("ID \tNama \tAlamat \t\tTelepon");
        for (int i = 0; i < x; i++) {
            System.out.println(i+"\t"+petugas.getNama(i)+"\t"+petugas.getAlamat(i)+"\t"+petugas.getTelepon(i));
        }
    }
    public void Laporan(Masyarakat masyarakat){
        int x = masyarakat.getJmlMasyarakat();
        
        System.out.println();
        System.out.println("====================================");
        System.out.println("MASYARAKAT");
        System.out.println("====================================");
        System.out.println("ID \tNama \tAlamat \t\tTelepon");
        for (int i = 0; i < x; i++) {
            System.out.println(i +"\t"+masyarakat.getNama(i)+"\t"+masyarakat.getAlamat(i)+"\t\t"+masyarakat.getTelepon(i));
        }
    }
}
