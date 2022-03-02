
package figurasgeometricas;
//Jonathan Oswaldo Sequen Iqute. 
import java.util.Scanner;

public class Figurasgeometricas {

    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in); //Inrerfaz de entrada para el usuario
    int eleccion;
 System.out.println("----BIENVENIDOS, CALCULO DE AREAS, PERIMETROS Y VOLUMENES----" +
  "\n····INGRESE EL NUMERO DE LA FIGURA QUE DESEE CALCULAR SUS DATOS·····" +
  "\n1. CUADRADO" +
  "\n2. RECTANGULO" +
  "\n3. TRIANGULO" +
  "\n4. CIRCULO" +
  "\n5. CILINDRO" +
  "\n6. CUBO" +
  "\n7. CONO" +
  "\n Ingrese el numero: ----"); 
   eleccion = entrada.nextInt();
   
   
   if (eleccion == 1){          //uso de condiciones de elecciones
   
           Cuadrado cuad;
            
           float base, altura;
           String color;
           System.out.println("Digite la base");      
           base = entrada.nextFloat();  
           System.out.println("Digite la altura");      
           altura = entrada.nextFloat();
           System.out.println("Asigne un color a su figura: ");      
           color = entrada.next();
           if(base == altura){
           cuad = new Cuadrado(base);
           }
           else{
           cuad = new Cuadrado(base, altura);
           }
           System.out.println("El perimetro es "+cuad.getPerimetro()); // uso de getters para llamar a la clase
           System.out.println("El area es "+cuad.getArea());
           System.out.println("El color de su cuadrado es: "+ color);          }
        
   else if(eleccion == 2){ // si el usuario elige esta opcion
            Rectangulo rect;

           float base, altura;
           String color;
           System.out.println("digite la base");      
           base = entrada.nextFloat();  
           System.out.println("digite la altura");      
           altura = entrada.nextFloat();
           System.out.println("Asigne un color a su figura: ");      
           color = entrada.next();
           if(base == altura){
           rect = new Rectangulo(base);
           }
           else{
           rect = new Rectangulo(base, altura);
           }
           System.out.println("El perimetro es: "+rect.getPerimetro()); 
           System.out.println("El area es: "+rect.getArea());                  
            System.out.println("El color de su Rectangulo es: "+ color);              }
        
    else if(eleccion == 3){
            Triangulo trian;

           float base, altura, lado1, lado2;
           String color;
           System.out.println("digite la Altura del tirnagulo: ");      
           base = entrada.nextFloat();  
           System.out.println("digite la base:  ");      
           altura = entrada.nextFloat();
           System.out.println("digite un lado del triangulo  ");      
           lado1 = entrada.nextFloat();  
           System.out.println("difite el otro lado del triangulo  ");      
           lado2 = entrada.nextFloat();  
           System.out.println("Asigne un color a su figura: ");      
           color = entrada.next();
           trian = new Triangulo(base, altura, lado1, lado2);
           System.out.println("El perimetro es: "+trian.getPerimetro()); 
           System.out.println("El area es: "+trian.getArea());
           System.out.println("El color de su trinagulo es: "+ color);
                          }    
    else if(eleccion == 4){
            Circulo circ;

           float radio;
           String color;
           System.out.println("Digite el radio del circulo : ");      
           radio = entrada.nextFloat();  
           System.out.println("Asigne un color a su figura: ");      
           color = entrada.next();
           circ = new Circulo(radio);
           System.out.println("El perimetro es: "+circ.getPerimetro()); 
           System.out.println("El area es: "+circ.getArea());
           System.out.println("El color de su circulo es: "+ color);
                          }  
    else if(eleccion == 5){
            Cilindro cil;

           float radio;
           float altura;
           String color;
           float grados;
           System.out.println("Digite el radio del cilindro : ");      
           radio = entrada.nextFloat();  
           System.out.println("Digite la altura del cilindro : ");      
           altura = entrada.nextFloat(); 
           System.out.println("Asigne un color a su figura: ");      
           color = entrada.next();
           cil = new Cilindro(radio, altura);
           System.out.println("El perimetro es: "+cil.getPerimetro()); 
           System.out.println("El area es: "+cil.getArea());
           System.out.println("El volumen del cilindro es : "+cil.getVolumen());
           System.out.println("El color de su cilindro es es: "+ color);
           System.out.println("Quiere girar el cilindro? indiquie cuantos grados: ");
           grados = entrada.nextFloat();
           System.out.println(" El cilindro ha sido movido " + grados + " a la izquierda.");
    } 
   else if(eleccion == 6){
            Cubo cub;

           float lado;
           float grados;
           String color;
           System.out.println("Digite un lado del cubo : ");      
           lado = entrada.nextFloat(); 
           System.out.println("Asigne un color a su figura: ");      
           color = entrada.next();
           cub = new Cubo(lado);
           System.out.println("El perimetro es: "+cub.getPerimetro()); 
           System.out.println("El area es: "+cub.getArea());
           System.out.println("El volumen del cubo  es : "+cub.getVolumen());
           System.out.println("El color de su cubo es es: "+ color);
           System.out.println("Quiere girar el cilindro? indiquie cuantos grados: ");
           grados = entrada.nextFloat();
           System.out.println(" El cubo ha sido movido " + grados + " a la derecha.");               } 
   else if(eleccion == 7){
            Cono con;

           float radio;
           float altura;
           float generatriz;
           float grados;
           String color;
           System.out.println("Digite el radio  del cono : ");      
           radio = entrada.nextFloat(); 
           System.out.println("Digite la altura del cono : ");      
           altura = entrada.nextFloat(); 
           System.out.println("Digite el generatriz del cono: ");      
           generatriz = entrada.nextFloat(); 
           System.out.println("Asigne un color a su figura: ");      
           color = entrada.next();
           con = new Cono(radio, altura, generatriz); 
           System.out.println("El area es: "+con.getArea());
           System.out.println("El volumen del cono  es : "+con.getVolumen());
           System.out.println("El color de su cubo es es: "+ color);
           System.out.println("Quiere girar el cilindro? indiquie cuantos grados: ");
           grados = entrada.nextFloat();
           System.out.println(" El cilindro ha sido movido " + grados + " hacia abajo.");               } 
    }
    
}
