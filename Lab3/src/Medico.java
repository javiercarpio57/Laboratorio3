
/**
 *
 * @author Javier Carpio
 * @author Jose Cifuentes
 * @version 24.09.2017
 * 
 */
public class Medico extends Empleado{

    private int colegiado;
    private int numG;
    private boolean especialista;
    /**
     *  Constructor
     * @param Nit nit del empleado
     * @param dpi DPI del empleado
     * @param Nom Nombre del empleado
     * @param Salario Salario base del empleado
     * @param ID ID del empleado
     * @param NUMG Nuemero de guardias del empleado
     * @param Colegiado numero de colegiado
     * @param Especialista  si es especialista o no
     */
    public Medico(String Nit, String dpi, String Nom, double Salario, int ID, int NUMG, int Colegiado, boolean Especialista) {
        super(Nit, dpi, Nom, Salario, ID, NUMG);
        
        colegiado = Colegiado;
        especialista = Especialista;
        setNumG(numG);
        
    }

    /**
     * Metodo que permite calcular el salario devengado.
     */
    public void CalcularSalario()
    {        
        salario+=(getGuaridia()-2)*900;
    }


    @Override
    /**
     * Metodo que permite conocer todos los datos del empleado.
     * @return concatenar
     */
    public String getInformacion() 
    {
        String cadena = "";
        String a;
        if(especialista == true){
            a = "Si";
        }else{
            a = "No";
        }
        
        cadena = "MEDICO:\n" + super.getInformacion() 
                + "\nNumero de colegiado: " + colegiado
                + "\nEspecialista: " + a;
        
        return cadena;
    }
    
    
    
}
