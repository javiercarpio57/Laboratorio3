
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class Posicion 
{
    private int doc;
    private int enf;
    
    public Posicion(){
        
    }
    
    public Posicion(int D,int E)
    {
        doc=D;
        enf=E;    
    }
    
    public int getDoc()
    {
        return doc;
    }
    public int getEnf()
    {
        return enf;
    }
    
    public Posicion[][] setPosiciones(ArrayList<Empleado> empleado, Posicion[][] Mes, int dias){
        
        Posicion[][] mes = Mes.clone();
        int cant = 0;
        
        for (int i = 0; i < mes.length; i++) //filas
        {
            for (int j = 0; j < mes[0].length; j++) //columnas
            {
                int a=(int) (Math.random() * 5) + 1, b=(int) (Math.random() * 5) + 1;
                Posicion p=new Posicion(a,b); //ahi van numeros random abuelitas
                
                //aqui se le va a sumar uno a la cantidad de guardias tanto de doctores como
                // de enfermeras que coicidan con los id's generados al azar.
                for(Empleado q:empleado)
                {
                    //si el empleado es Medico
                    if (q instanceof Medico) 
                    {
                        if (a==q.getId()) 
                        {
                            q.setNumG(q.getGuaridia()+1);// tenemos que hacer un get de guardia y sumarle 1
                            
                        }
                        
                    }
                    
                    //si el empleado es enfermera
                    if (q instanceof Enfermera) 
                    {
                        if (a==q.getId()) 
                        {
                            q.setNumG(q.getGuaridia()+1);// tenemos que hacer un get de guardia y sumarle 1
                            
                        }
                        
                    }
                  
                }
                
                
                if(cant < dias){
                    mes[i][j]=p;
                    cant ++;
                }else{
                    break;
                }
            }
            
        }
        
        
        /*VER MATRIZ DEL MES
        String cadena = "";
        for(int x = 0; x < mes.length; x++){
            for(int y = 0; y < mes[0].length; y++){
                cadena += mes[x][y]+ "\t";
            }
            cadena += "\n";
        }
        if(cadena.equals("")){
            cadena = "No hay ninguna matriz para mostrar.";
        }
        System.out.println(cadena);
        */
        return mes;
        
    }
    
    
    
    
    
    
    
}
