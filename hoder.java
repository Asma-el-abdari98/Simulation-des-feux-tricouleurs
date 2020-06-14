package versionFinal;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class hoder extends JFrame {
  private static final long serialVersionUID = 1L;
  JButton startb ;
  JLabel t1;
  JLabel t2;
  JLabel t3;
  JLabel t4;
  Timer timer;
  Route route;
  feu f1;
  feu f2;
  feu f3;
  feu f4;
  Car car[]=new Car[5];
  Car car1[]=new Car[5];
  Car car2[]=new Car[5];
  Car car3[]=new Car[5];
 
  Car    c1, c2, c3;
  int light =1;
  int iflight=3, w=0, z=0, n=0;
  JMenuBar menubar;
  JMenuItem reglageParametres;

  Ajout_vehivule f;
  JMenuItem R, Q;
  
  public hoder(){
	 
	 
	    startb = new JButton("Simuler");
		  menubar = new JMenuBar();
	    reglageParametres = new JMenuItem("Ajout_Vehicules");
	 
	    t1 = new JLabel();
	    t2 = new JLabel();
	    t3 = new JLabel();
	    t4 = new JLabel();
	    f1 = new feu(3, 1);		//route 1
	    f2 = new feu(1, 4);		//route 4
	    f3 = new feu(1, 2);		//route 2
	    f4 = new feu(3, 3);		//route 3

	    menubar.setBounds(0, 0, 1000, 20);
	    reglageParametres.setBounds(0, 0, 100, 20);

	    reglageParametres.setBackground(new Color(0,0,0,0));
	    menubar.add(reglageParametres);
	    add(menubar);
	    for(int i=0; i<5; i++)
	    {
	      car[i]= new Car(1);
	      car1[i]= new Car(2);
	      car2[i]= new Car(3);
	      car3[i]= new Car(4);
	    }
	    //before
	    cargenerating(4, 4, 4, 4);
    
    route = new Route();
    setLayout(null);
    
    startb.setBounds(410, 535, 100, 20);
    
    f1.setBackground(new Color(1,0,0,0));
    f2.setBackground(new Color(1,0,0,0));
    f3.setBackground(new Color(1,0,0,0));
    f4.setBackground(new Color(1,0,0,0));
    f1.setBounds(0, 20, 1000, 1000);
    f2.setBounds(0, 20, 1000, 1000);
    f3.setBounds(0, 20, 1000, 1000);
    f4.setBounds(0, 20, 1000, 1000);
    t1.setBounds(0, 100, 100, 40);
    route.setBounds(0, 20, 1000, 1000);
    
    add(t1);
    add(f1);
    add(f2);  
    add(f3);  
    add(f4);  
    add(route);
    add(startb);
    
 
    
  
    
    
    event1 ev = new event1();
    reglageParametres.addActionListener(ev);
    event e = new event();
    startb.addActionListener(e);
    

   
}
  public void cargenerating(int n1, int n2, int n3, int n4)
  {
    for(int i=1; i<=n1; i++)
    {
      if (w==0 && z==0 &&  i>1) {
        w=50;
        car[i].w=w;
      }
      else if(w!=0 && z==0)
      {
        z=5;
        car[i].z=z;
      }
      else if(w!=0 && z!=0 && i!=0)
      {
        car[i].w=w;
        car[i].z=z;
      }
      car[i].setBounds(0, 0, 1000, 1000);
      car[i].setBackground(new Color(0,0,0,0));
      add(car[i]).repaint();
    }
    w=0;
    z=0;
    for(int i=1; i<=n2; i++)
    {
      if (w==0 && z==0 &&  i>1) {
        w=50;
        car1[i].w=w;
      }
      else if(w!=0 && z==0)
      {
        z=120;
        car1[i].z=z;
      }
      else if(w!=0 && z!=0)
      {
        car1[i].w=w;
        car1[i].z=z;
      }
      car1[i].setBounds(0, 0, 1000, 1000);
      car1[i].setBackground(new Color(0,0,0,0));
      add(car1[i]).repaint();

    }
    w=0;
    z=0;
    for(int i=1; i<=n3; i++)
    {
      if (w==0 && z==0 &&  i>1) {
        w=60;
        car2[i].w=w;
      }
      else if(w!=0 && z==0)
      {
        z=50;
        car2[i].z=z;
      }
      else if(w!=0 && z!=0 && i!=0)
      {
        car2[i].w=w;
        car2[i].z=z;
      }
      car2[i].setBounds(0, 0, 1000, 1000);
      car2[i].setBackground(new Color(0,0,0,0));
      add(car2[i]).repaint();
      
    }
    w=0;
    z=0;
    for(int i=1; i<=n4; i++)
    {
      if (w==0 && z==0 &&  i>1) {
        w=55;
        car3[i].w=w;
      }
      else if(w!=0 && z==0)
      {
        z=60;
        car3[i].z=z;
      }
      else if(w!=0 && z!=0 && i!=0)
      {
        car3[i].w=w;
        car3[i].z=z;
      }
      car3[i].setBounds(0, 0, 1000, 1000);
      car3[i].setBackground(new Color(0,0,0,0));
      add(car3[i]).repaint();
    }
    w=0;
    z=0;
  }

  public class eventR implements ActionListener{
		public void actionPerformed(ActionEvent ev) {
			 if(ev.getSource()==Q){
				System.exit(0);
			}
	  }}

  
  
  public class event1 implements ActionListener{
	public void actionPerformed(ActionEvent ev) {
    f = new Ajout_vehivule(null);
        
    f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
      f.setSize(400, 400);
      f.setResizable(false);
      f.setLocationRelativeTo(null);
      f.setVisible(true);
      
    cargenerating(2, 0, 1, 2);
    repaint();
	}
  }
  public class event implements ActionListener{
	  public void actionPerformed(ActionEvent e){  
      int count = 100;

      t1.setText(""+count);
      Timeclass tc = new Timeclass(count);
      timer = new Timer(100, tc);
      timer.start();
    }
    public class Timeclass implements ActionListener{
      int counter;
      public Timeclass(int counter){
        this.counter=counter;
      }
      public void actionPerformed(ActionEvent tc){
        counter--;
        for(int i=1; i<=4; i++)
        {
          if(car[i].y==8*110)
          {
            car[i].y=0;
          }
          if(light==1 || car[i].y!=8*14)
          {
            car[i].y+=8;
          }
          if (car1[i].y==8*110) {
            car1[i].y=0;
          }
          if(light==1 || car1[i].y!=8*2){
            car1[i].y+=8;
          }
          if (car2[i].x==8*130) {
            car2[i].x=0;
          }
          if(light==3 || car2[i].x!=8*20)
          {
            car2[i].x+=8;
          }
          if (car3[i].x==8*130) {
            car3[i].x=0;
          }
          
          if(light==3 || car3[i].x!=8*29) {
            car3[i].x+=8;
          }
        }
        
       
        
        repaint();
        if (counter >=0) {
          t1.setText(""+counter);
        }
        else{
          if (light<iflight) {
            light++;
            if (light==2) {
              counter=10;
              changecolor();
            }  
            else{
              counter=100;
              changecolor();
            }
          }
          else if(light==iflight){
            if (light==3) {
              iflight=1;
              light--;
              counter=10;
              changecolor();
            }
            else{
              iflight=3;
              light++;
              counter=10;
              changecolor();
            }
          }
          else if(light>iflight)
          {
            light--;
            counter=100;
            changecolor();
          }
         }
      }
    }
  }
  public void changecolor()
  {
    if (light==1)
    {
      f1.check=3;
      f2.check=1;
      f4.check=3;
      f3.check=1;
      f1.repaint();
      f2.repaint();
      f3.repaint();
      f4.repaint();
    }
    else if(light==2)
    {
      f1.check=2;
      f2.check=2;
      f4.check=2;
      f3.check=2;
      f1.repaint();
      f2.repaint();
      f3.repaint();
      f4.repaint();
    }
    else if(light==3)
    {
      f1.check=1;
      f2.check=3;
      f4.check=1;
      f3.check=3;
      f1.repaint();
      f2.repaint();
      f3.repaint();
      f4.repaint();
    } 
  }
      static public void main(String args[]) {
        hoder window = new hoder();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1000, 1000);
        window.setTitle("Simulation de gestion des feux tri-couleurs");
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
          }
}