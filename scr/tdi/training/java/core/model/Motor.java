package tdi.training.java.core.model;

import tdi.training.java.core.Kendaraan;

public class Motor extends Kendaraan{

    public Motor(){
        super(4);
    }

     public String getNamaPabrik(){
        return "Yamaha"; //untuk output nilai padda this.getNamaPabrik()
    }

    public void setNamaPabrik(String pabrik){ 
        super.setNamaPabrik("Kendaraan belum diisi!"); //untuk output nilai pada super.getNamaPabrik()
        System.out.println(String.format("Dari kelas motor: %s", this.getNamaPabrik()));
        System.out.println(String.format("Dari kelas motor: %s", super.getNamaPabrik()));
    }

    public static void main(String[] args){
        Motor yamaha = new Motor();
        yamaha.setNamaPabrik(yamaha.getNamaPabrik());
    }


}