
import java.util.ArrayList;

public class Petugas extends Masyarakat{
    ArrayList<String> namaPetugas = new ArrayList<String>();
    ArrayList<String> alamat = new ArrayList<String>();
    ArrayList<String> telepon = new ArrayList<String>();
    
    Petugas(){
        this.namaPetugas.add("Putri");
        this.alamat.add("Pontianak");
        this.telepon.add("081234234563");
    }
    
    int Petugas(){
        return this.namaPetugas.size();
    }
    public int getJmlPetugas(){
        return this.namaPetugas.size();   
    }

    @Override
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int id) {
        return this.namaPetugas.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
}
