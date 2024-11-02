
package bmi;

/**
 *
 * @author Xylo
 */
import java.util.Scanner;
public class BMI {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-----Kalkulator BMI-----");
        System.out.println("________________________________");
        System.out.print("Masukan Tinggi Badan Anda : ");
        int tb = in.nextInt();
        System.out.print("Masukan Berat Badan Anda  : ");
        int bb = in.nextInt();
        BMIBeraksi BMIKalkulator = new BMIBeraksi(tb, bb);
        BMIKalkulator.BMIKalkulator();
    }
    
}
