package ventanas;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

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
        List<String> List = new ArrayList<String>();
        for (int i=0;i<desayuno_opciones.bebidas.length;i++) {
            List.add(String.valueOf(desayuno_opciones.bebidas[i]) + "->" + desayuno_opciones.precio_bebidas[i]);
        }
        String[] arr ;
        arr = new String[ List.size() ];
        List.toArray(arr);
        int opc2=alimentos.showOptionDialog(null,arr,"Alimentos",
                JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,desayuno_opciones.bebidas,
                desayuno_opciones.bebidas[0]);
        return opc2;
    }

    public String desayunoCantidadBebidas(){
        this.setSize(300,100);
        //int opc2=JOptionPane.showInputDialog(null,"ingresa cantidad","titulo","int",);
        //return opc2;
        String opc= alimentos.showInputDialog("INGRESA CANTIDAD");
        return opc;
    }

    public void mostrar(usuario[] n){
        List<String> List = new ArrayList<String>();
        List.add(String.valueOf(n[0].cantidad)+" "+n[0].producto+" X "+n[0].precio+" = $"+n[0].total);
        List.add(String.valueOf(n[0].cantidad)+" "+n[0].producto+" X "+n[0].precio+" = $"+n[0].total);
        List.add(String.valueOf(n[0].cantidad)+" "+n[0].producto+" X "+n[0].precio+" = $"+n[0].total);
        String[] arr ;
        arr = new String[ List.size() ];
        List.toArray(arr);
        String[] str ={String.valueOf(n[0].cantidad)+" "+n[0].producto+" X "+n[0].precio+" = $"+n[0].total,
                "Pan","Fruta","Comida"};
        showMessageDialog(null, arr,
                "Comprobante", JOptionPane.INFORMATION_MESSAGE, null);
    }
}

