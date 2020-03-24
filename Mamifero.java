
public class Mamifero
{
   private String nombre;
   private Integer edad;
   private Integer nPatas;
   
   public Mamifero()
   {}
   
   public Mamifero(String nombre,Integer edad, Integer nPatas)
   {
    this.nombre=nombre;
    this.edad=edad;
    this.nPatas=nPatas;
    
    
   }
   
   public void imprimir()
   {
     System.out.println ( " El nombre del mamifero es: " + getNombre() + " \n La edad del mamifero es: " + getEdad() + "\n El numero de patas es: " + getnPatas());
       
       
    }
    public String getNombre(){
        return this.nombre;
    }

    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

   
    public Integer getEdad(){
        return this.edad;
    }

    
    public void setEdad(Integer edad){
        this.edad = edad;
    }
    
    public Integer getnPatas(){
        return this.nPatas;
    }

    
    public void setPatas(Integer nPatas){
        this.nPatas = nPatas;
    }
   
   
   
}
