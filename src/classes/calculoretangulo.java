package classes;

import javax.swing.JOptionPane;

public class calculoretangulo {
    
public void calcularPerimetro(double altura, double base){
    double p=0;

p = (2*altura) + (2*base);  

JOptionPane.showMessageDialog(null, "Valor perímetro: "+p);
}  

public void calcularArea(double altura, double base){
    double area=0;
    
area = base*altura;

JOptionPane.showMessageDialog(null, "Valor área: "+area);
}
}
