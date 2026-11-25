package bancomexicano;

public class Cuenta {
    
    // Variable static para que el saldo se comparta y mantenga entre todas las ventanas
    public static double saldo = 0.0;

    // Método para sumar un depósito al saldo
    public static void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    // Método para restar un retiro (devuelve true si hubo fondos suficientes)
    public static boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }
}
