package strategy;

public class DescuentoFijo implements EstrategiaDescuento {

    @Override
    public double aplicarDescuento(double precio, double descuento) {
        return precio - descuento;
    }
}