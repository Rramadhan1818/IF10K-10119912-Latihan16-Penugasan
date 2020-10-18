/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119912.latihan16.penugasan;

/**
 *
 * @author 
 * NAMA  : Rezki Ramadhan
 * KELAS : IF10K
 * NIM  `: 10119912
 * Deskripsi Program : Program ini berisi latihan penugasan dengan variabel
 * 
 */
public class IF10K10119912Latihan16Penugasan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        
        System.out.println("Nilai a = " + a);        
        System.out.println("Nilai b = " + b);        
        System.out.println("Nilai c = " + c + "\n");
        
        c = a + b;
        System.out.println("c = a + b = " + c);
        c += a;
        System.out.println("c += a = " + c);
        c -= a;
        System.out.println("c -= a = " + c);
        c *= a;
        System.out.println("c *= a = " + c);
        
        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a = " + c);
        
        a = 10;
        c = 15;
        c %= a;
        System.out.println("c %= a = " + c);
        c <<= 2;
        System.out.println("c <<= 2 = " +c);
        c >>= 2;
        System.out.println("c >>= 2 = " +c);
        c >>= 2;
        System.out.println("c >>= a = " +c);
        c &= a;
        System.out.println("c &= 2 = " +c);
        c ^= a;
        System.out.println("c ^= a = " +c);
        c |= a;
        System.out.println("c |= a = " +c);



        
    }
    
}
