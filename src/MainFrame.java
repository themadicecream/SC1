package SalaryCalc;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame {
	// ������� ���� ������������:
	static JPanel panel = new JPanel();
	//JPanel panel2 = new JPanel();
	// ������� ������ ��� ������ ������ ������������:
	JButton byxgalterButton = new JButton("���������");
	static JButton rabot9gaButton = new JButton("��������");
	JButton exitButton = new JButton("�����");
	JLabel label=new JLabel("�������� ������������:"); //������� � 1
	
	MainFrame() {
		super("����������� ������� ���������� �����");
		// ���������� ��������� ��� �������� ����:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null); //���������� �� �������� ������ ����� frame 

		// ��������� �������� ���� � ������������ ���������:
		  setSize(250, 125); 
		  panel.setBackground(new Color(255,255,255));   
		  panel.setLayout(new FlowLayout()); 
		  exitButton.setBackground(new Color(255,190,210)); 
		
          panel.add(label);
          panel.add(byxgalterButton); 
          panel.add(rabot9gaButton);
          panel.add(exitButton);
          add(panel);
          
          byxgalterButton.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent ae) {
                          new SalaryCalc();
                      }
                  });
          rabot9gaButton.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent ae) {
                  new SalaryCalcjunior();
              }
          });
			

	exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				}
		});
	}
	public static void main(String[] args) {
		// ������� ������ ������ Counter (������������):
	MainFrame rgr = new MainFrame();
		// ��������� ���� ������������:
		rgr.setVisible(true);
	}
}