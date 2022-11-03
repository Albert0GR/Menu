package ventanas;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class desayuno_opciones{
    static  String[] menu_alimentos ={"Bebidas","Pan","Fruta","Comida"};
    static  String[] bebidas ={"Cerveza","Agua","Atole","Leche"};
    static  String[] pan ={"telera","bolillo","Sandwich","Tostado"};
    static  String[] fruta ={"sandia","mango","melon","Manzana"};
    static  String[] comida ={"huevo","Arroz","frijo","hot dog","atun"};
    static  float[] precio_bebidas ={5,10,15,20};
    static  float[] precio_pan ={23, 10.5F,56,26};
    static  float[] precio_fruta ={34, 15.5F,56.6F,43};
    static  float[] precio_comida ={56, 67.5F,87.6F,98,8};
}

class comida_opciones{

    static  String[] menu_alimentos ={"Bebidas","Comida","Postre"};
    static  String[] bebidas ={"Cerveza","Agua","Atole","Leche"};
    static  float[] precio_bebidas ={5,10,15,20};
    static  String[] comida ={"burritos","pozole","pollo","alitas","res"};
    static  float[] precio_comida ={5,10,15,20,56.6F};

    static  String[] postre ={"gelatina","flan","hotcake","pastel","crepa","durazno","tapioca"};
    static  float[] precio_postre ={76,56,5,10,15,20,56.6F};

}
class cena_opciones{

    static  String[] menu_alimentos ={"Bebidas","Comida","Postre"};
    static  String[] bebidas ={"Cerveza","Agua","Atole","Leche"};
    static  float[] precio_bebidas ={5,10,15,20};
    static  String[] comida ={"burritos","pozole","pollo","alitas","res"};
    static  float[] precio_comida ={5,10,15,20,56.6F};

    static  String[] postre ={"gelatina","flan","hotcake","pastel","crepa","durazno","tapioca"};
    static  float[] precio_postre ={76,56,5,10,15,20,56.6F};

}

public class opcionesMaster extends JOptionPane {
    public int opcionesGeneral(String[] s){
        this.setSize(300,100);
        return showOptionDialog(null,"Elige opción","Alimentos",
                JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,s,
                s[0]);
    }
    public int opcionesTipoPrecio(String[] s, float[] p){
        this.setSize(300,100);
        List<String> List = new ArrayList<>();
        for (int i=0;i<s.length;i++) {
            List.add(s[i] + "->" + p[i]);
        }
        String[] arr ;
        arr = new String[ List.size() ];
        List.toArray(arr);
        return alimentos.showOptionDialog(null,arr,"Alimentos",
                JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,s,
                s[0]);
    }

    public String cantidadProductos(){
        this.setSize(300,100);
        //int opc2=JOptionPane.showInputDialog(null,"ingresa cantidad","titulo","int",);
        //return opc2;
        return showInputDialog("INGRESA CANTIDAD");
    }

    public void guardar(usuario[] array, String[] articulo, float[] precio, int op, int i){

        array[i]=new usuario(articulo[op],
                precio[op],
                5,0);
        array[i].producto=articulo[op];
        array[i].precio= precio[op];
        array[i].cantidad= Integer.parseInt(cantidadProductos());
        array[i].total=(array[i].precio)*(array[i].cantidad);
        System.out.println("cantidad: |"+array[i].cantidad+
                "Producto:"+array[i].producto+"Precio: "+array[i].precio+
                "Total:"+(array[i].precio)*(array[i].cantidad));

    }

}

