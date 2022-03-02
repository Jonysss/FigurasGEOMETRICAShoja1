/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author Usuario
 */
public class Cono {
     private float radio;
     private float altura;
     private float generatriz;
   
    public Cono(float radio, float altura, float generatriz) {  //creamos atributos o variables de instancia
        this.radio = radio;
        this.altura = altura;
        this.generatriz = generatriz;
        
        
    }
    
    public float getArea(){
    float area = (355/113 * radio * generatriz + 355/113 * radio * radio);
    return area;} 
    
    public float getVolumen(){
    float volumen = ((1/3 * 355/113) * radio * radio * altura);
    return volumen;} 
}
