/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class Empleado 
{
    protected String nit;
    protected int DPI;
    protected String nombre;
    protected double salario;
    protected int id;
    protected int NumG;
    
    
    public Empleado(String Nit, int dpi, String Nom, double Salario, int ID, int NUMG)
    {
        nit=Nit;
        DPI=dpi;
        nombre=Nom;
        salario=Salario;
        id=ID;
        NumG=NUMG;
    }
    
    public String getInformacion()
    {
        String concatenar="";
        concatenar+="Nombre: "+nombre+"\n"
                +"DPI: "+DPI+"\n"
                +"Nit: "+ nit+"\n"
                +"Salario: "+salario+"\n"
                +"Bumero de Guardias: "+NumG;
        
        
        
        return concatenar;    
    }
    
    public double getSalario()
    {
        return salario;    
    }
    
    public String getRango()
    {
        return"";    
    }
    public int getId()
    {
        return id;
    }
    public void setNumG(int numG){
        NumG += numG;;
    }
    // metodos propios de esta clase .....calculos
    
    public int get_Max_GuardiasE()
    {
        return 1 ;
    }
    
    public double get_Total_Devengado()
    {
        return 0.0;
    }
    
    public void setPosiciones()
    {
    }
    
    
    
    
    
}
