import java.util.ArrayList;
public class Masyarakat implements User{
    ArrayList<String> namaMasyarakat = new ArrayList<String>();
    ArrayList<String> alamat = new ArrayList<String>();
    ArrayList<String> telepon = new ArrayList<String>();
    
    Masyarakat(){
       this.namaMasyarakat.add("Arin");
       this.alamat.add("Lumajang");
       this.telepon.add("087654567867");
       
       this.namaMasyarakat.add("Munir");
       this.alamat.add("Lampung");
       this.telepon.add("089345674323");
       
       this.namaMasyarakat.add("Udin");
       this.alamat.add("Gresik");
       this.telepon.add("086378432345");
    }
    
    int getJmlMasyarakat(){
        return this.namaMasyarakat.size();
    }
   
    @Override
    public void setNama(String nama) {
        this.namaMasyarakat.add(nama);
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
        return this.namaMasyarakat.get(id);
    }

    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
 
}
