public class BalancoTrimestral {
    
    public static void main ( String[] args){
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

        int mediaMensal = (gastosJaneiro + gastosFevereiro + gastosMarco) / 3;
        System.out.println("Valor da média mensal = " + mediaMensal);

        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        System.out.println(gastosTrimestre);
    }
}
