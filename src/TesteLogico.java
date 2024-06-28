import java.util.Scanner;

public class TesteLogico {

    public static void main(String[] args){
        //boolean guarda valor lógico(verdadeiro ou falso)
        // || significa "OU"/condição menos restritiva
        // && significa "AND" ou "E"/condição restritiva
        // !! significa "NÃO" ou "NOT"
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o seu salário: ");
        double salario = leitor.nextDouble();
        double novoSalario = 0.0;

        //estrutura condicional (tomada de decição)
        if (salario >= 1000) {
            System.out.println("Seu salário é MAIOR OU IGUAL A que 1000!");
            System.out.println("Seu aumento será de 10%");
            novoSalario = salario * 1.1;
            System.out.printf("Seu novo salário será %s", novoSalario);
        } else {
            System.out.println("Seu salário é MENOR que 1000!");
            novoSalario = salario * 1.2;

        }
        System.out.printf("Seu novo salário será %s.", novoSalario);

    }
}


