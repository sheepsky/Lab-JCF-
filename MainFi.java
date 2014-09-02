
package FIN;

/**
 *
 * @author sheep
 */
import  java.util.*;

public class MainFi {
    public static void main(String []args ){ 
    // se implementa la opcion scanner para ver que ingresa el usuario
                Scanner s = new Scanner(System.in);
               // se crea una variable que almacena el dato de eleccion
                int eleccion;
                 //se crea el nuevo objeto factory1
                FactoryFi implemt = new FactoryFi ();
                String nombreUsuario;// se declara un string que almacenara el nombre del usuario ingresado
                
                 //se le pide al usuario que ingrese que implementacion desea usar:
                System.out.println("Ingrese la opcion que desee utilizar:\n"
                + "1- HashSet"
                + "\n2- TreeSet"
                + "\n3- LinkedHashSet");
                eleccion = s.nextInt();
                // aqui se encuentra las listas o los subconjuntos
                Set<String> java = implemt.getset (eleccion); //lista de java
                Set<String> web = implemt.getset (eleccion);// lista web
                Set<String> celulares = implemt.getset (eleccion);// lista celulares
                //listas que contendran los resultados de todos los incisos
                Set<String> listacontenedora = implemt.getset (eleccion);// lista utilizada para guarda datos para acer las operaciones
                Set<String> lista1 = implemt.getset (eleccion);// lista de la interseccion 
                Set<String> lista2 = implemt.getset (eleccion);//resultado del inciso 2
                Set<String> lista3 = implemt.getset (eleccion);// resultado del inciso 3
                Set<String> lista4 = implemt.getset (eleccion);// resultado del inciso 4
                Set<String> lista5 = implemt.getset (eleccion);// resultado del inciso 5
                Set<String> lista6 = implemt.getset (eleccion);// resultado del inciso 6 y 7
               
                    //eleccion = 1;
                    do 
                    {
                       System.out.println("Ingrese el nombre de la persona: ");
                     nombreUsuario = s.next();
                     
                     System.out.println("Tiene experiencia en java?:\n1- SI\n2- No");
                     eleccion = s.nextInt();
                     if (eleccion == 1) 
                          {java.add(nombreUsuario); }
                     System.out.println("Es desarrollador de web?:\n1- SI\n2- No");
                     eleccion = s.nextInt();
                     if (eleccion == 1)
                     {
                         web.add(nombreUsuario);
                     }
                     System.out.println("Es  desarrollador de Celulares:?\n1- SI\n2- No");
                     eleccion = s.nextInt();
                     if (eleccion == 1)
                     {
                         celulares.add(nombreUsuario);
                     }
                     System.out.println("Quiere ingresar otro nombre?\n1- Si\n2- No");
                     eleccion = s.nextInt();
             }
                     while(eleccion == 1);
                          //java , web, celulares
                          listacontenedora.addAll(web);
                          listacontenedora.retainAll(java);
                          listacontenedora.retainAll(celulares);
                          lista1 = listacontenedora;
                          System.out.println("Caracteristicas similares de los tres conjuntos: "+lista1);
                          listacontenedora.clear();

                         //2- java sin web
                         listacontenedora.addAll(java);
                         listacontenedora.removeAll(web);
                         lista2 = listacontenedora;
                         System.out.println("Java sin conocimiento web: "+lista2);
                         listacontenedora.clear();
                         //3. celulares y web sin java
                         
                         listacontenedora.addAll(celulares);
                         listacontenedora.retainAll(web);
                         listacontenedora.removeAll(java);
                         lista3 = listacontenedora;
                         System.out.println("web y cel no java: "+lista3);
                         listacontenedora.clear();
 
                         
                         boolean k;
                         k = java.containsAll(web);
                         if (k == false)
                         {
                             System.out.println("Java subconjunto de web");
                         }
                         else 
                         {System.out.println("Java no subconjunto de web");}
                           //6- El conjunto (Java, Web o Celulares) que tenga la cantidad más grande de desarrolladores, y los nombres de esos desarrolladores.
                         nombreUsuario = "";
                         if (web.size() > java.size())
                         {
                             if (web.size() > celulares.size())
                             {
                                 lista6 = web;
                                 nombreUsuario = "Web";
                             }
                             else
                             {
                                 lista6 = celulares;
                                 nombreUsuario = "Celulares";
                             }
                         }
                         else if (java.size() > web.size())
                         {
                             if (java.size() > celulares.size())
                             {
                                 lista6 = java;
                                 nombreUsuario = "Java";
                             }
                             else
                             {
                                 lista6 = celulares;
                                 nombreUsuario = "Celulares";
                             }
                         }
                         else if (celulares.size() > java.size() && celulares.size() > web.size())
                             {
                             lista6 = celulares;
                             nombreUsuario = "Celulares";
                             }
                         else
                         {
                             nombreUsuario = "MISMA CANTIDAD DE ELEMENTOS  .";
                         }
                         System.out.println("lISTA MAS GRANDE: "+nombreUsuario);
                         //7- Del conjunto que tenga la mayor cantidad de desarrolladores, desplegar la lista de los nombres de sus integrantes en orden ascendente.
                         
                         Set ordenado = new TreeSet(lista6);
                         System.out.println("LISTA :\n"+nombreUsuario+"\n"+ordenado);
            }
                
                       
    }
  

