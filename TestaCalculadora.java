import java.util.Scanner;

public class TestaCalculadora 
{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {

                System.out.println("Digite um operador para usar: (+, -, *, /) ou digite '.' para sair:");
                String operador = scanner.next();
                
                if (operador.equals(".")) {
                    break;
                }
                
                System.out.println("Digite o primeiro numero:");
                int num1 = scanner.nextInt();
                System.out.println("Digite o segundo numero:");
                int num2 = scanner.nextInt();
                
                Calculadora calculadora = new Calculadora(num1, num2);
                
                int resultado = 0;
                switch (operador) {
                    case "+" -> resultado = calculadora.some();
                    case "-" -> resultado = calculadora.subtraia();
                    case "/" -> resultado = calculadora.divida();
                    case "*" -> resultado = calculadora.multiplique();
                    default -> {
                        System.out.println("Operador invalido.");
                        continue;
                    }
                }
                
                System.out.println("Resultado: " + resultado);
            }
        }
    }
}
