package versionFinal;

import javax.swing.*;

import java.awt.*;

public class Car extends JPanel 
{
       private static final long serialVersionUID = 1L;

       int y=0;

       int x=0;
      int w=0;
      int z=0;
       int choose;
       
       public Car(int choose) {
   		super();
   		this.choose = choose;
   	}
       public void paintComponent(final Graphics g) {
             super.paintComponent(g);
             if(choose==1)
             {
              g.setColor(Color.black);

              g.fillOval(365+w, 90-z+y, 10, 10);

              g.fillOval(390+w, 90-z+y, 10, 10);

              g.fillOval(365+w, 115-z+y, 10, 10);       

              g.fillOval(390+w, 115-z+y, 10, 10);

              g.setColor(new Color(201,201,201));

              g.fillRect(370+w, 83-z+y, 25, 50);

              g.setColor(Color.black);

              g.drawRect(375+w, 95-z+y, 12, 25);

             }
             else if(choose==2)

             {

              g.setColor(Color.black);

              g.fillOval(470+w, 620+z-y, 10, 10);

              g.fillOval(495+w, 620+z-y, 10, 10);

              g.fillOval(470+w, 645+z-y, 10, 10);       

              g.fillOval(495+w, 645+z-y, 10, 10);

              g.setColor(new Color(128,64,64));

              g.fillRect(475+w, 610+z-y, 25, 50);

              g.setColor(Color.black);

              g.drawRect(480+w, 625+z-y, 12, 15);

             }

             

         else if (choose==3) {

              g.setColor(Color.black);

              g.fillOval(70-w+x, 430+z, 10, 10);

              g.fillOval(70-w+x, 455+z, 10, 10);

              g.fillOval(95-w+x, 430+z, 10, 10);       

              g.fillOval(95-w+x, 455+z, 10, 10);

              g.setColor(new Color(207,24,189));

              g.fillRect(63-w+x, 435+z, 50, 25);

              g.setColor(Color.black);

              g.drawRect(70-w+x, 440+z, 25, 12);     

             }

           

           else if (choose==4) {

              g.setColor(Color.black);

              g.fillOval(905+w-x, 325+z, 10, 10);

              g.fillOval(905+w-x, 350+z, 10, 10);

              g.fillOval(930+w-x, 325+z, 10, 10);       

              g.fillOval(930+w-x, 350+z, 10, 10);

              g.setColor(new Color(208,217,53));

              g.fillRect(895+w-x, 330+z, 50, 25);

              g.setColor(Color.black);

              g.drawRect(905+w-x, 335+z, 25, 12);     

             }  

      }

}