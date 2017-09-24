
/**
 *
 * @author javie
 */
public class Medico extends Empleado{

    private int colegiado;
    private int numG;
    private boolean especialista;
    
    public Medico(String Nit, String dpi, String Nom, double Salario, int ID, int NUMG, int Colegiado, boolean Especialista) {
        super(Nit, dpi, Nom, Salario, ID, NUMG);
        
        colegiado = Colegiado;
        especialista = Especialista;
        setNumG(numG);
        
    }

    public void CalcularSalario()
    {        
        salario+=(getGuaridia()-2)*900;
    }


    @Override
    public String getInformacion() {
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
