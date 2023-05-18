
import java.util.ArrayList;
import java.util.Scanner;

public class Barang {
    Scanner ob = new Scanner(System.in);
    ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
    ArrayList<String> namaBarang = new ArrayList<String>();
    ArrayList<Integer> hargaAwal = new ArrayList<Integer>();
    ArrayList<Boolean> status = new ArrayList<Boolean>();
    
    Barang(){
        System.out.print("Masukkan nama Barang : ");
        this.namaBarang.add(ob.next());
        System.out.print("Masukkan harga awal : ");
        this.hargaAwal.add(ob.nextInt());
        System.out.print("Apakah barang bisa ditawar?[y/n] : ");
        String a = ob.next();
        if ("y".equalsIgnoreCase(a)) {
            this.status.add(true);
            System.out.println("Bisa ditawar");
        }else if ("n".equalsIgnoreCase(a)) {
            this.status.add(false);
            System.out.println("Tidak bisa ditawar");
        }else{
            System.out.println("Error");
        }
    }
    int getJmlBarang(){
        return this.namaBarang.size();
    }
    public void setNamaBarang(String namaBarang){
        this.namaBarang.add(namaBarang);
    }
    public void setHargaAwal(int hargaAwal){
        this.hargaAwal.add(hargaAwal);
    }
    public void setStatus(boolean status){
        this.status.add(status);
    }
    public void editStatus(int idMasyarakat, boolean status){
        this.status.set(idMasyarakat, status);
    }
    public String getNamaBarang(int idBarang){
        return this.namaBarang.get(idBarang);
    }
    public Integer getHargaAwal(int idBarang){
        return this.hargaAwal.get(idBarang);
    }
    public Boolean getStatus(int idBarang){
        return this.status.get(idBarang);
    }
}
