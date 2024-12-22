import strategy.*;
import context.CalculadoraDescuento;

public class Main {
    public static void main(String[] args) {
        double precioOriginal = 100;

        CalculadoraDescuento calculadora = new CalculadoraDescuento(new DescuentoPorPorcentaje());

        System.out.println("Precio con 10% de descuento: " + calculadora.calcular(precioOriginal, 10)); // 90.0

        calculadora.setEstrategia(new DescuentoFijo());
        System.out.println("Precio con descuento fijo de $15: " + calculadora.calcular(precioOriginal, 15)); // 85.0

        calculadora.setEstrategia(new SinDescuento());
        System.out.println("Precio sin descuento: " + calculadora.calcular(precioOriginal, 0)); // 100.0
    }
}
