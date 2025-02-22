/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cola;

/**
 *
 * @author juanm
 */
public class OperacionesCola {
    
    public static <T extends Base> Cola<T> colaMediaPrio(Cola<T> colaAltaPrio){
        Cola<T> colaMediaPrio=new Cola<>();
        Cola<T> colaBajaPrio=new Cola<>();
       
        while (!colaAltaPrio.estaVacia()) {            
            T elemento=colaAltaPrio.desencolar();
            colaMediaPrio.encolar(elemento);
       }     
        while (!colaMediaPrio.estaVacia()) {            
            T elemento=colaMediaPrio.desencolar();
            T elementoCopiado= (T) elemento.copy();

            colaBajaPrio.encolar(elemento);
            
            colaBajaPrio.encolar(elementoCopiado);
        }
        
        return colaBajaPrio;
    }
        public static <T extends Base> int contarElementos(Cola<T> colaAltaPrio){
            int cantidadElementos=0;
            Cola<T> colaDuplicada=colaMediaPrio(colaAltaPrio);
            while (!colaDuplicada.estaVacia()) {                
                cantidadElementos++;
                colaDuplicada.desencolar();
            }
                       
            return cantidadElementos;
        }
}
