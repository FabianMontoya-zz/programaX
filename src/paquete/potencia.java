package paquete;
import java.awt.event.*;
import javax.swing.*;
public class potencia extends JFrame implements ActionListener {
    operations calcular = new operations();
    JLabel title,t1,t2,t3;
    JTextField c1,c2,total;
    JButton b1;
    double num=0,pot=0,result=0;
    /////////////////////////////////////////////
    public potencia(){
        super("Calcular Potencia");
        setLayout(null);
        letreros();
        cajas();
        boton();
    }
    //////////////////////////////////////////////
    public void letreros(){
        title = new JLabel("OPCIÓN POTENCIA");
        title.setBounds(80,5,130,50);
        add(title);
        //
        t1 = new JLabel("Digite un número y el valor por el cual");
        t1.setBounds(20, 30, 300, 50);
        add(t1);
        t2 = new JLabel("desea elevarlo");
        t2.setBounds(90, 44, 300, 50);
        add(t2);
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
        c1.setBounds(10,115,60,25);
        add(c1);
        
        c2 = new JTextField("");
        c2.setBounds(60,90,50,25);
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
            pot=Double.parseDouble(c2.getText());
            result=calcular.elevar(num,pot);
            total.setText(""+result);
        }
    }
    
}
