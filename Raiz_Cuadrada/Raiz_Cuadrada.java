import java.awt.*; 
import java.applet.*; 
import java.awt.event.*; 
import java.lang.Math;
 
public class Raiz_Cuadrada extends Applet implements ActionListener { 
   TextField t; 
   Button b; 
 
   //método constructor,donde se crean los objetos a dibujar en el applet
   public Raiz_Cuadrada() { 
      t = new TextField();    // se crea el objeto texto
      b = new Button("Calcula Raiz Cuadrada");   // se crea el boton para calcular
      add(t);    // se añade el texto a la pantalla
      add(b);    // se añade el botón a la pantalla
      b. addActionListener(this);   // se le añade al boton la facilidad de
						// ser escuchado
   }
   //método paint en el cual se pone lo que se quiere dibujar 
   public void paint(Graphics g) { 
      double valorUsuario = Integer.parseInt(t.getText()); 
      double resultado=0;
      
      resultado=Math.sqrt(valorUsuario);
      
      g.drawString("Raiz Cuadrada = "+resultado, 200, 200); 
   } 
   // método para realizar las opciones al oprimir un botón
   public void actionPerformed(ActionEvent ae) { 
      repaint();   //  se le pide que se repinte la ventana
   } 
} 
