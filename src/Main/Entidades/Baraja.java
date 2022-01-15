package Main.Entidades;

import Main.Enum.Palo;
import java.util.ArrayList;
import java.util.List;

public class Baraja {

    private List<Carta> cartas; 

    public Baraja() {
        this.cartas = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 13; j++) {
                switch(i){
                    case 1:
                        if (j != 8 && j != 9)
                        this.cartas.add(new Carta(j, Palo.ORO));                            
                            break;
                    case 2:
                        if (j != 8 && j != 9)
                        this.cartas.add(new Carta(j, Palo.ESPADA));                            
                            break;
                    case 3:
                        if (j != 8 && j != 9)
                        this.cartas.add(new Carta(j, Palo.COPA));                            
                            break;
                    case 4:
                        if (j != 8 && j != 9)
                        this.cartas.add(new Carta(j, Palo.BASTO));                            
                            break;                        
                }                        
            }
        }
    }

    public Baraja(List<Carta> cartas) {
        this.cartas = new ArrayList<>();
        this.cartas = cartas;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas + '}';
    }

    
    
    

}
