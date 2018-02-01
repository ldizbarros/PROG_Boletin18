package boletin18;

import java.util.ArrayList;
import java.util.Iterator;

public class Buzon {
    private ArrayList <Correo> listaCorreos = new ArrayList();
    
    public int numeroDeCorreos(){
       return listaCorreos.size();
    }
    
    public void engadirCorreo(Correo c){
        listaCorreos.add(c);
    }
    
    public boolean porLer(){
        Iterator it = listaCorreos.iterator();
        while(it.hasNext()){
            Correo c = (Correo) it.next();
            if (!c.isLeido()){
                return true;
            } 
        }
        return false;
    }
    
    public String amosarPrimerNoLeido(){
        Iterator it = listaCorreos.iterator();
        while(it.hasNext()){
            Correo c = (Correo) it.next();
            if (!c.isLeido()){
                return c.getCorreo();
            }
        }
        return null;
    }
    
    public String amosar(int k){
        Correo c = listaCorreos.get(k-1);
        return c.getCorreo();
    }
    
    public void eleminar(int k){
        listaCorreos.remove(k-1);
    }
    
    public void amosarBuzon(){
        Iterator it = listaCorreos.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}