/**
 * <p>Clase Paciente</p>
 *
 * @author Cristina Gómez Campos
 * @version v1
 */

public class Paciente {
    /**
     * Nombre del paciente
     */
    String nombre;
    /**
     * Edad del paciente
     */
    int edad;
    /**
     * Array de síntomas
     */
    String[] síntomas;

    /**
     * Constructor
     */
    public Paciente() {
        this.nombre = "Desconocido";
        this.edad = 999;
        this.síntomas = new String[]{"Ninguno"};
    }

    /**
     * Constructor
     *
     * @param nombre   de un paciente
     * @param edad     de un paciente
     * @param síntomas de un paciente
     */
    public Paciente(String nombre, int edad, String[] síntomas) {
        this.nombre = nombre;
        this.edad = edad;
        this.síntomas = síntomas;
    }

    /**
     * Método get para ver el nombre
     *
     * @return nombre del paciente
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo set para asignar nombre
     *
     * @param nombre nuevo del paciente
     */

    public void setNombre(String nombre) {
        if (!nombre.equals(null)) {
            this.nombre = nombre;
        }
    }

    /**
     * Metodo get para ver la edad
     *
     * @return edad del paciente
     */

    public int getEdad() {
        return edad;
    }

    /**
     * Metodo set para asignar edad
     *
     * @param edad del paciente
     */

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo get para ver los sintomas
     *
     * @return sintomas del paciente
     */

    public String[] getSíntomas() {
        return síntomas;
    }

    /**
     * Método set para asignar sintomas
     *
     * @param síntomas del paciente
     */

    public void setSíntomas(String[] síntomas) {
        this.síntomas = síntomas;
    }
}
