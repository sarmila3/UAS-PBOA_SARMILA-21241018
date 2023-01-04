class Pegawai{
    public String nama;
    public String jabatan;
    public double pajak;
    private double gajiPokok;
    private double gajiBersih;

    public Pegawai(String nama, String jabatan, double pajak){
        this.nama = nama;
        this.jabatan = jabatan;
        this.pajak = pajak;
    }
    //setter
    public void setgajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
        
    }
    //getter
    public double getgajiBersih(){
        return gajiBersih;

    }
    public double getHitunggajiBersih(){
        return gajiPokok-(gajiPokok * pajak);
    
    }
public void display(){
    System.out.println("Nama Pegawai :" + this.nama);
    System.out.println("jabatan :" + this.jabatan);
    System.out.println("gaji bersih :" + getHitunggajiBersih());
}
        
    }

    
    

public class App {
    
    public static void main(String[] args) throws Exception {
    
    Pegawai pgw = new Pegawai("Rina", "sekretaris", 20.000);
    pgw.display();
}
}
