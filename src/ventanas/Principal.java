package ventanas;

class data{
    int opc=0;
}
class usuario{
    String producto="";
    float precio=0;
    int cantidad=0;

    public usuario(String producto, float precio, int cantidad) {
    }
}
public class Principal {

    public static void main(String[] args) {

        alimentos v1= new alimentos();
        usuario array_usuario[] = new usuario[10];
        //array_usuario[1]= new usuario("cerveza",23,5);


        switch (v1.alimentos()){
            case 0://desayuno
                desayunoOpciones o1=new desayunoOpciones();
                //System.out.println("el valor de o1 es:"+o1.desayunoOpciones());
                switch (o1.desayunoOpciones()){
                    case 0://bebidas
                        int op=o1.desayunoOpcionesBebidas();
                        array_usuario[op]=new usuario(desayuno_opciones.bebidas[op],
                                desayuno_opciones.precio_bebidas[op],
                                5);
                        array_usuario[op].producto=desayuno_opciones.bebidas[op];
                        array_usuario[op].precio= desayuno_opciones.precio_bebidas[op];
                        System.out.println("producto:"+array_usuario[op].producto+"precio:"+array_usuario[op].precio);
                        break;
                    default:
                }

                //array_usuario[0].producto= desayuno_opciones.menu_alimentos[0];
                //array_usuario[0].precio= desayuno_opciones.precio[0];
                //System.out.println("producto:"+array_usuario[0].producto+"precio:"+array_usuario[0].precio);
                break;
            default:
                System.out.println("valor invalido");
        }


        //System.out.println("el valor de v1 es:"+v1.alimentos());



    }


}
