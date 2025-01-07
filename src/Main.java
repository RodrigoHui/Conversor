import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Convertir convertir = new Convertir();
        Moneda moneda;
        System.out.println("******************************************");
        System.out.println("¿Que conversion desea realizar?");
        System.out.println("1) Dolar a Sol Peruano");
        System.out.println("2) Dolar a Peso Argentino");
        System.out.println("3) Sol Peruano a Dolar");
        System.out.println("4) Sol Peruano a Peso Argentino");
        var accionUsuario = Integer.valueOf(teclado.nextLine());
        System.out.println("¿cuanto deseas convertir?");
        var cantidad = Integer.valueOf(teclado.nextLine());

        switch (accionUsuario){
            case 1:
                moneda = convertir.conversion("USD", "PEN", cantidad);
                System.out.println("El monto de "+cantidad+"USD convertido a PEN es: "+moneda.conversion_result());
                break;
            case 2:
                moneda = convertir.conversion("USD", "ARS", cantidad);
                System.out.println("El monto en "+cantidad+"USD convertido a ARS es: "+moneda.conversion_result());
                break;
            case 3:
                moneda = convertir.conversion("PEN", "USD", cantidad);
                System.out.println("El monto en "+cantidad+"PEN convertido a USD es: "+moneda.conversion_result());
                break;
            case 4:
                moneda = convertir.conversion("PEN", "ARS", cantidad);
                System.out.println("El monto en "+cantidad+"PEN convertido ARS es: "+moneda.conversion_result());
                break;
            default:
                break;
        }
        System.out.println("******************************************");
    }
}