package Main.Menu;

import Main.Entidades.Baraja;
import Main.Servicios.BarajaServicio;
import java.util.Scanner;

public class Menu {
    
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public static void menu(Baraja baux, BarajaServicio bsaux) {
        
        int opcion;
        String resp = "NO";
                
        do {
            do {
                System.out.println("- INGRESE EL NUMERO DE OPCION QUE DESEA ELEGIR: ");
                System.out.println(" ");
                System.out.println("1-BARAJAR");
                System.out.println("2-PASAR LA SIGUIENTE CARTA DE LA BARAJA AL DESCARTE");
                System.out.println("3-CONOCER LA CANTIDAD DE CARTAS DISPONIBLES EN LA BARAJA");
                System.out.println("4-PASAR UNA CANTIDAD DE CARTAS AL DESCARTE");
                System.out.println("5-VER LAS CARTAS CONTENIDAS EN EL DESCARTE");
                System.out.println("6-VER LAS CARTAS CONTENIDAS EN LA BARAJA");
                System.out.println("7-SALIR");
                opcion = sc.nextInt();
                System.out.println(" ");
                if (opcion < 1 || opcion > 7) {
                    System.out.println("*OPCION NO VALIDA");
                    System.out.println(" ");
                }
            } while(opcion < 1 || opcion > 7);

            switch (opcion) {
                case 1:
                    bsaux.barajar(baux);
                    break;
                case 2:
                    bsaux.siguienteCarta(baux);
                    break;
                case 3:
                    bsaux.cartasDisponibles(baux);
                    break;
                case 4:
                    bsaux.darCartas(baux);
                    break;
                case 5:
                    bsaux.cartasMonton(baux);
                    break;
                case 6:
                    bsaux.mostrarBaraja(baux);
                    break;
                case 7:
                    do {
                        System.out.println("- ESTA SEGURO QUE DESEA SALIR? (SI / NO)");
                        resp = sc.next();
                        if (!resp.equalsIgnoreCase("si") && !resp.equalsIgnoreCase("no")){
                            System.out.println("*RESPUESTA NO VALIDA");
                            System.out.println(" ");
                        }
                    } while (!resp.equalsIgnoreCase("SI") && !resp.equalsIgnoreCase("NO"));
                    break;
            }
            System.out.println(" ");
        } while (opcion != 7 || !resp.equalsIgnoreCase("SI"));
        
        System.out.println("*HA SALIDO DEL SISTEMA CORRECTAMENTE");
        System.out.println(" ");
    }    
}
