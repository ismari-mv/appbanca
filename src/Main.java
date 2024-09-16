import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double saldoDisponible = 10580.46;
        System.out.println("""
                1. Nombre del cliente: Alex Loza Lopez
                2. Tipo de cuenta: Debito
                3.Saldo disponible:""" + saldoDisponible);


        int menuPrincipal = 0;
        while (menuPrincipal != 9) {
            System.out.println("""
                    Bienvenido al menú de opciones:
                    1.Consultar saldo
                    2.Retirar
                    3.Depositar
                    9.Salir
                    """);
            System.out.println("Escribe la transacción que deseas realizar");
            Scanner teclado = new Scanner(System.in);
            menuPrincipal = teclado.nextInt();

            switch (menuPrincipal) {
                case 1:
                    System.out.println("El saldo actualizado es: " + saldoDisponible);
                    break;
                case 2:
                    System.out.println("¿Cuál es el valor que deseas retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (valorARetirar <= saldoDisponible){
                        saldoDisponible= saldoDisponible - valorARetirar;
                    System.out.println("Tu saldo actual es:" + saldoDisponible);
                    } else if (valorARetirar > saldoDisponible) {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a depositar:");
                    double cantidadADepositar = teclado.nextDouble();
                    double saldoTotal = saldoDisponible + cantidadADepositar;
                    System.out.println("Ahora tu saldo actual es:" + saldoTotal);
                    break;
                case 9:
                    System.out.println("Finalizando el programa,¡Gracias por usar nuestros servicios!");
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        }
    }
}