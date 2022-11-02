package ventanas;

import javax.swing.*;

class opciones{
        static  int alimentos;
        static  int opciones;
        static  String[] s_alimentos ={"Desayuno","Comida","Cena"};
        static  String[] s_opcion_desayuno ={"Bebidas","Pan","Comida","Fruta"};

        static  String[] s_opcion_comida ={"Bebidas","Comida"};

        static  String[] s_opcion_cena ={"Bebidas","Comida","postre"};

        static  String[] bebidas={"cafe","jugo","licuado","agua"};

        static int[] precio_bebidas={30,45,23,10};

        static  String[] pan={"bolillo","jugo","licuado","agua"};

        static int[] precio_pan={30,45,23,10};


    }

    class desayuno{
    static String[] opciones;

    }


public class Principal {
    public static void main(String[] args) {

        alimentos v1= new alimentos();

        v1.setVisible(true);

        System.out.println("Hello world!");

        System.out.println("selecciono la opcion "+opciones.alimentos);

        switch (opciones.alimentos){
            case 0:
                System.out.println("voy a ejecutar desayuno "+opciones.alimentos);
                pintar_opciones(opciones.alimentos);
                break;
            case 1:
                System.out.println("voy a ejecutar comida "+opciones.alimentos);
                pintar_opciones(opciones.alimentos);
                break;
            case 2:
                System.out.println("voy a ejecutar cena "+opciones.alimentos);
                pintar_opciones(opciones.alimentos);
                break;
            default:
                System.out.println("Opcion invalida");

        }
    }

    public static void pintar_opciones(int a){

        int opc2=alimentos.showOptionDialog(null,"Elige opción",
                "Opciones de "+opciones.s_alimentos[a],
                JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones.s_opcion_desayuno,
                opciones.s_opcion_desayuno[0]);

        switch (opc2){
            case 0:
                opciones.opciones=0;
                pintar_opciones_spec(opciones.opciones);
                break;
            case 1:
                opciones.opciones=1;
                System.out.println("voy a ejecutar cpan"+opciones.opciones);
                pintar_opciones_spec(opciones.alimentos);
                break;
            case 2:
                opciones.opciones=2;
                System.out.println("voy a ejecutar comida "+opciones.opciones);
                pintar_opciones_spec(opciones.alimentos);
                break;
            case 3:
                opciones.opciones=3;
                System.out.println("voy a ejecutar fruta "+opciones.alimentos);
                pintar_opciones_spec(opciones.alimentos);
                break;
            default:
                System.out.println("Opcion invalida");

        }


    }
    public static void pintar_opciones_spec(int opc){
        switch (opc){
            case 0: //desayuno
                int opc2=alimentos.showOptionDialog(null,"Elige opción",
                        "Opciones de "+opciones.s_opcion_desayuno[opc],
                        JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones.s_opcion_desayuno,
                        opciones.s_opcion_desayuno[0]);
                break;
            case 1: //comida
                opc2=alimentos.showOptionDialog(null,"Elige opción",
                        "Opciones de "+opciones.s_opcion_comida[opc],
                        JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones.s_opcion_comida,
                        opciones.s_opcion_comida[0]);
                break;
            default:
                System.out.println("Opcion invalida");

        }


    }
}
