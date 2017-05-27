package paquete;

import java.awt.event.*;
import javax.swing.*;

public class grados extends JFrame implements ActionListener {
    operations calcular = new operations();
    int grados=0;
    double result=0;
    JLabel title,t1,t2,t3,t4;
    JTextField c1, total;
    JButton b1,b2,b3,b4;
    public grados(){
        super("Conversión de Grados");
        setLayout(null);
        letreros();
        cajas();
        botones();
    }
    //
    public void letreros(){
        title = new JLabel("OPCIÓN GRADOS");
        title.setBounds(90,5,130,50);
        add(title);
        //
        t1 = new JLabel("Digite el valor del angulo y luego seleccione");
        t1.setBounds(20, 30, 300, 50);
        add(t1);
        t2 = new JLabel("a que desea transformarlo.");
        t2.setBounds(70, 44, 300, 50);
        add(t2);
        t3 = new JLabel("");
        t3.setBounds(10,180, 300, 25);
        add(t3);
        t4 = new JLabel("Grados:");
        t4.setBounds(75,100, 300, 25);
        add(t4);
    }
    //
    public void cajas(){
        c1 = new JTextField("");
        c1.setBounds(130,100,40,25);
        add(c1);
        
        total = new JTextField("0.0");
        total.setBounds(145,180,100,25);
        total.setEnabled(false);
        add(total);
    }
    //
    public void botones(){
        b1 = new JButton("Seno");
        b1.setBounds (5, 140, 90, 30);
        add(b1);
        b1.addActionListener(this);
        
        b2 = new JButton("Coseno");
        b2.setBounds (102, 140, 90, 30);
        add(b2);
        b2.addActionListener(this);
        
        b3 = new JButton("Tangente");
        b3.setBounds (197, 140, 90, 30);
        add(b3);
        b3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            grados=Integer.parseInt(c1.getText());
            if(grados>360 || grados<0){
                JOptionPane.showMessageDialog(null, "¡ERROR!\n\nEl número de grados no es un número valido.\n\n Intente de nuevo.", "No calculable", JOptionPane.ERROR_MESSAGE);
                c1.requestFocus();
            }
            else{
               result=calcular.seno(grados);
               t3.setText("El Seno de " +grados+ " es = ");
               total.setText(""+result);
            }
                       
        }
        if(ae.getSource()==b2){
            grados=Integer.parseInt(c1.getText());
            if(grados>360 || grados<0){
                JOptionPane.showMessageDialog(null, "¡ERROR!\n\nEl número de grados no es un número valido.\n\n Intente de nuevo.", "No calculable", JOptionPane.ERROR_MESSAGE);
                c1.requestFocus();
            }
            else{
               result=calcular.coseno(grados);
               t3.setText("El Coseno de " +grados+ " es = ");
               total.setText(""+result);
            }
                       
        }
        if(ae.getSource()==b3){
            grados=Integer.parseInt(c1.getText());
            if(grados>360 || grados<0){
                JOptionPane.showMessageDialog(null, "¡ERROR!\n\nEl número de grados no es un número valido.\n\n Intente de nuevo.", "No calculable", JOptionPane.ERROR_MESSAGE);
                c1.requestFocus();
            }
            else{
               result=calcular.tangente(grados);
               t3.setText("La Tangente de " +grados+ " es = ");
               total.setText(""+result);
            }
                       
        }
    }
    
}
