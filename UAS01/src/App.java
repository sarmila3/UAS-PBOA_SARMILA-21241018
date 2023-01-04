class HitunganLingkaran{
    double jarijari;
    double diameter;
    double phi;
    double keliling,luas;

    HitunganLingkaran(double jarijari, double diameter, double phi){
        this.jarijari = jarijari;
        this.diameter = diameter;
        this.phi = phi;
        this.keliling = 2*phi*jarijari;
        this.luas = phi*jarijari*jarijari;
    }
    void keliling(){
        double keliling = 2*phi*jarijari;
        return;
    }
    void luas(){
        double luas = phi*jarijari*jarijari;
        return;
    }
    public void display(){
        System.out.println("jari-jari\t\t :" + this.jarijari);
        System.out.println("diameter\t\t :" + this.jarijari);
        System.out.println("keliling lingkaran\t :" + keliling);
        System.out.println("luas lingkaran\t\t :" + luas);
    }



}
public class App {
    public static void main(String[] args) throws Exception {
     HitunganLingkaran Ling = new HitunganLingkaran(20.0, 80.0, 3.14)  ;

     Ling.display();
    }
}
