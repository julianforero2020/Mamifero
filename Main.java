

import java.util.*;
public class Main
{
 

    public static ArrayList<Mamifero> animal=new ArrayList <Mamifero>();
    
   
    public Main()
    {
    Mamifero perro1=new Perro("Zeus",4,4,"Julian");
    Mamifero ballena1=new Ballena("Orca",2,0,"Noruega");
    
    animal.add(perro1);
    animal.add(ballena1);
    
    for(Mamifero m:animal){
    m.imprimir();
    }
    
    //perro1.imprimirDatos();
    //ballena1.imprimirDatos();
    
    
    }

    
        
  
}