package calculadora;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Testes rápidos
        calc.calcular(2, 3, "+");
        calc.calcular(10, 4, "-");
        calc.calcular(3, 5, "*");
        calc.calcular(8, 2, "/");

        try {
            System.out.println(calc.calcular(8, 0, "/"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calcular(5,5,"x"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
