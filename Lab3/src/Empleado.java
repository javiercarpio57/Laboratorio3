
import java.util.ArrayList;

/**
 *
 * @author jose
 */
public class Empleado 
{
    protected String nit;
    protected String DPI;
    protected String nombre;
    protected double salario;
    protected int id;
    protected int NumG;
    
    public Empleado(){
        
    }
    
    public Empleado(String Nit, String dpi, String Nom, double Salario, int ID, int NUMG)
    {
        nit=Nit;
        DPI=dpi;
        nombre=Nom;
        salario=Salario;
        id=ID;
        NumG=NUMG;
    }
    
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
        
        emp = new Enfermera("4567865'8", "569374160101", "Lorna Suarez", 10000, 4, 0, true, 12);
        em.add(emp);
        
        emp = new Enfermera("6789654-8", "3254786540101", "Mariela Rodriguez", 8000, 5, 0, false, 2);
        em.add(emp);
        
        return em;
    }
    
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
    
    public int getGuaridia()
    {
        return NumG;
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
    
    
    
}
