package ventanas;

import javax.swing.*;

public class Opciones extends JOptionPane{
    public  Opciones(){
        this.setSize(300,100);
        int opc2 =alimentos.showOptionDialog(null,"Elige opción","Opciones",
                JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones.s_opcion_desayuno,
                opciones.s_opcion_desayuno[0]);
        if(opc2==0){opciones.opciones=0;}
        if(opc2==1){opciones.opciones=1;}
        if(opc2==2){opciones.opciones=2;}

    }


}
