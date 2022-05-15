
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class task1 extends JFrame {
	private JLabel number;
    private JButton button1;
	private JTextField textField;
	private JLabel label1;
	private JLabel label2;
    
public task1(){
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	number = new JLabel("Число: ");
    button1 = new JButton("Нажать");
	
	JPanel buttonsPanel = new JPanel(new FlowLayout()); 
	//buttonsPanel.setPreferredSize(new Dimension(400, 600));
    //Расставляем компоненты по местам
	
    buttonsPanel.add(number, BorderLayout.NORTH); //О размещении компонент поговорим позже

	textField = new JTextField(8);
	buttonsPanel.add(textField, BorderLayout.SOUTH);
	
    buttonsPanel.add(button1);
    add(buttonsPanel, BorderLayout.SOUTH);
	label1 = new JLabel("Привет");
	
	
	button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                    int i = Integer.parseInt(textField.getText());
                    //JOptionPane.showMessageDialog(mainFrame, String.valueOf(i * i), "Squared number", JOptionPane.INFORMATION_MESSAGE);
					if (i > 7) {
						JOptionPane.showMessageDialog(null, "Hello");}    
            }
             
        });
        
        
}

public static void main(String[] args) {
    task1 app = new task1();
    app.setVisible(true);
    app.pack(); //Эта команда подбирает оптимальный размер в зависимости от содержимого окна
  }
}