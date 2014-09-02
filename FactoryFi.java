
package FIN;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class FactoryFi  {
      
//se utiliza el patron Factory  
    public Set<String> getset(int entrada) {
    // seleccion de la implementacion a utilizar:
       if (entrada ==1){
             return new HashSet(); //si elige hashset
       }
       else if(entrada==2){
            return new TreeSet(); //si elige treeset
       }
       else{  
            return new LinkedHashSet(); //  si elige liked hashset
}
}
}