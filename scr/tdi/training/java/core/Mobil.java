package tdi.training.java.core;

public class Mobil extends Kendaraan{
    private String nama;
    
    public Mobil(){
        super(4);
        System.out.println("ini contruktur di panggil ketika di inisialiasi");
    }
    public Mobil(String nama){
        super(5);
        this.nama = nama;
        System.out.println(String.format("variable nama berisi %s", this.nama));
    }
    public void setNama(String nama){
        System.out.println(super.getJumlahRoda()); // pakai super karena private
        // tidak bisa di akses karena private
        // System.out.println(pabrik)
        this.nama = nama;
    }
    
        //@Overload
        public String getNamaPabrik(){
        return super.getNamaPabrik();
    }   
        // POLYMORPISM (kembar tapi tak sama) nama sama dengan setnama tapi yang satu pakai parameter
        public void setNama(){
        System.out.println(super.getJumlahRoda()); // pakai super karena private
        this.nama = "Mitshubitsi";
    }

    public String nama(){
        return this.nama;
    }

    public static void main (String[] args){
        Mobil honda = new Mobil();
        honda.setNama(); // mengecek setNama() tanpa parameter 
        System.out.println(honda.nama()); // output 4 dan Matshubitsi
        honda.setNama("Honda civic"); // mengecek setNama(String nama)
        System.out.println(honda.nama()); // output 4 dan honda civic
        
        honda.setNamaPabrik("Astra Honda");
        System.out.println(String.format("Nama Pabrik %s", honda.getNamaPabrik()));
    }
}