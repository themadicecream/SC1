/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalaryCalc;

//��������� ���������� ��� ������ � ���������� ������, �������, 
//��� �������� ������������ ����
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;

//������� �����, ��������� ��������� ActionListener
//��������� ����� ��� ��������� ������� ������� �� ������
public class SalaryCalcjunior implements ActionListener{

    
    JFrame frame = new JFrame("����������� ������������� ��������"); //������� ����
    JPanel panelLeft = new JPanel(); //������ � �������
    JPanel panelRight = new JPanel(); //������ � ���������� ������
    JPanel panelBottom = new JPanel(); //������ � �������� 
    public JTextField[] arrTf = new JTextField[4];//������ ��������� �����
    
    
    //�����������
    public SalaryCalcjunior(){
        
        //������������� �������� ���������� ��� ������ � �������
        //������ ������������ �� ���������
        panelLeft.setLayout(new BoxLayout(panelLeft, BoxLayout.Y_AXIS));
        //������������  ������ 250 �� 300 ��������
        panelLeft.setPreferredSize(new Dimension(250, 300));
        
        //������������� �������� ���������� ��� ������ � ���������� ������
        //������ ������������ �� ���������
        panelRight.setLayout(new BoxLayout(panelRight, BoxLayout.Y_AXIS));
        //�������������  ������ 130 �� 300 ��������
        panelRight.setPreferredSize(new Dimension(130,300));
        
        //�������� ����� ����� ����� addLabel
        addLabel(panelLeft, "�������� ������ (� ���):", Color.RED);
        addLabel(panelLeft, "������� ���� (����):", Color.RED);
        addLabel(panelLeft, "���������� ������������ ����:", Color.RED);
        addLabel(panelLeft, "������������� ��������:", Color.BLUE);
        
        //��������� ��������� ���� ����� ���� � ���������� �� � ������
        for(int i=0; i<arrTf.length; i++){
            //���������� ������ �� ������ � ������ ��� ���������� ������ � 
            //�������� �����
            arrTf[i] = addTextField(panelRight);
        }
        
        //��������� ������ ������� � ������
        JButton calc = addButton(panelBottom, "������");
        //��������� ��������� �� ������� �������
        calc.addActionListener(this);
        JButton reset = addButton(panelBottom, "�����");
        //��������� ��������� �� ������� �������
        reset.addActionListener(this);
        
        
        //������ ������� ����� �������
        frame.setVisible(true);
        //������������� �������� ��� ������� �� ������� - ���������� ����������
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //������������� ��������� ��������� ������������ ������ ������ (�� ������)
        frame.setLocationRelativeTo(null);
        //������������� ������ �������� ����(400 �� 180)
        frame.setSize(400,180);
        //��������� ����� � ����������� � ������ � ����� ���� ����
        JLabel top = new JLabel("������� ���� �������� ������������� ��� ����������");
        //������������� ������������ ������ � ����� �� ������
        top.setHorizontalAlignment(JLabel.CENTER);
        
        //��������� ������ �� ������� ����
        frame.add(top, BorderLayout.NORTH);
        frame.add(panelLeft, BorderLayout.WEST);
        frame.add(panelRight, BorderLayout.EAST);
        frame.add(panelBottom, BorderLayout.SOUTH);
        frame.setResizable(false); //��������� ��������� �������� �������� ����
        
    }
    
    
    //����� ���������� ��������� �����
    public void addLabel(JComponent container, String name, Color color){
        //������� �������� ����� � ������ name
        JLabel lb = new JLabel(name);
        //������������� ����������� ���������� ������
        lb.setMaximumSize(new Dimension(400,20));
        //������������� ����� ������
        lb.setForeground(color);
        //������������� ������������ �� ������� ����
        lb.setHorizontalAlignment(JLabel.RIGHT);
        //��������� �����
        lb.setBorder(new EtchedBorder());
        //��������� ��������� ����� � ������
        container.add(lb);
    }
    
    //����� ���������� ��������� �����
    public JTextField addTextField(JComponent container){
        //������� ��������� ����
        JTextField tf = new JTextField();
        //������������� ��� ����������� ���������� ������
        tf.setMaximumSize(new Dimension(150,20));
        
        //��������� ��������� ���� �� ������
        container.add(tf);
        //���������� ������ �� ��������� ����
        return tf;
    }
    
    //����� ���������� ������
    public JButton addButton(JComponent container, String name){
        //������� ������
        JButton btn = new JButton(name);
        //������������� ����������� ���������� ������
        btn.setMaximumSize(new Dimension(100,20));
        //����������� �� ����������� �� ������
        btn.setHorizontalAlignment(JButton.CENTER);
        
        //��������� ������ �� ������
        container.add(btn);
        //���������� ������ �� ������
        return btn;
    }
    
    
    //����� ������� ��������
    public void calcSalary() throws Exception{
        double stavka = Double.valueOf(arrTf[0].getText()); //������
        double hours = Double.valueOf(arrTf[1].getText()); //���� ������
        double days = Double.valueOf(arrTf[2].getText()); //��� ������
        double pribil = stavka * hours * days; //������ �������
        arrTf[3].setText(String.format("%.2f", pribil)); //������� ������� � 5-� ��������� ����
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SalaryCalcjunior();
            }
        });
    }

    //����� ��������� ������� ������� �� ������
    @Override
    public void actionPerformed(ActionEvent e) {
        //������ ��� ������, �� ������� ������
        if (e.getActionCommand().equals("������")) {
            try {
                //��������� ������ ��������
               calcSalary();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "��������� ������������ �����");
            }
            
        }else{
            //�������
        	System.exit(0);
            }
        }
        
    }
    

