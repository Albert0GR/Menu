package ventanas;

class data{
    int opc=0;
}
class usuario{
    String producto="";
    float precio=0;
    int cantidad=0;
    float total=0;

    public usuario(String producto, float precio, int cantidad,float total) {

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
                                5,0);
                        array_usuario[op].producto=desayuno_opciones.bebidas[op];
                        array_usuario[op].precio= desayuno_opciones.precio_bebidas[op];
                        int cant =Integer.parseInt(o1.desayunoCantidadBebidas());
                        array_usuario[op].cantidad=cant;
                        array_usuario[op].total=(array_usuario[op].precio)*(array_usuario[op].cantidad);
                        System.out.println("cantidad:"+array_usuario[op].cantidad+
                                "producto:"+array_usuario[op].producto+"precio:"+array_usuario[op].precio+
                                "total:"+(array_usuario[op].precio)*(array_usuario[op].cantidad));
                        break;
                    default:
                }

                break;
            default:
                System.out.println("valor invalido");
        }



        desayunoOpciones o1=new desayunoOpciones();
        o1.mostrar(array_usuario);

    }


}
