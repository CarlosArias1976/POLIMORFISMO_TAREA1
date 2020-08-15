/*
 * 
 */
package polimorfismotarea1;

/**
 *
 * @author Carlos Arias
 */
class Neumatico{
    public void Determinar_Datos(){
        System.out.println("La mayor Area la proporciona: Neumatico Radial ");
    }
}

class Neumatico_Asfalto extends Neumatico{
    public void Determinar_Datos(){
        System.out.println("El neumatico es para: automovil");
        System.out.println("El neumatico es para: SUV");
    }
}

class Neumatico_Zona_Rural extends Neumatico{
    public void Determinar_Datos(){
        System.out.println("Su uso es para: Competencia");
        System.out.println("Su uso es para: trabajo");
    }
}

class Neumatico_Todoterreno extends Neumatico{
    public void Determinar_Datos(){
        System.out.println("Indicado para: Turismo");
        System.out.println("Utilizado para: Estetica");
    }
}

class Neumatico_Mixto extends Neumatico{
    public void Determinar_Datos(){
        System.out.println("su composicion es:80% Asfalto");
        System.out.println("Su composicion es: 50% Asfalto");
    }
}
public class PolimorfismoTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Neumatico caso1=new Neumatico_Asfalto();
        Neumatico caso2=new Neumatico_Zona_Rural();
        Neumatico caso3=new Neumatico_Todoterreno();
        Neumatico caso4=new Neumatico_Mixto();
        Neumatico caso5=new Neumatico();
        
        System.out.println("-------------------------------------------------");
        System.out.println("            Datos: Neumatico_Asfalto");
        caso1.Determinar_Datos();
        System.out.println("-------------------------------------------------");
        System.out.println("            Datos: Neumatico_Zona_Rural");
        caso2.Determinar_Datos();
        System.out.println("-------------------------------------------------");
        System.out.println("            Neumatico_Todoterreno");
        caso3.Determinar_Datos();
        System.out.println("-------------------------------------------------");
        System.out.println("            Datos: Neumatico_Mixto");
        caso4.Determinar_Datos();
        System.out.println("-------------------------------------------------");
        System.out.println("            Datos: Neumatico");
        caso5.Determinar_Datos();
        System.out.println("-------------------------------------------------");
    }
    
}