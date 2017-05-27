package paquete;

import java.awt.event.*;
import javax.swing.*;

public class raiz extends JFrame implements ActionListener {
    operations calcular = new operations();
    JLabel title,t1,t3;
    JTextField c1,c2,total;
    JButton b1;
    double num=0,raiz=0,result=0;
    
    public raiz(){
        super("Calcular Raiz");
        setLayout(null);
        letreros();
        cajas();
        boton();
    }
    //////////////////////////////////////////////
    public void letreros(){
        title = new JLabel("OPCIÓN RAIZ");
        title.setBounds(80,5,130,50);
        add(title);
        //
        t1 = new JLabel("Digite un número y el valor de la raiz");
        t1.setBounds(25, 30, 300, 50);
        add(t1);
       //
        t3 = new JLabel("=");
        t3.setBounds(120,115, 300, 25);
        add(t3);
       
    }
    //////////////////////////////////////////////
    public void boton(){
        b1 = new JButton("Calcular");
        b1.setBounds (80, 160, 90, 30);
        add(b1);
        b1.addActionListener(this);
    }
    /////////////////////////////////////////////
    public void cajas(){
        c1 = new JTextField("");
        c1.setBounds(40,115,60,25);
        add(c1);
        
        c2 = new JTextField("");
        c2.setBounds(10,90,30,25);
        add(c2);
        
        total = new JTextField("0.0");
        total.setBounds(140,115,100,25);
        total.setEnabled(false);
        add(total);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==b1){
            num=Double.parseDouble(c1.getText());
            raiz=Double.parseDouble(c2.getText());
            
            if(num<0){
                JOptionPane.showMessageDialog(null, "¡ERROR!\n\nEl número dentro de la raiz no puede ser negativo.\n\n Intente de nuevo.", "No calculable", JOptionPane.ERROR_MESSAGE);
                c1.requestFocus();
            }
            else{
            result=calcular.raiz(num,raiz);
            total.setText(""+result);
            }
        }
    }
    
}
