package versionFinal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

import versionFinal.hoder.event.Timeclass;


public class Ajout_vehivule extends JFrame implements ActionListener{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
JPanel P1 = new JPanel();
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel ps1 = new JPanel();
	JPanel ps2 = new JPanel();
	JPanel ps3 = new JPanel();
	JPanel ps12 = new JPanel();
	JPanel ps22= new JPanel();
	JPanel ps32= new JPanel();
	JPanel ps13 = new JPanel();
	JPanel ps23= new JPanel();
	JPanel ps33= new JPanel();
	JPanel ps14 = new JPanel();
	JPanel ps24= new JPanel();
	JPanel ps34= new JPanel();
	JPanel pd1= new JPanel();
	JPanel pd2 = new JPanel();
	JPanel pd3= new JPanel();
	JPanel pd4= new JPanel();
	
	JPanel panelB1 = new JPanel();
	JPanel panelB2 = new JPanel();
	
	
	JLabel lb11= new JLabel("Route1");
	JLabel lb12= new JLabel("Route2");
	JLabel lb13 =new JLabel("Route3");
	JLabel lb14= new JLabel("Route4");
	
	JButton Quitter = new JButton("Quitter");
	JButton Simuler = new JButton("Valider");
	
	
	JLabel lb2= new JLabel();

	JLabel lb3= new JLabel();
	JLabel lb4= new JLabel();
	JLabel lb5= new JLabel();
	
	
	String[] elements2 = { "0 voiture", "1 voiture", "2 voiture", "3 voiture", "4 voiture"};

	
	JComboBox t1= new JComboBox(elements2);
	JComboBox t2= new JComboBox(elements2);
	JComboBox t3= new JComboBox(elements2);
	JComboBox t4= new JComboBox(elements2);


	
	
	
	
	
	
	
	
	int nbreVRoute1=4, nbreVRoute2, nbreVRoute3, nbreVRoute4;
	float v1, v2, v3, v4;
	
	JPanel panelCentral = new JPanel();
//	String [] slabelVitesse     = {"Vitesse", "Vitesse", "Vitesse", "Vitesse"};
	/*JPanel panelVitesse1 = new JPanel();
      JPanel panelVitesse2 = new JPanel();
	JPanel panelVitesse3 = new JPanel();
	JPanel panelVitesse4 = new JPanel();*/

	//JLabel [] labelVitesse1= new JLabel[slabelVitesse.length];
	JLabel labelVitesse1 = new JLabel("Vitesse");
	JLabel labelVitesse2 = new JLabel("Vitesse");
	JLabel labelVitesse3 = new JLabel("Vitesse");
	JLabel labelVitesse4 = new JLabel("Vitesse");
	
	JLabel labelCentral= new JLabel("Simulation");

	
	JPanel panelPrincipal = new JPanel();
	JPanel panelPrincipal2 = new JPanel();
	
	JPanel panelRoute1 = new JPanel();
	JPanel panelRoute2 = new JPanel();
	JPanel panelRoute3 = new JPanel();
	JPanel panelRoute4 = new JPanel();

	//JPanel panelTimeVert1 = new JPanel();
	/*JPanel panelTimeVert2 = new JPanel();
	JPanel panelTimeVert3 = new JPanel();
	JPanel panelTimeVert4 = new JPanel();*/


	/*JPanel panelTimeRouge1 = new JPanel();
	JPanel panelTimeRouge2 = new JPanel();
	JPanel panelTimeRouge3 = new JPanel();
	JPanel panelTimeRouge4 = new JPanel();*/
	
	JPanel panelNbreVehicules1 = new JPanel();
	JPanel panelNbreVehicules2 = new JPanel();
	JPanel panelNbreVehicules3 = new JPanel();
	JPanel panelNbreVehicules4 = new JPanel();
	
	JLabel labelRoute1= new JLabel("Route1");
	JLabel labelRoute2= new JLabel("Route2");
	JLabel labelRoute3 =new JLabel("Route3");
	JLabel labelRoute4= new JLabel("Route4");

	JLabel labelTimeVert1= new JLabel("time");
	JLabel labelTimeVert2= new JLabel("time");
	JLabel labelTimeVert3= new JLabel("time");
	JLabel labelTimeVert4= new JLabel("time");

	JLabel labelTimeRouge1= new JLabel("time");
	JLabel labelTimeRouge2= new JLabel("time");
	JLabel labelTimeRouge3= new JLabel("time");
	JLabel labelTimeRouge4= new JLabel("time");
	
	JLabel labelNbreDeVehicule1= new JLabel("nombre de vehicules");
	JLabel labelNbreDeVehicule2= new JLabel("nombre de vehicules");
	JLabel labelNbreDeVehicule3= new JLabel("nombre de vehicules");
	JLabel labelNbreDeVehicule4= new JLabel("nombre de vehicules");
	
	String[] elements1 = { "0","1", "2", "3", "4"};

	JComboBox<String> choixNbreVehicule1= new JComboBox<>(elements1);
	JComboBox<String> choixNbreVehicule2= new JComboBox<>(elements1);
	JComboBox<String> choixNbreVehicule3= new JComboBox<>(elements1);
	JComboBox<String> choixNbreVehicule4= new JComboBox<>(elements1);
	
	JTextField Vitesse1 = new JTextField(5);
	JTextField Vitesse2 = new JTextField(5);
	JTextField Vitesse3 = new JTextField(5);
	JTextField Vitesse4 = new JTextField(5);

	JTextField timeVert1= new JTextField(5);
	JTextField timeVert2= new JTextField(5);
	JTextField timeVert3= new JTextField(5);
	JTextField timeVert4= new JTextField(5);
	
	JTextField timeRouge1= new JTextField(5);
	JTextField timeRouge2= new JTextField(5);
	JTextField timeRouge3= new JTextField(5);
	JTextField timeRouge4= new JTextField(5);
	
	public Ajout_vehivule(hoder hoder) {
		super("Ajouter Vehicule");
		/*add(panelPrincipal, BorderLayout.CENTER);
		add(panelPrincipal2, BorderLayout.SOUTH);
		panelPrincipal.setLayout(null);
		//panelPrincipal2.setLayout(new BoxLayout(panelPrincipal2,BoxLayout.X_AXIS));
		panelPrincipal2.setLayout(new FlowLayout());
		Quitter.addActionListener(this);
		Simuler.addActionListener(this);
		panelB1.add(Quitter);
		panelB2.add(Simuler);
		
		panelPrincipal2.add(panelB1);
		panelPrincipal2.add(panelB2);

		panelCentral.add(labelCentral, "center");
		Font font = new Font("Arial",Font.BOLD,18);
		labelCentral.setFont(font);
		
		panelCentral.setBounds(190, 195, 120, 40);
		panelCentral.setBackground(new Color(51, 187, 198));
		//panelCentral.setBackground(Color.LIGHT_GRAY);
		
		panelRoute1.setBounds(5, 5, 190, 190);
		panelRoute2.setBounds(290, 5, 190, 190);
		panelRoute3.setBounds(5, 255, 190, 190);
		panelRoute4.setBounds(290, 255, 190, 190);
		
		panelRoute1.setLayout(new BoxLayout(panelRoute1,BoxLayout.Y_AXIS));
		panelRoute2.setLayout(new BoxLayout(panelRoute2,BoxLayout.Y_AXIS));
		panelRoute3.setLayout(new BoxLayout(panelRoute3,BoxLayout.Y_AXIS));
		panelRoute4.setLayout(new BoxLayout(panelRoute4,BoxLayout.Y_AXIS));

		/*panelVitesse1.add(labelVitesse1);
		panelVitesse2.add(labelVitesse2);
		panelVitesse3.add(labelVitesse3);
		panelVitesse4.add(labelVitesse4);
		
		panelVitesse1.add(Vitesse1);
		panelVitesse2.add(Vitesse2);
		panelVitesse3.add(Vitesse3);
		panelVitesse4.add(Vitesse4);*/
		
		panelPrincipal.add(panelRoute1);
		panelPrincipal.add(panelRoute2);
		panelPrincipal.add(panelRoute3);
		panelPrincipal.add(panelRoute4);
		panelPrincipal.add(panelCentral);

		panelNbreVehicules1.add(labelNbreDeVehicule1);
		panelNbreVehicules2.add(labelNbreDeVehicule2);
		panelNbreVehicules3.add(labelNbreDeVehicule3);
		panelNbreVehicules4.add(labelNbreDeVehicule4);
		
		panelNbreVehicules1.add(choixNbreVehicule1);
		panelNbreVehicules2.add(choixNbreVehicule2);
		panelNbreVehicules3.add(choixNbreVehicule3);
		panelNbreVehicules4.add(choixNbreVehicule4);
		
		//panelTimeVert1.add(labelTimeVert1);
		//panelTimeVert1.add(timeVert1);
		//panelTimeRouge1.add(labelTimeRouge1);
	//	panelTimeRouge1.add(timeRouge1);
		
	/*	panelTimeVert2.add(labelTimeVert2);
		panelTimeVert2.add(timeVert2);
		panelTimeRouge2.add(labelTimeRouge2);
		panelTimeRouge2.add(timeRouge2);
		
		panelTimeVert3.add(labelTimeVert3);
		panelTimeVert3.add(timeVert3);
		panelTimeRouge3.add(labelTimeRouge3);
		panelTimeRouge3.add(timeRouge3);

		panelTimeVert4.add(labelTimeVert4);
		panelTimeVert4.add(timeVert4);
		panelTimeRouge4.add(labelTimeRouge4);
		panelTimeRouge4.add(timeRouge4);
		
		panelRoute1.add(labelRoute1);
		panelRoute1.add(panelNbreVehicules1);
	//	panelRoute1.add(panelVitesse1);
	//	panelRoute1.add(panelTimeVert1);
	//	panelRoute1.add(panelTimeRouge1);
		
		panelRoute2.add(labelRoute2);
		panelRoute2.add(panelNbreVehicules2);
	//	panelRoute2.add(panelVitesse2);
	//	panelRoute2.add(panelTimeVert2);
//		panelRoute2.add(panelTimeRouge2);
		
		panelRoute3.add(labelRoute3);
		panelRoute3.add(panelNbreVehicules3);
	//	panelRoute3.add(panelVitesse3);
		//panelRoute3.add(panelTimeVert3);
	//	panelRoute3.add(panelTimeRouge3);
		
		panelRoute4.add(labelRoute4);
		panelRoute4.add(panelNbreVehicules4);
		//panelRoute4.add(panelVitesse4);
//		panelRoute4.add(panelTimeVert4);
	//	panelRoute4.add(panelTimeRouge4);
		
		labelTimeVert1.setForeground(new Color(5, 158, 51));
		labelTimeVert2.setForeground(new Color(5, 158, 51));
		labelTimeVert3.setForeground(new Color(5, 158, 51));
		labelTimeVert4.setForeground(new Color(5, 158, 51));
		
		labelTimeRouge1.setForeground(new Color(249, 0, 0));
		labelTimeRouge2.setForeground(new Color(249, 0, 0));
		labelTimeRouge3.setForeground(new Color(249, 0, 0));
		labelTimeRouge4.setForeground(new Color(249, 0, 0));
				
		timeVert2.setEditable(false);
		timeVert3.setEditable(false);
		timeVert4.setEditable(false);
		timeRouge2.setEditable(false);
		timeRouge3.setEditable(false);
		timeRouge4.setEditable(false);*/
		
		
		

		
		add(P1, BorderLayout.CENTER);
			P1.setLayout(new GridLayout(2,2));
			p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));
			p2.setLayout(new BoxLayout(p2,BoxLayout.Y_AXIS));
			p3.setLayout(new BoxLayout(p3,BoxLayout.Y_AXIS));
			p4.setLayout(new BoxLayout(p4,BoxLayout.Y_AXIS));
		
			 P1.add(p1);
			 P1.add(p2);
			 P1.add(p3);
			 P1.add(p4);
			 
			 
			 Quitter.addActionListener(this);
				Simuler.addActionListener(this);
				panelB1.add(Quitter);
				panelB2.add(Simuler);
			 
				
			 
			 lb2.setIcon(new ImageIcon("car01.png"));
			 lb3.setIcon(new ImageIcon("car01.png"));
			 lb4.setIcon(new ImageIcon("car01.png"));
			 lb5.setIcon(new ImageIcon("car01.png"));
		
			 
			 p1.add(lb11);//route1
			 
			 ps1.add(lb2);//voiture et son nbr
			 ps1.add(t1);
			 p1.add(ps1);
			 
		
			 p1.add(ps2);
		
			 p1.add(ps3);
			 
			 

			 p1.add(pd1);
			 
			 p2.add(lb12);

			 ps12.add(lb3);//voiture et son nbr
			 ps12.add(t2);
			 p2.add(ps12);
			 
			
			 p2.add(ps22);
		
			 p2.add(ps32);
			 
		
			 p2.add(pd2);

			 p3.add(lb13);
			 
			 ps13.add(lb4);//voiture et son nbr
			 ps13.add(t3);
			 p3.add(ps13);
			 
		
			 p3.add(ps23);
			 
		
			 p3.add(ps33);
			 
		
			 pd3.add(panelB2);
			 p3.add(pd3);
			 
			 p4.add(lb14);
			 
			 ps14.add(lb5);//voiture et son nbr
			 ps14.add(t4);
			 p4.add(ps14);
			 
		
			 p4.add(ps24);
			 
			
			 p4.add(ps34);
			 
		
			 pd4.add(panelB1);
			 p4.add(pd4);
			 
			 
			 p1.setBackground(new Color(196,196,255));
			 p2.setBackground(new Color(196,196,255));
			 p3.setBackground(new Color(196,196,255));
			 p4.setBackground(new Color(196,196,255));
			 
			 ps1.setBackground(new Color(220,220,255));
			 ps2.setBackground(new Color(220,220,255));
	         ps3.setBackground(new Color(220,220,255));
	         
	         ps12.setBackground(new Color(220,220,255));
			 ps22.setBackground(new Color(220,220,255));
	         ps32.setBackground(new Color(220,220,255));
	         
	         ps13.setBackground(new Color(220,220,255));
			 ps23.setBackground(new Color(220,220,255));
	         ps33.setBackground(new Color(220,220,255));
	         
	         ps14.setBackground(new Color(220,220,255));
			 ps24.setBackground(new Color(220,220,255));
	         ps34.setBackground(new Color(220,220,255));
			
	         
	         
		
	
		choixNbreVehicule1.addActionListener(this);
		choixNbreVehicule2.addActionListener(this);
		choixNbreVehicule3.addActionListener(this);
		choixNbreVehicule4.addActionListener(this);
		
		
	}

	public void actionPerformed(ActionEvent e) {
		/*
		float tr1=Float.parseFloat(timeRouge1.getText());
		float tv1=Float.parseFloat(timeVert1.getText());
		float tr2=tv1+to1;
		float tv2=0;
		float to1=tr1-tv1;
		float to2=tr2-tv2;
		float to3=tr1-tv1;
		float to4=tr2-tv2;
		
		timeVert2.setText((""+tv2+""));
		timeVert3.setText((""+tv1+""));
		timeVert4.setText((""+tv2+""));
		
		timeRouge2.setText((""+tr2+""));
		timeRouge3.setText((""+tr1+""));
		timeRouge4.setText((""+tr2+""));
		*/

			
		if(e.getSource()==Quitter){
			System.exit(0);
		}else if(e.getSource()==Simuler){
			 
			
			System.out.println("Route1 : "+nbreVRoute1+"vehicules");
			System.out.println("Route2 : "+nbreVRoute2+"vehicules");
			System.out.println("Route3 : "+nbreVRoute3+"vehicules");
			System.out.println("Route4 : "+nbreVRoute4+"vehicules");
			
			v1=Float.parseFloat(Vitesse1.getText());
			v2=Float.parseFloat(Vitesse2.getText());
			v3=Float.parseFloat(Vitesse3.getText());
			v4=Float.parseFloat(Vitesse4.getText());

		}else if(e.getSource()==choixNbreVehicule1){
			nbreVRoute1=choixNbreVehicule1.getSelectedIndex();
		}else if(e.getSource()==choixNbreVehicule2){
			nbreVRoute2=choixNbreVehicule2.getSelectedIndex();	
		}else if(e.getSource()==choixNbreVehicule3){
			nbreVRoute3=choixNbreVehicule3.getSelectedIndex();			
		}else if(e.getSource()==choixNbreVehicule4){
			nbreVRoute4=choixNbreVehicule4.getSelectedIndex();			
		}
	}

}