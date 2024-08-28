import javax.xml.transform.Source;
import java.util.Scanner;

public class ExemploCondicao2 {

    // quero adicionar um deesconto gradativo
    // valor maior que 1000 - 10%
    // valor maior que 2000 - 20%
    // valor maior que 3000 - 30%
    // valor menor igual a 1000 - 0%

    public static void main(String[] args) {

        double valorBruto = 1500;
        double desconto = 0.0;

        //Operadores logicos
        // && e
        // || ou

        Scanner scaner = new Scanner(System.in);
        System.out.println("Informe o valor Bruto: ");
        valorBruto = scaner .nextDouble();

        if (valorBruto > 1000 && valorBruto <= 2000) {
             desconto = valorBruto * 0.1;
        } else if (valorBruto > 2000 && valorBruto <3000) {
             desconto = valorBruto * (20. / 100);
        } else if (valorBruto >= 3000) {
             desconto = valorBruto * (30. / 100);
        }

        System.out.println("Valor Bruto é : " + valorBruto);
        System.out.println("Valor do desconto é " + desconto);

    }



}