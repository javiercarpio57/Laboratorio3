
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
        setNumG(numG);
        
    }

    @Override
    public String getRango() {
        return super.getRango(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getSalario() {
        return super.getSalario(); //To change body of generated methods, choose Tools | Templates.
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
        
        cadena = super.getInformacion() + "\nNumero de colegiado: " + colegiado
                + "\nEspecialista: " + a;
        
        return cadena;
    }
    
    
    
}
