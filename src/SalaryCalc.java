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
public class SalaryCalc implements ActionListener{

    
    JFrame frame = new JFrame("���������� �����������"); //������� ����
    JPanel panelLeft = new JPanel(); //������ � �������
    JPanel panelRight = new JPanel(); //������ � ���������� ������
    JPanel panelBottom = new JPanel(); //������ � �������� 
    public JTextField[] arrTf = new JTextField[10];//������ ��������� �����
    
    
    //�����������
    public SalaryCalc(){
        
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
        addLabel(panelLeft, "�.�.�.:", Color.RED);
        addLabel(panelLeft, "�������� ������ (� ���):", Color.RED);
        addLabel(panelLeft, "������� ���� (����):", Color.RED);
        addLabel(panelLeft, "���������� ������������ ����:", Color.RED);
        addLabel(panelLeft, "��������� ������ (%)*:", Color.RED);
        addLabel(panelLeft, "�.�.�.:", Color.GREEN);
        addLabel(panelLeft, "������ ���������(��� �������):", Color.GREEN);
        addLabel(panelLeft, "������***:", Color.GREEN);
        addLabel(panelLeft, "���������� �����:", Color.GREEN);
        addLabel(panelLeft, "����� � ������:", Color.GREEN);
        
        //��������� ��������� ���� ����� ���� � ���������� �� � ������
        for(int i=0; i<arrTf.length; i++){
            //���������� ������ �� ������ � ������ ��� ���������� ������ � 
            //�������� �����
            arrTf[i] = addTextField(panelRight);
        }
        
        