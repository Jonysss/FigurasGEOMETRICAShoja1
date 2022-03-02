/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author Usuario
 */
            public class Rectangulo { // creamos los atributos para la clase
            private float base;
            private float altura;
            public Rectangulo(float base, float altura) {
            this.base = base;
            this.altura = altura;
                }
            public Rectangulo(float base) {
            this.base = this.altura = base;// creamos los constructores para la clase
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
