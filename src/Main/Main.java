package Main;

import Main.Entidades.Baraja;
import Main.Menu.Menu;
import Main.Servicios.BarajaServicio;

public class Main {
  
    public static void main(String[] args) {
     
        Baraja  b1 = new Baraja();
        BarajaServicio bs = new BarajaServicio();
        
        Menu.menu(b1, bs);
    }

}
