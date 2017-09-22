
/**
 *
 * @author javie
 */
public class Medico extends Empleado{

    private int colegiado;
    private int numG;
    private boolean especialista;
    
    public Medico(String Nit, int dpi, String Nom, double Salario, int ID, int NUMG, int Colegiado, boolean Especialista) {
        super(Nit, dpi, Nom, Salario, ID, NUMG);
        
        colegiado = Colegiado;
        especialista = Especialista;
    }
    
}
