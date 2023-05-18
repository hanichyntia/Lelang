

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Lelang {
   
    Scanner scan = new Scanner(System.in);
    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar = new ArrayList<Integer>();

    Lelang() {
        this.idMasyarakat.add(0);
        this.idMasyarakat.add(1);
        this.idMasyarakat.add(2);
        this.idBarang.add(0);
        this.hargaTawar.add(0);
        this.hargaTawar.add(0);
        this.hargaTawar.add(0);
    }

    public void prosesLelang(Masyarakat masyarakat, Lelang lelang, Barang barang) {
        ArrayList<Integer> idBarang = new ArrayList<Integer>();
        int i = 0;
        int idmasyarakat = 0;
        String temp;
        if (barang.getStatus(i) == true) {
            System.out.println("\n====================================");
            System.out.println("SILAHKAN MELAKUKAN PENAWARAN");
            System.out.println("====================================");
            do {
                System.out.print("\nApakah ada harga penawaran terbaru?[y/n] : ");
                temp = scan.next();
                if (!"n".equals(temp)) {
                    System.out.print("Masukkan Id Penawar                : ");
                    idmasyarakat = scan.nextInt();
                    System.out.println("Selamat datang " + masyarakat.getNama(idmasyarakat));
                    System.out.print("Masukkan harga tawar barang        : ");
                    int hargatawar = scan.nextInt();
                    editHargaTawar(idmasyarakat, hargatawar);
                    int max = Collections.max(hargaTawar);
                    if (hargatawar <= barang.getHargaAwal(0)) {
                        System.out.println("Harga harus diatas "+barang.getHargaAwal(0));
                    }else{
                    System.out.println(" ");
                    i++;
                    }
                    
                }
            } while (!"n".equalsIgnoreCase(temp));
            System.out.println("\nLelang ditutup! Barang sudah tidak dapat ditawar!");
            barang.editStatus(0, false);

            System.out.println("\n====================================");
            System.out.println("HASIL LELANG");
            System.out.println("====================================");
            System.out.println("Nama  \t\tNama Barang \tHarga Tawar \t");
            int x = hargaTawar.size();
            for (int j = 0; j < x; j++) {
                System.out.println(masyarakat.getNama(j) + "\t\t" + barang.getNamaBarang(0) + "\t\t" + hargaTawar.get(j));
            }

        } else {
            System.out.println("====================================");
            System.out.println("\nBARANG TIDAK BOLEH DITAWAR!");
            System.out.println("\n====================================");
            String answer = scan.next();
            if ("y".equalsIgnoreCase(answer)) {
                System.out.println("BARANG BERHASIL ANDA BELI!");

                System.out.println("\n====================================");
                System.out.println("LAPORAN PEMBELIAN");
                System.out.println("====================================");
                System.out.println("Nama Masyarakat \tNama Barang \tHarga Barang");
                int x = barang.getHargaAwal(0);
                System.out.println(masyarakat.getNama(idmasyarakat) + "\t\t" + barang.getNamaBarang(0) + "\t\t" + barang.getHargaAwal(0));
            } else {
                System.out.println("BARANG TIDAK JADI ANDA BELI!");
            }
        }
    }

    public void setLelang(Barang barang, int idMasyarakat, int idBarang, int hargaTawar) {
        this.idMasyarakat.add(idMasyarakat);
        this.idBarang.add(idBarang);
        this.hargaTawar.add(hargaTawar);
    }

    public int getIdBarang(int id) {
        return this.idBarang.get(id);
    }

    public int gethargaTawar(int id) {
        return this.hargaTawar.get(id);
    }

    public int getIdMasyarakat(int id) {
        return this.idMasyarakat.get(id);
    }

    public int getJmlLelang() {
        return this.hargaTawar.size();
    }

    public void setHargaTawar(int hargaTawar) {
        this.hargaTawar.add(hargaTawar);
    }

    public int getHargaTawar(int idMasyarakat) {
        return this.hargaTawar.get(idMasyarakat);
    }

    public void editHargaTawar(int idMasyarakat, int hargaTawar) {
        this.hargaTawar.set(idMasyarakat, hargaTawar);
    }
}

