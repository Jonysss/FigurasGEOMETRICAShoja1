/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author Usuario
 */
public class Circulo {
    private float radio;
    public Circulo(float radio) {  //creamos atributos o variables de instancia
        this.radio = radio;
        
    }
    public float getPerimetro(){
    float perimetro = ((2 * radio) * 355/113);
    return perimetro;}
    
    public float getArea(){
    float area = ((355/113) * radio * radio);
    return area;}
}
