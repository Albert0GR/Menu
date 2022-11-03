package ventanas;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class usuario{
    String producto="";
    float precio=0;
    int cantidad=0;
    float total=0;

    int numArticulo=0;

    public usuario(String producto, float precio, int cantidad,float total,int numArticulo) {

    }
}

public class Principal extends  JOptionPane{


    public static void main(String[] args) {
        int i=0;
        alimentos v1= new alimentos();
        usuario array_usuario[] = new usuario[10];
        //array_usuario[1]= new usuario("cerveza",23,5);


        do {
            opcionesMaster d1 = new opcionesMaster();
            switch (v1.alimentos()) {

                case 0://desayuno
                    switch (d1.opcionesGeneral(desayuno_opciones.menu_alimentos)) {
                        case 0://bebidas
                            int op = d1.opcionesTipoPrecio(desayuno_opciones.bebidas, desayuno_opciones.precio_bebidas);
                            d1.guardar(array_usuario, desayuno_opciones.bebidas, desayuno_opciones.precio_bebidas, op, i);
                            break;
                        case 1:
                            op = d1.opcionesTipoPrecio(desayuno_opciones.pan, desayuno_opciones.precio_pan);
                            d1.guardar(array_usuario, desayuno_opciones.pan, desayuno_opciones.precio_pan, op, i);
                            break;
                        case 2:
                            op = d1.opcionesTipoPrecio(desayuno_opciones.fruta, desayuno_opciones.precio_fruta);
                            d1.guardar(array_usuario, desayuno_opciones.fruta, desayuno_opciones.precio_fruta, op, i);
                            break;
                        case 3:
                            op = d1.opcionesTipoPrecio(desayuno_opciones.comida, desayuno_opciones.precio_comida);
                            d1.guardar(array_usuario, desayuno_opciones.comida, desayuno_opciones.precio_comida, op, i);
                            break;
                        default:
                            System.out.println("valor invalido");
                    }

                    break;
                case 1:
                    switch (d1.opcionesGeneral(comida_opciones.menu_alimentos)) {

                        case 0://bebidas
                            int op = d1.opcionesTipoPrecio(comida_opciones.bebidas, comida_opciones.precio_bebidas);
                            d1.guardar(array_usuario, comida_opciones.bebidas, comida_opciones.precio_bebidas, op, i);
                            break;
                        case 1://comida
                            op = d1.opcionesTipoPrecio(comida_opciones.comida, comida_opciones.precio_comida);
                            d1.guardar(array_usuario, comida_opciones.comida, comida_opciones.precio_comida, op, i);
                            break;
                        case 2:
                            op = d1.opcionesTipoPrecio(comida_opciones.postre, comida_opciones.precio_postre);
                            d1.guardar(array_usuario, comida_opciones.postre, comida_opciones.precio_postre, op, i);
                            break;
                        default:
                            System.out.println("valor invalido");
                    }
                case 2:
                    //opcionesMaster d3 = new opcionesMaster();
                    switch (d1.opcionesGeneral(cena_opciones.menu_alimentos)) {

                        case 0://bebidas
                            int op = d1.opcionesTipoPrecio(cena_opciones.bebidas, cena_opciones.precio_bebidas);
                            d1.guardar(array_usuario, cena_opciones.bebidas, cena_opciones.precio_bebidas, op, i);
                            break;
                        case 1://comida
                            op = d1.opcionesTipoPrecio(cena_opciones.comida, cena_opciones.precio_comida);
                            d1.guardar(array_usuario, cena_opciones.comida, cena_opciones.precio_comida, op, i);
                            break;
                        case 2:
                            op = d1.opcionesTipoPrecio(cena_opciones.postre, cena_opciones.precio_postre);
                            d1.guardar(array_usuario, cena_opciones.postre, cena_opciones.precio_postre, op, i);
                            break;
                        default:
                            System.out.println("valor invalido");
                    }
                    break;
                default:
                    System.out.println("valor invalido");

            }


            i++;
        }while (flag()!=1);

        //opcionesMaster o1=new opcionesMaster();
        //o1.mostrar(array_usuario);
        mostrar(array_usuario,i);
        i=0;

    }

    public static int flag(){
        String[] op={"SI","Imprimir comprobante"};
        int opc1=alimentos.showOptionDialog(null,"deseas seguir comprando?","Comprobante",
                JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,op,
                op[0]);
        return opc1;
    }

    public static  void mostrar(usuario[] n,int tope){
        List<String> List = new ArrayList<String>();
        float total=0;
        for(int i=0;i<tope;i++) {
            List.add(String.valueOf(n[i].cantidad) + " " + n[i].producto + " X " + n[i].precio + " = $" + n[i].total);
            total+=n[i].total;
        }
        List.add("por pagar:"+total);
        //List.add(String.valueOf(n[2].cantidad)+" "+n[2].producto+" X "+n[2].precio+" = $"+n[2].total);

        String[] arr ;
        arr = new String[ List.size() ];
        List.toArray(arr);
        String[] str ={String.valueOf(n[0].cantidad)+" "+n[0].producto+" X "+n[0].precio+" = $"+n[0].total,
                "Pan","Fruta","Comida"};
        showMessageDialog(null, arr,
                "Comprobante", JOptionPane.INFORMATION_MESSAGE, null);
    }
}
