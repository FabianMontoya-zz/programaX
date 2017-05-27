package paquete;
import java.util.*;
public class operations {
    public double elevar(double a, double b){
        double c=0;
        c=Math.pow(a, b);
        return c;
    }
    //
    public double raiz(double a, double b){
        double c=0;
        c=Math.pow(a, 1.0/b);
        return c;
    }
    //
    public double seno(int a){
        double c=0;
        c=Math.sin(Math.toRadians(a));
        return c;
    }
    //
    public double coseno(int a){
        double c=0;
        c=Math.cos(Math.toRadians(a));
        return c;
    }
    //
    public double tangente(int a){
        double c=0;
        c=Math.tan(Math.toRadians(a));
        return c;
    }
    //
    public double logaritmo (double a){
        double c=0;
        c=Math.log10(a);
        return c;
    }
    //
    public int redondear (double a){
        int c =(int)Math.round (a); 
        return c;
    }
}
