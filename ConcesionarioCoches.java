/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concesionariocoches;
import java.util.concurrent.Semaphore;
/**
 *
 * @author pmigu
 */
public class ConcesionarioCoches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Semáforo con 4 permisos (4 vehículos)
        Semaphore semaforoVehiculos = new Semaphore(4);

        // Creación de los 9 clientes
        for (int i = 1; i <= 9; i++) {
            Cliente cliente = new Cliente("Cliente " + i, semaforoVehiculos);
            cliente.start();
        }
    }
}
