
package bmi;

/**
 *
 * @author Xylo
 */
public class BMIBeraksi {
    int berat;
    int tinggi;
    
    public BMIBeraksi(int tinggi, int berat) {
        this.berat = berat;
        this.tinggi = tinggi;
    }
    
    public void BMIKalkulator(){
        double hasil = berat /(tinggi *2 / 100);
        System.out.println("Hasil dari tinggi badan " + tinggi + " dan berat badan " + berat);
        if(hasil < 18.0){
            System.out.println("Adalah "+ hasil +" Artinya Kategori Anda : Kurus ");
        } else if(hasil >= 18.0 && hasil <= 22.9){
            System.out.println("Adalah "+ hasil +" Artinya Kategori Anda : Normal ");
        } else if(hasil >= 23.0 && hasil <= 24.9){
            System.out.println("Adalah "+ hasil +" Artinya Kategori Anda : Gemuk ");
        } else {
            System.out.println("Adalah "+ hasil +" Artinya Kategori Anda : Obesitas ");
        
        }
    }
}
