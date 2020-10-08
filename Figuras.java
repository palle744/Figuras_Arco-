package TazoFiguras;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Figuras extends JPanel {

    private JFrame ventana;
    private Container contenedor;

    public Figuras() {
        ventana = new JFrame("Dibujp icono");
        // definir tamaño de la ventana 
        ventana.setSize(800, 600);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contenedor = ventana.getContentPane();
        contenedor.setSize(800, 600);
        //agregar a la ventana el contenedor 
        contenedor.add(this, BorderLayout.CENTER);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
         //armamos una casita
        g.setColor(Color.red);
        g.drawLine(100, 50, 200, 50);
        g.drawLine(200, 50, 200, 100);
        g.drawLine(100, 50, 100, 100);
        g.drawLine(100, 100, 200, 100);
        
        
        g.setColor(Color.gray);
        g.drawLine(100, 50, 150, 20);
        g.drawLine(200, 50, 150, 20);
     
        //  trazo de rectangulos 
         g.setColor(Color.blue);
     g.drawRect(280, 50, 100, 50);
     g.fillRect(280, 110, 100, 50);
     
     
     // trazo de rectangulos redondeados 
     g.setColor(Color.black);
     g.drawRoundRect(450, 50, 50, 50, 50, 50);
     g.fillRoundRect(450, 110, 100, 50, 20, 20);
     
     //trazar circulo
     g.setColor(Color.yellow);
     g.drawOval(100,200,80,80);
     g.fillOval(100, 290, 50, 50);
     
     
     // trazo de ovalo circunferencia 
     g.setColor(Color.green);
     g.drawOval(280, 200, 80, 40);
     g.fillOval(280, 290, 40, 80);
     
     // triangulo
     g.setColor(Color.pink);
     g.drawLine(450, 300, 550, 300);
      g.drawLine(450, 300, 550, 250);
       g.drawLine(550, 300, 550, 250);
     
       //dibujo
       g.setColor(Color.black);
       g.drawString("Ejemplo de un trazo de figuras basicas ", 200, 400);
       
       // trazo de arcos 
       //figura 1: solo con contorno
 
       g.setColor(Color.MAGENTA);
       g.drawArc(500, 350, 200, 180, 0, 180);
 
      // figura2 relleno
       g.setColor(Color.orange);
       g.fillArc(500 , 400, 200, 180, 0, 180);
       
       
    
    }
    
    
    
    

}
