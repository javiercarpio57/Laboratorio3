

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
                            int xx = q.getGuaridia();
                            q.setNumG(xx+1);// tenemos que hacer un get de guardia y sumarle 1
                            
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
    
    public int posColumna(int dia){
        String respuesta = "";
        int columna, fila = 0;
        
        switch (dia) 
       {
           case 0: ;
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
        
        return fila;
        
        
    }
    public int posFila(int dia){
        String respuesta = "";
        int columna = 0, fila = 0;
        
        switch (dia) 
       {
           case 0: 
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
        
        return columna;
        
    }
    
    public Posicion[][] intercambioDia(Posicion[][] mes, int c1, int f1, int f2, int c2, ArrayList<Empleado> em){
        Posicion dato1 = mes[f1][c1];
        Posicion dato2 = mes[f2][c2];
        
        int enf1 = dato1.getEnf();
        int enf2 = dato2.getEnf();
        int med1 = dato1.getDoc();
        int med2 = dato2.getDoc();
        boolean int1 = false;
        boolean int2 = false;
        
        for(Empleado x: em){
            if(x instanceof Enfermera){
                if(x.getId() == enf1){
                    int1 = x.getIntesivista();
                }
                if(x.getId() == enf2){
                    int2 = x.getIntesivista();
                }
            }
        }
        
        System.out.println(int1);
        System.out.println(int2);
        
        if(int1 == int2){
            Posicion a1 = new Posicion(med1, enf2);
            Posicion a2 = new Posicion(med2, enf1);
            
            mes[f1][c1] = a1;
            mes[f2][c2] = a2;
            JOptionPane.showMessageDialog(null, "Cambio realizado con exito.");
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo realizar el cambio\nAmbas deben ser intensivistas.");
        }
        
        
        return mes;
        
        
    }
    
    public void EstablecerDias1(Posicion[][] mes, String nombre, int id){
        
        int cont = 0;
        int enfermera =0 ;
                
                for(int i = 0; i < mes.length; i++){
                        for(int j = 0; j < mes[0].length; j++){
                            Posicion p = mes[i][j];
                            try{
                                enfermera = p.getEnf();
                            }catch(Exception ae){
                            
                            }
                            
                            cont++;
                            if(enfermera == id){
                                Inicio.cmbDia1.addItem(cont);
                            }
                        }
                    }
                
    }
    
    public void EstablecerDias2(Posicion[][] mes, String nombre, int id){
        final Posicion[][] a = mes.clone();
        final String n = nombre;
        
        
        int cont = 0;
        int enfermera =0 ;
                
                for(int i = 0; i < mes.length; i++){
                        for(int j = 0; j < mes[0].length; j++){
                            Posicion p = a[i][j];
                            try{
                                enfermera = p.getEnf();
                            }catch(Exception ae){
                            
                            }
                            
                            cont++;
                            if(enfermera == id){
                                Inicio.cmbDia2.addItem(cont);
                            }
                        }
                    }
    }
}
