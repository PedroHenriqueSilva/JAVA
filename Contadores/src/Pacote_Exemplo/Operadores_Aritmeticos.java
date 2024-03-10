package Pacote_Exemplo;
import java.math.*;

public class Operadores_Aritmeticos {
    public static void main(String[] args) {
        //

        double a,b,c;
        a = 2;
        b = -16;
        c = -18;

        double delta = 0;

        delta = (b*b) -4*a*c;

        System.out.printf("O valor do delta e: %.2f\n", delta);

        double x_linha = 0;
        x_linha = (-b + Math.sqrt(delta)) / (2 * a);

        System.out.printf("O valor do x' e: %.0f\n", x_linha);

        double x_duas_linha = 0;
        x_duas_linha = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("O valor do x'' e: %.0f\n", x_duas_linha);
    }
}
