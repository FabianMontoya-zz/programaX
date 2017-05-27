package paquete;

import java.awt.event.*;
import javax.swing.*;

public class entero extends JFrame implements ActionListener  {
    operations calcular = new operations();
    double num=0;
    int result=0;
    JLabel title,t1,t2,t3,t4,t5;
    JTextField c1, total;
    JButton b1;
    public entero(){
        super("Tranformar Decimal a Entero");
        setLayout(null);
        cajas();
        boton();
        letreros();
    }
    //
    public void letreros(){
        title = new JLabel("OPCIÓN ENTERO");
        title.setBounds(90,5,130,50);
        add(title);
        //
        t1 = new JLabel("Digite el valor del número y luego pulse");
        t1.setBounds(35, 30, 300, 50);
        add(t1);
        t2 = new JLabel("el botón Calcular.");
        t2.setBounds(95, 44, 300, 50);
        add(t2);
        t5 = new JLabel("Nota: El sistema transforma double a int.");
        t5.setBounds(17, 64, 300, 50);
        add(t5);
        t3 = new JLabel("El resultado es:");
        t3.setBounds(20,160, 300, 25);
        add(t3);
        t4 = new JLabel("Número:");
        t4.setBounds(65,120, 300, 25);
        add(t4);
    }
    //
    public void cajas(){
        c1 = new JTextField("");
        c1.setBounds(130,120,40,25);
        add(c1);
        
        total = new JTextField("0.0");
        total.setBounds(125,160,100,25);
        total.setEnabled(false);
        add(total);
    }
    //
    public void boton(){
        b1 = new JButton("Calcular");
        b1.setBounds (90, 200, 90, 30);
        add(b1);
        b1.addActionListener(this);
    }
  
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            num=Double.parseDouble(c1.getText());
            result=calcular.redondear(num);
            total.setText(""+result);
        }
    }
    
}
