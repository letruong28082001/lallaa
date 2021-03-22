package project;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class circle implements ActionListener{
	protected JTextField txtA;
	protected JButton submit;
	protected JPanel panel;
	public void circle() {
		JFrame frame = new JFrame();
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      
         panel = new JPanel();    
 
        frame.add(panel);
        frame.setVisible(true);
        panel.setLayout(null);

        // Creating JLabel
        JLabel EnterA = new JLabel("Nhap A");
        EnterA.setBounds(50,70,80,25);
        panel.add(EnterA);

        
        txtA = new JTextField(20);
        txtA.setBounds(100,70,165,25);
        panel.add(txtA);


  
        
        submit = new JButton("submit");
        submit.setBounds(100,110,80,25);
        panel.add(submit);
        submit.addActionListener(this);
		
	}
	int Area() {
		int a = Integer.parseInt(txtA.getText());
		a=(int) (a*a*3.14);
		return a;
	}
	public static void main(String[] args) {
		circle rec = new circle();
		rec.circle();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == submit) {
			int a=Area();
			JLabel heelo = new JLabel("Dien tich hinh tron ="+a);
			heelo.setBounds(100,140,200,25);
			panel.add(heelo);
			 
		}
	}

}