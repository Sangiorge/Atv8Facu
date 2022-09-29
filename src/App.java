import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Requisito 1: Perguntar quanto a pessoa ganha por hora
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto você recebe por hora? ");
        double hora = sc.nextDouble();

        // Requisito 2: Perguntar quantas horas a pessoa trabalhar por dia e quantos
        // dias ela trabalha no mês
        System.out.println("E quantas horas você trabalha por dia? ");
        double horaTrabalhada = sc.nextDouble();
        System.out.println("Você trabalha quantos dias no mês? ");
        double diaTrabalhado = sc.nextDouble();
        sc.close();

        // Requisito 3: Calcule o salario no final do mes
        double dia = hora * horaTrabalhada;
        double salario = dia * diaTrabalhado;

        // Requisito 3: Imprimir o salario total no mes
        System.out.print("O seu salario no final do mês será: " + salario);

    }
}
