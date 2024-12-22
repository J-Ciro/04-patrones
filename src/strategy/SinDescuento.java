package strategy;

public class SinDescuento implements EstrategiaDescuento {

    @Override
    public double aplicarDescuento(double precio, double descuento) {
        return precio;
    }
}