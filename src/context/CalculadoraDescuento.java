package context;

import strategy.EstrategiaDescuento;

// Clase que utiliza una estrategia para calcular descuentos
public class CalculadoraDescuento {
    private EstrategiaDescuento estrategia;

    // Constructor para inicializar con una estrategia
    public CalculadoraDescuento(EstrategiaDescuento estrategia) {
        this.estrategia = estrategia;
    }

    // Metodo para cambiar la estrategia en tiempo de ejecución
    public void setEstrategia(EstrategiaDescuento estrategia) {
        this.estrategia = estrategia;
    }

    // Metodo que delega el cálculo del descuento a la estrategia actual
    public double calcular(double precio, double descuento) {
        return estrategia.aplicarDescuento(precio, descuento);
    }
}
