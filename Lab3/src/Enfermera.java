

/**
 *
 * @author javie
 */
public class Enfermera extends Empleado
{
    private boolean Intensiva;
    private int AExp;
    private int NumG;
    
    public Enfermera(String Nit, String dpi, String Nom, double Salario, int ID, int NUMG, boolean intensiva, int aexp) 
    {
        super(Nit, dpi, Nom, Salario, ID, NUMG);
        Intensiva=intensiva;
        AExp=aexp;
        NumG=NUMG;
    }
    
    @Override
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
        
        
        concatenar= "ENFERMERA:\n" + super.getInformacion()+"\n"
                +"Intensivista: "+x+"\n"
                + "Anos de experiencia: "+AExp;            
                
                
        return concatenar;
    }
    
    public String getNombres(){
        return nombre;
    }
    
    @Override
    public boolean getIntesivista(){
        boolean a = Intensiva;
            
        
        return a;
    }
    
}
