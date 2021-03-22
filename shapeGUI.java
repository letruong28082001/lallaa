package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class shapeGUI implements ActionListener{
	protected JButton circle,rectangle,square,triangle;
	public void shapeGUI(){
		JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();    
        frame.add(panel);
        frame.setVisible(true);
        panel.setLayout(null);
        
        JLabel Hello = new JLabel("Choose");
        Hello.setBounds(30,40,80,25);
        panel.add(Hello);
        
        circle = new JButton("circle");
        circle.setBounds(90,10,70,70);
        panel.add(circle);
        circle.addActionListener(this);

        rectangle = new JButton("rectangle");
        rectangle.setBounds(90,90,70,70);
        panel.add(rectangle);
        rectangle.addActionListener(this);
        
        square = new JButton("square");
        square.setBounds(180,10,70,70);
        panel.add(square);
        square.addActionListener(this);
        
        triangle  = new JButton("triangle");
        triangle.setBounds(180,90,70,70);
        panel.add(triangle);
        triangle.addActionListener(this);

	}
	private Icon ImageIcon(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		shapeGUI rec = new shapeGUI();
		rec.shapeGUI();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == circle) {
			circle rec1=new circle();
			rec1.circle();
		}
		if (e.getSource() == rectangle) {
			rectangle rec1=new rectangle();
			rec1.rectangle();
			 
		}
		if (e.getSource() == square) {
			square rec1=new square();
			rec1.square();
		}
		if (e.getSource() ==  triangle) {
			triangle rec1=new triangle();
			rec1.triangle();
		}
	}
}
