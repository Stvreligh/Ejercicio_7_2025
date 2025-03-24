package Emmanuel.inicio;

import Emmanuel.util.ReadUtil;
import Emmanuel.vista.Consola;
import Emmanuel.vista.Menu;
import Emmanuel.vista.Ventana;
import org.gerdoc.vista.Ejecutable;

public class Inicio2 {

    public Inicio2(){}


    public static void main(String[] args)
    {
    boolean flag=true;
    int opcion=0;
    Ejecutable ejecutable=null;
        System.out.println("Hola Emmanuel 2");
    while(flag)
    {
        ejecutable=null;
        Menu.principal2();
        opcion=ReadUtil.getInstance().leerInt();
        switch (opcion)
        {
            case 1:
                ejecutable=Consola.getInstance();
                break;
            case 2:
                ejecutable=Ventana.getInstance();
                break;
            case 3:
                flag=false;
                break;
            default:
                Menu.opcionInvalida();
        }
        if(ejecutable !=null)
        {
            ejecutable.run();
        }
    }
    }
}
