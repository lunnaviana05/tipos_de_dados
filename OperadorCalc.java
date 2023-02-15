public class OperadorCalc {
    //colete dois números do teclado
    //faça as 5 operações matemáticas
    //double
    //float
    //declare também as váriaveis soma, mult, divisão, resto, subtração:

    public static void mais(String[] bia]) {
        try (scanner entrada = new Scanner(System.in)){
            int numero=0;
            int numero2=0;
            int soma=0;
            int multiplicacao=0;
            float divisao=0;
            double resto=0;
            int subtracao=0;

            System.out.println("Digite um número");
            numero1=entrada.nextInt();

            System.out.println("Digite um número");
            numero=entrada.nextInt();

            soma=número1+numero2;
            System.out.println("A soma dos dois números é" +soma);

            multiplicacao=número1*numero2;
            System.out.println("A soma dos dois números é" +multiplicacao);

            divisao=número1/numero2;
            System.out.println("A soma dos dois números é" +divisao);

            resto=número1%numero2;
            System.out.println("A soma dos dois números é" +resto);

            subtracao=número1-numero2;
            System.out.println("A soma dos dois números é" +subtracao);
        }
    }
}
