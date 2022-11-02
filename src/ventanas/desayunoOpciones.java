package ventanas;

import javax.swing.*;

class desayuno_opciones{
    static  String[] menu_alimentos ={"Bebidas","Pan","Fruta","Comida"};
    static  String[] bebidas ={"Cerveza","Agua","Atole","Leche"};
    static  float[] precio_bebidas ={5,10,15,20};
}

public class desayunoOpciones extends JOptionPane {
    public int desayunoOpciones(){
        this.setSize(300,100);
        int opc1=alimentos.showOptionDialog(null,"Elige opción","Alimentos",
                JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,desayuno_opciones.menu_alimentos,
                desayuno_opciones.menu_alimentos[0]);
        return opc1;
    }
    public int desayunoOpcionesBebidas(){
        this.setSize(300,100);
        int opc2=alimentos.showOptionDialog(null,"Elige opción","Alimentos",
                JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,desayuno_opciones.bebidas,
                desayuno_opciones.bebidas[0]);
        return opc2;
    }
}

