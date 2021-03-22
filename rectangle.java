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

public class rectangle implements ActionListener {
	protected JTextField txtB,txtA;
	protected JButton submit;
	protected JPanel panel;
	public void rectangle() {
		JFrame frame = new JFrame();
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      
        panel = new JPanel();    
 
        frame.add(panel);
        frame.setVisible(true);
        panel.setLayout(null);

        // Creating JLabel
        JLabel EnterA = new JLabel("Nhap A");
        EnterA.setBounds(50,20,80,25);
        panel.add(EnterA);

        
        txtA = new JTextField(20);
        txtA.setBounds(100,20,165,25);
        panel.add(txtA);


        JLabel EnterB = new JLabel("Nhap B");
        EnterB.setBounds(50,50,80,25);
        panel.add(EnterB);
        
        txtB = new JTextField(20);
        txtB.setBounds(100,50,165,25);
        panel.add(txtB);

  
        
        submit = new JButton("submit");
        submit.setBounds(100,80,80,25);
        panel.add(submit);
        submit.addActionListener(this);
         
		
	}
	int Area() {
		int a = Integer.parseInt(txtA.getText());
		int b = Integer.parseInt(txtB.getText());
	    return a*b;
	}
	public static void main(String[] args) {
		rectangle rec = new rectangle();
		rec.rectangle();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == submit) {
			System.out.print("dasdsa");
			int s=Area();
			JLabel heelo = new JLabel("Dien tich hinh chu nhat ="+s);
			heelo.setBounds(100,140,200,25);
			panel.add(heelo);
			 
		}
	}
	 
}
