/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author Usuario
 */
public class Cilindro {
   private float radio;
   private float altura;
    public Cilindro(float radio, float altura) {  //creamos atributos o variables de instancia
        this.radio = radio;
        this.altura = altura;
        
    }
    public float getPerimetro(){
    float perimetro = ((2 * 355/113 * radio) * altura);
    return perimetro;}
    
    public float getArea(){
    float area = ((2 * 355/113 * radio * altura) + 2 * 355/113 * radio * radio);
    return area;} 
    
    public float getVolumen(){
    float volumen = ((355/113) * radio * radio * altura);
    return volumen;}
}
