
package javaapplication69;

public class Fraction {
    
    private int top;
    private int bottom;

    public Fraction(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    public Fraction() {
        this(1, 1);
    }   

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getBottom() {
        return bottom;
    }
    
    public void setBottom(int bottom) {       
        this.bottom = bottom;
    }
    
    public void setTopBottom(int top, int bottom){
        setTop(top);
        setBottom(bottom);
    }
    
    public Fraction addTo(Fraction rValue){
        return new Fraction(top * rValue.bottom + rValue.top * bottom, bottom * rValue.bottom);
    }
    
    public  int nod(int top, int bottom){
        int nod = 1;
        for (int i = 1; i <= top && i<= bottom ; i++) {
            if( top % i == 0 && bottom % i == 0){
                nod = i;
            }
        }        
        return nod;
    }
    
    public int nok (int top, int bottom){
        return top * (bottom/nod(top,bottom));
    }
    
    public Fraction sokrashenie(){        
        for (int i = 1;  i<= top && i<= bottom; i++) {
            if(top % i == 0 && bottom % i == 0){
                top /= i;
                bottom /= i;
            }            
        }
        return new Fraction(top, bottom) ;
    }   

    @Override
    public String toString() {
        return   top + "/" + bottom;
    }

    
}
