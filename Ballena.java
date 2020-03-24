
public class Ballena extends Mamifero
{
  private String pais;
  
  
  public Ballena()
  {
    
  }
  
  public Ballena(String nombre,Integer edad, Integer nPatas,String pais)
  {
    
  super(nombre,edad,nPatas);
  this.pais=pais;
    
  }
  
  @Override
  
  public void imprimir()
  {
  super.imprimir();
  System.out.println(" La ballena: " + getNombre() + " vive en : " +getPais());
    
  }
  public String getPais()
  {
        return this.pais;
 }

    
 public void setPais(String pais)
 {
        this.pais = pais;
 }
  
}
