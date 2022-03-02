/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author Usuario
 */
public class Cubo {
 private float lado;
   
    public Cubo(float lado) {
        this.lado = lado;  //creamos atributos o variables de instancia
        
        
    }
    public float getPerimetro(){
    float perimetro = (12 * lado);
    return perimetro;}
    
    public float getArea(){
    float area = (6 * lado * lado);
    return area;} 
    
    public float getVolumen(){
    float volumen = (lado * lado * lado);
    return volumen;}   
}
