
public class Perro extends Mamifero
{
    private String dueno;
   
     

    
    public Perro()
    {
      super();
    }
    
    public Perro(String nombre,Integer edad,Integer patas,String dueno)
    { 
        super(nombre,edad,patas);
        this.dueno=dueno;
    }
     
    
     
    @Override
    
     public void imprimir()
    {

        super.imprimir();
        System.out.println(" El perro: "+ getNombre() + " tiene un amo y se llama: " + getdueno());
      
     
    }
    
    public void ladrar()
    {
       System.out.println(" El perro " + getNombre() + "ladra: Guau Guau");
    }
    
     public void cuidarAmo()
    {
       System.out.println(" Soy el mejor amigo del hombre y mi funcion es cuidar a: " + getdueno());
    }
    
    public String getdueno(){
        return this.dueno;
    }

    
    public void setdueno(String dueno){
        this.dueno = dueno;
    }
}
