
import java.util.ArrayList;

/**
 *
 * @author Jose Cifuentes
 * @author Javier Carpio
 * @version 24.09.2017
 */
public class Empleado 
{
    protected String nit;
    protected String DPI;
    protected String nombre;
    protected double salario;
    protected int id;
    protected int NumG;
    
    /**
     * Constructor que permite crear un objeto que conecte con esta clase.
     */
    public Empleado(){
        
    }
    
    /**
     * Constructor que crea el objeto de tipo empleado, con sus datos.
     * @param Nit String que contiene el numero de nit del empleado.
     * @param dpi String que contiene el numero de DPI del empleado.
     * @param Nom String que contiene el nombre del empleado.
     * @param Salario double que contiene el salario que gana el empleado.
     * @param ID int que  contiene el codigo de identificacion del empleado.
     * @param NUMG int que contiene el numero de guardias que realiza el empleado en el ano.
     */
    public Empleado(String Nit, String dpi, String Nom, double Salario, int ID, int NUMG)
    {
        nit=Nit;
        DPI=dpi;
        nombre=Nom;
        salario=Salario;
        id=ID;
        NumG=NUMG;
    }
    
    /**
     * Metodo que nos permite conocer el nombre del empleado.
     * @return ""
     */
    public String getNombre(){
        return "";
    }
    
    /**
     * Metodo que establece los datos del empleado contratado.
     * @param em ArrayList que contiene todos los datos de los empleados contratados.
     * @return emp
     */
    public ArrayList crearEmpleados(ArrayList<Empleado> em){
        
        Empleado emp = null;
        //MEDICOS:
        emp = new Medico("6799652-3", "1234567870101", "Juan Perez", 15000, 1, 0, 89098, true);
        em.add(emp);
        
        emp = new Medico("8964547-3", "9876543260101", "Luis Gutierrez", 12000, 2, 0, 98554, false);
        em.add(emp);
        
        emp = new Medico("8786456-6", "56428717150101", "Eduardo Gonzalez", 17000, 3, 0, 5653, true);
        em.add(emp);
        
        emp = new Medico("5684873-1", "4562973920101", "Guadalupe Torres", 17000, 4, 0, 10098, true);
        em.add(emp);
        
        emp = new Medico("8765485-7", "569395290101", "Maria Castillo", 13000, 5, 0, 67965, false);
        em.add(emp);
        
        //ENFERMERAS:
        emp = new Enfermera("563269-K", "5643213450101", "Juana Lopez", 6000, 1, 0, false, 2);
        em.add(emp);
        
        emp = new Enfermera("7654376-6", "1246547850101", "Lidia Mendez", 9000, 2, 0, true, 2);
        em.add(emp);
        
        emp = new Enfermera("9876456-8", "6547854370101", "Miriam Garcia", 8000, 3, 0, false, 14);
        em.add(emp);
        
        emp = new Enfermera("4567865-8", "569374160101", "Lorna Suarez", 10000, 4, 0, true, 12);
        em.add(emp);
        
        emp = new Enfermera("6789654-8", "3254786540101", "Mariela Rodriguez", 8000, 5, 0, false, 2);
        em.add(emp);
        
        return em;
    }
    
    /**
     * Metodo que permite conocer todos los datos del empleado.
     * @return concatenar
     */
    public String getInformacion()
    {
        String concatenar="";
        concatenar+="Nombre: "+nombre+"\n"
                +"DPI: "+DPI+"\n"
                +"Nit: "+ nit+"\n"
                +"Salario: "+salario+"\n"
                +"Numero de Guardias: "+NumG;
        
        return concatenar;    
    }
    
    /**
     * Metodo que permite contar cuantas veces hay un medico especialista y una enfermera intensivista trabajando el mismo dia.
     * @param idMed int que contiene el codigo de identificacion del medico.
     * @param idEnf int que contiene el codigo de identificacion de la enfermera.
     * @param mes Array 2D que contiene las parejas de trabajadores en el mes.
     * @return conteo
     */
    public int contarParejas(int idMed, int idEnf, Posicion[][] mes){
        int med = 0;
        int enf = 0;
        int conteo = 0;
        for (int i = 0; i < mes.length; i++) {
            for (int j = 0; j < mes[0].length; j++) {
                try{
                    med = mes[i][j].getDoc();
                    enf = mes[i][j].getEnf();
                }catch(Exception e){
                    
                }
                
                if((med == idMed) && (enf == idEnf)){
                    conteo++;
                }
                
            }
        }
        return conteo;
        
    }
    
    /**
     * Metodo que permite conocer el salario del empleado.
     * @return salario
     */
    public double getSalario()
    {
        return salario;    
    }
    
    /**
     * Metodo que permite conocer el rango de la persona
     * @return ""
     */
    public String getRango()
    {
        return"";    
    }
    
    /**
     * Metodo que permite conocer el codigo de identificacion del empleado.
     * @return id
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Metodo que permite agregar mas guardias.
     * @param numG 
     */
    public void setNumG(int numG){
        NumG = numG;;
    }
    
    /**
     * Metodo que permite conocer la cantidad de guardias del empleado.
     * @return NumG
     */
    public int getGuaridia()
    {
        return NumG;
    }
    
    /**
     * Metodo que permite calcular el salario devengado.
     */
    public void CalcularSalario(){
        
    }
    // metodos propios de esta clase .....calculos
    
    /**
     * Metodo que permite conocer el empleado con mayor numero de guardias.
     * @param empleado ArrayList que contiene a todos los empleados.
     * @return respuesta
     */
    public String get_Max_GuardiasE(ArrayList<Empleado> empleado)
    {
        String respuesta="";
        int mayor=0;
        double extra;
        
        for(Empleado i: empleado)
        {
            if (i instanceof Enfermera) 
            {
                if (i.getIntesivista()) 
                {
                    if (i.getGuaridia()>mayor) 
                    {
                        extra=(500*(i.getGuaridia()-4));
                        mayor=i.getGuaridia();
                        respuesta="La enfermera Intensivista con mas guardias es:"+i.getNombre()
                                +"\n Y recibe extra: "+extra;
                    }
                }
            }
        }
        return respuesta;
    }
     /**
      * Metodo que permite conocer el total devengado por la clinica.
      * @param empleado ArrayList que contiene a todos los empleados.
      * @return respuesta
      */
    public String get_Total_Devengado(ArrayList<Empleado> empleado)
    {
        double doc=0,enf=0;
        String respuesta="";
        
        for (Empleado i: empleado) 
        {
            if (i instanceof Medico) 
            {
                doc=(i.getGuaridia()-2)*900;
                
            }
            
            if (i instanceof Enfermera) 
            {
                enf=(i.getGuaridia()-4)*500;
                
            }
            
            
        }
        
        respuesta="El total devengado por guardias extras son: \n"
                + "Por Medicos: "+doc+"\n"
                +"Por Enfermeras: "+enf;
        
        return respuesta;
    }
    
    /**
     * Metodo que permite mostrar que empleados estan trabajando en un dia en especifico.
     * @param Dia int que contiene el dia del mes.
     * @param pos Array 2D que contiene las parejas de trabajadores por dia.
     * @param empleado ArrayList que contiene a todos los empleados.
     * @return respuesta
     */
    public String TurnoDeDia(int Dia,Posicion[][] pos,ArrayList<Empleado> empleado)
    {
       String respuesta="";
       int columna=0, fila=0;
       switch (Dia) 
       {
           case 0: respuesta="No hay guardia este día";
                     break;
           
            case 1: columna=0; fila=0;
                     break;
            
            case 2: columna=0; fila=1;
                     break;
                     
            case 3: columna=0; fila=2;
                     break;
                     
            case 4: columna=0; fila=3;
                     break;         
                     
            case 5: columna=0; fila=4;
                     break;  
                     
            case 6: columna=0; fila=5;
                     break;         
                     
            case 7: columna=0; fila=6;
                     break;         
                     
            case 8: columna=1; fila=0;
                     break;     
                     
            case 9: columna=1; fila=1;
                     break;          
                     
            case 10: columna=1; fila=2;
                     break;         
                     
            case 11: columna=1; fila=3;
                     break;          
                     
            case 12: columna=1; fila=4;
                     break;          
                     
            case 13: columna=1; fila=5;
                     break;      
                     
            case 14: columna=1; fila=6;
                     break;          
                     
            case 15: columna=2; fila=0;
                     break;          
                     
            case 16: columna=2; fila=1;
                     break;     
                     
            case 17: columna=2; fila=2;
                     break;          
                     
            case 18: columna=2; fila=3;
                     break;          
                     
            case 19: columna=2; fila=4;
                     break;          
                     
            case 20: columna=2; fila=5;
                     break;          
                     
            case 21: columna=2; fila=6;
                     break;          
                     
            case 22: columna=3; fila=0;
                     break;       
                     
            case 23: columna=3; fila=1;
                     break;         
                     
            case 24: columna=3; fila=2;
                     break;         
                     
            case 25: columna=3; fila=3;
                     break;         
                     
            case 26: columna=3; fila=4;
                     break;         
                     
            case 27: columna=3; fila=5;
                     break;    
                     
            case 28: columna=3; fila=6;
                     break;         
                     
            case 29: columna=4; fila=0;
                     break;      
                     
            case 30: columna=4; fila=1;
                     break;
                     
            case 31: columna=4; fila=2;
                     break;         
                     
       } 
       
       Posicion p=new Posicion(0,0);
       p= pos[columna][fila];
       
       int medico=p.getDoc();
       int enfermera=p.getEnf();
       
        for (Empleado i: empleado) 
        {
            if (Dia==0) 
            {
             break;   
            }
            if (i instanceof Medico) 
            {
                if (i.getId()==medico) 
                {
                    respuesta= "\n"+ i.getInformacion()+"\n";
                    
                }
                
                
            }
            
            if (i instanceof Enfermera) 
            {
                if (i.getId()==enfermera) 
                {
                    respuesta+= "\n"+ i.getInformacion()+"\n";
                    
                }
                
                
            }
            
        }
        
    
       return respuesta;
    }
    
    /**
     * Metodo que permite conocer si un empleado es enfermera e intensivista.
     * @return 
     */
    public boolean getIntesivista(){
        return false;
    }
    
    
}
