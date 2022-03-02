/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author Usuario
 */
public class Triangulo {
    
    private float altura;   //creamos atributos o variables de instancia
    private float base;
    private float lado1;
    private float lado2;
    
    public Triangulo(float altura, float base, float lado1, float lado2) {
        this.altura = altura;
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public float getPerimetro(){
    float perimetro = (base + lado1 + lado2);
    return perimetro;}
    
    public float getArea(){
    float area = ((base*altura) / 2);
    return area;}
        
}
