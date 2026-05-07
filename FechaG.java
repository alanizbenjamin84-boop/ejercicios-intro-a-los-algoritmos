import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class FechaG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FechaG
{
    private int dia;
    private int mes;
    private int anho;
    private List <String> fechas;
    
    public FechaG(int dia ,int mes , int anho) {
        assert anho >= 1582;
         if (anho == 1582) {
             assert dia >= 15;
             assert mes >= 10;
         }else {
            assert dia > 0 && dia <= 31;
            assert mes > 0;
         
            
       
     
        }
}
}

