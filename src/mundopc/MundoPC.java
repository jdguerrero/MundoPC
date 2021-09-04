package mundopc;

import com.mu.mundopc.*;

public class MundoPC {

    public static void main(String[] args) {

        Monitor monitorHP = new Monitor("HP",19);

        Teclado tecladoHP = new Teclado("Bluetooth","HP");

        Raton ratonHP = new Raton("USB","HP");

        Computadora computadoraHP = new Computadora("PC HP", monitorHP,tecladoHP,ratonHP);


        Monitor monitorLenovo = new Monitor("Lenovo",21);

        Teclado tecladoLenovo = new Teclado("Bluetooth","Lenovo");

        Raton ratonLenovo = new Raton("USB","Lenovo");

        Computadora computadoraLenovo = new Computadora("PC Lenovo", monitorLenovo,tecladoLenovo,ratonHP);

        Orden orden1 = new Orden();

        orden1.agregarComputadora(computadoraHP);

        orden1.agregarComputadora(computadoraLenovo);

        orden1.mostrarOrden();

    }

}
