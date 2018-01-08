package tdi.training.java.core;

public class Kendaraan{
    
    public Kendaraan(Integer jumlahRoda){
        this.jumlahRoda = jumlahRoda;
    }

    private Integer jumlahRoda = 4; // hide supaya tidak terexpose maka itu menggunakan private
    private String pabrik;

    public Integer getJumlahRoda(){ // getter (mengeluarkan nilai)
        return this.jumlahRoda;
    }

    public void setJumlahRoda(Integer x){ //setter (inject value ke variable)
        this.jumlahRoda = x;
    }

    public String getNamaPabrik(){
        return this.pabrik;
    }

    public void setNamaPabrik(String pabrik){
        this.pabrik = pabrik;
    }

}

