package localidad;

/**
 * @author Cristina Gómez Campos
 */

import java.util.Scanner;

public class Localidad {
    final static String PREFIJO_ESPAÑA = "+34";
    private int numHabitantes;
    private String localidad;

    public int getHabitantes() {
        return this.numHabitantes;
    }

    public void setHabitantes(int habitantes) {
        this.numHabitantes = numHabitantes;
    }

    public String getLocalidad() {
        return this.localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }


    public Localidad() {

    }


    public Localidad(Scanner sc) {
        System.out.println("Localidad: ");
        this.localidad = sc.nextLine();

        System.out.println("Número de habitantes: ");
        this.numHabitantes = sc.nextInt();
        sc.nextLine();
    }
}
