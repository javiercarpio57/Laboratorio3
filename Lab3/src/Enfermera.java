

/**
 *
 * @author Javier Carpio
 * @author Jose Cifuentes
 * @version 24.09.2017
 * 
 */
public class Enfermera extends Empleado
{
    private boolean Intensiva;
    private int AExp;
    private int NumG;
    
    /**
     *  Constructor
     * @param Nit nit del empleado
     * @param dpi DPI del empleado
     * @param Nom Nombre del empleado
     * @param Salario Salario base del empleado
     * @param ID ID del empleado
     * @param NUMG Nuemero de guardias del empleado
     * @param instensivista se especifica si es intensivista
     * @param aexp anos de experiencia 
     
     */
    public Enfermera(String Nit, String dpi, String Nom, double Salario, int ID, int NUMG, boolean intensiva, int aexp) 
    {
        super(Nit, dpi, Nom, Salario, ID, NUMG);
        Intensiva=intensiva;
        AExp=aexp;
        NumG=NUMG;
    }
    
    @Override
    /**
     * Metodo que permite conocer todos los datos del empleado.
     * @return concatenar
     */
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
    
    /**
     * Metodo que permite calcular el salario devengado.
     */
    public void CalcularSalario()
    {        
        salario+=(getGuaridia()-4)*500;
    }
    
    /**
     * 
     * @return nombre 
     */
    public String getNombre()
    {
        return nombre;
    }
    
    @Override
    /**
     * devuelve si es intensivista o no
     * @return a 
     */
    public boolean getIntesivista()
    {
        boolean a = Intensiva;
            
        
        return a;
    }
    
}
