package ventanas;

import javax.swing.*;

class menu_opciones{
    static  String[] menu_alimentos ={"Desayuno","Comida","Cena"};
}

public class alimentos extends JOptionPane {
    public alimentos(){
        this.setSize(300,100);
               int opc1=alimentos.showOptionDialog(null,"Elige opción","Alimentos",
                JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,menu_opciones.menu_alimentos,
                menu_opciones.menu_alimentos[0]);
        if(opc1==0){opciones.alimentos=0;}
        if(opc1==1){opciones.alimentos=1;}
        if(opc1==2){opciones.alimentos=2;}
    }
}
