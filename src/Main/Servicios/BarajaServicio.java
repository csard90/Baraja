
package Main.Servicios;

import Main.Entidades.Baraja;
import Main.Entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BarajaServicio {

    private List<Carta> cartasRepartidas;
    private Scanner sc;

    public BarajaServicio() {
        this.cartasRepartidas = new ArrayList<>();
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }

    public List<Carta> getCartasRepartidas() {
        return cartasRepartidas;
    }

    public void setCartasRepartidas(List<Carta> cartasRepartidas) {
        this.cartasRepartidas = cartasRepartidas;
    }

    @Override
    public String toString() {
        return "BarajaServicio{" + "cartasRepartidas=" + cartasRepartidas + '}';
    }        
    
    public void barajar(Baraja baux){        
        Collections.shuffle(baux.getCartas());
        System.out.println("* SE HA BARAJADO CORRECTAMENTE EL MAZO");
        System.out.println("* ELIJA OPCION 6 PARA VISUALIZARLO");
        System.out.println(" ");
    }
    
    public void siguienteCarta(Baraja baux) {        
        if (baux.getCartas().isEmpty()) {
            System.out.println("* NO HAY MAS CARTAS DISPONIBLES EN LA BARAJA");                    
        } else {
            this.cartasRepartidas.add(baux.getCartas().get(0));
            baux.getCartas().remove(0);
            System.out.println("* SE HA PASADO CORRECTAMENTE LA SIGUIENTE CARTA AL DESCARTE");
        }                       
        System.out.println(" ");
    }
    
    public void cartasDisponibles (Baraja baux){
        System.out.println("* SE PUEDEN REPARTIR " + baux.getCartas().size() + " CARTAS");
        System.out.println(" ");
    }
    
    public void darCartas(Baraja baux) {
        System.out.println("- INDIQUE EL NUMERO DE CARTAS QUE DESEA REPARTIR: ");
        int n = sc.nextInt();        
        if (n <= baux.getCartas().size() && n >= 1) {
            for (int i = 0; i < n; i++) {
                this.cartasRepartidas.add(baux.getCartas().get(0));
                baux.getCartas().remove(0);                
            }
            System.out.println("* SE HAN REPARTIDO " + n + " CARTAS CON EXITO");                                    
        } else if (n < 1){
            System.out.println("*RESPUESTA NO VALIDA, VUELVA A INTENTARLO");
        } else {
            System.out.println("*NO SE PUEDEN REPARTIR " + n + " CARTAS");
            System.out.println("*LA BARAJA SOLO CONTIENE " + baux.getCartas().size() + " CARTAS");
            System.out.println("*VUELVA A INTENTARLO");
        }
        System.out.println(" ");               
    }
    
    public void cartasMonton (Baraja baux) {
        if (cartasRepartidas.isEmpty()) {
            System.out.println("*NO HAY SALIDO NINGUNA CARTA DE LA BARAJA");
        } else {
            System.out.println("- CARTAS QUE HAN SALIDO: ");
            System.out.println(" ");
            for (Carta cartasRepartida : cartasRepartidas) {
                System.out.println("- " + cartasRepartida.getNumero() + " DE " + cartasRepartida.getPalo());
            }
        }               
        System.out.println(" ");
    }
    
    public void mostrarBaraja(Baraja baux) {
        if (baux.getCartas().isEmpty()) {
            System.out.println("*NO QUEDAN MAS CARTAS EN LA BARAJA");            
        } else {
            System.out.println("- CARTAS QUE AUN QUEDAN EN LA BARAJA: ");
            System.out.println(" ");
            for (Carta cartas : baux.getCartas()) {
                System.out.println("- " + cartas.getNumero() + " DE " + cartas.getPalo());
            }
        }
        System.out.println(" ");
    }              
}
