/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author Usuario
 */
public class Cuadrado {
    
   private float base; // creamos los atributos para la clase 
   private float altura;

    public Cuadrado(float base, float altura) { // creamos los constructores para la clase
        this.base = base;
        this.altura = altura;
    }
    public Cuadrado(float base) {
        this.base = this.altura = base;
    }

   public float getPerimetro(){
   float perimetro = (base + altura + base + altura);
   return perimetro;
   } 
        
    public float getArea(){
    float area = (base*altura);
    return area;
    
    }
   
}
 