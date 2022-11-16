
package javaapplication69;
public class JavaApplication69 {

   
    public static void main(String[] args) {
        
        Fraction f1 = new Fraction(3,15);
        System.out.println(f1);
        
        Fraction f2 = new Fraction(1, 4);
        System.out.println(f1.addTo(f2).sokrashenie());//.addTo(new Fraction(1, 4)));
        
        System.out.println(f1.sokrashenie()); 
        
        Fraction f3 = new Fraction(24, 62).sokrashenie();
        //Fraction f4 = f3.sokrashenie();
        //System.out.println(f3 + " " + f4);
        System.out.println(f3);
        
    }   
}
