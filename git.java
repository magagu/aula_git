package aulas.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class git extends JPanel{
		JLabel lb1, lb_img1, lb_img2, lb_img3, lbinfo1,lbinfo2,lbinfo3;
		JButton bt1, bt2, bt3; 
		ImageIcon img1,img2,img3;
	public git(){
		inicializador_de_componentes();
		def_eventos();
		
	}
	public void inicializador_de_componentes() {
		setLayout(null);
		lb1 = new JLabel("Qual berimbau é o mais chamativo ?");
		img1 = new ImageIcon("C:\\Users\\arthu\\Desktop\\iloveimg-resized\\berimbau1.jpg");
		img2 = new ImageIcon("C:\\Users\\arthu\\Desktop\\iloveimg-resized\\berimbau2.1.jpg");
		img3 = new ImageIcon("C:\\Users\\arthu\\Desktop\\iloveimg-resized\\berimbau3.jpg");
		lb_img1 = new JLabel(img1);
		lb_img2 = new JLabel(img2);
		lb_img3 = new JLabel(img3);
		bt1 = new JButton ("Envernizado");
		bt2 = new JButton ("Colorido");
		bt3 = new JButton ("Padrão");
		lbinfo1 = new JLabel("1");
		lbinfo2 = new JLabel("2");
		lbinfo3 = new JLabel("3");
		lb1.setBounds(75,15,250,50);
		lb_img1.setBounds(25,75,100,150);
		lb_img2.setBounds(137,75,100,150);
		lb_img3.setBounds(250,75,100,150);
		bt1.setBounds(25,275,100,50);
		bt2.setBounds(137,275,100,50);
		bt3.setBounds(250,275,100,50);
		lbinfo1.setBounds(57,238,35,25);
		lbinfo2.setBounds(169,238,35,25);
		lbinfo3.setBounds(282,238,35,25);
		add(lb1);
		add(lb_img1);
		add(lb_img2);
		add(lb_img3);
		add(bt1);
		add(bt2);
		add(bt3);
		add(lbinfo1);
		add(lbinfo2);
		add(lbinfo3);
		
	}
	public void def_eventos() {
		bt1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"Ótimo");
			}	
		});
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"Perfeito");
			}
		});
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"Padrão 06");
			}
		});
		
	}
	public static void main (String args[]) {
		JFrame frame1 = new JFrame("Berimbau.confecções");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().add(new git()).setBackground(Color.white);;
		frame1.setBounds(500,200,400,400);
		frame1.setVisible(true);
		
	}
}
