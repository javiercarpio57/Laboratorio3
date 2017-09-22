

/**
 *
 * @author javie
 */
public class Enfermera extends Empleado
{
    private boolean Intensiva;
    private int AExp;
    private int NumG;
    
    public Enfermera(String Nit, int dpi, String Nom, double Salario, int ID, int NUMG, boolean intensiva, int aexp, int numg) 
    {
        super(Nit, dpi, Nom, Salario, ID, NUMG);
        Intensiva=intensiva;
        AExp=aexp;
        NumG=numg;
    }
    
    public String getInformacion()
    {
        String x="";
        String concatenar="";
        if (Intensiva==true) 
        {
            x="Si";            
        }
        else
        {
            x="No";
        }
        
        
        concatenar=super.getInformacion()+"\n"
                +"Intensivista: "+x+"\n"
                + "Anos de experiencia: "+AExp;            
                
                
        return concatenar;
    }
    
}
