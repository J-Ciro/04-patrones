package strategy;

public class DescuentoPorPorcentaje implements EstrategiaDescuento {
    @Override
    public double aplicarDescuento(double precio, double descuento) {
        return precio - (precio * descuento / 100);
    }
}