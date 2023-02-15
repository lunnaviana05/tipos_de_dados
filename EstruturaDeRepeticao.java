public class EstruturaDeRepeticao {

    public static void main(String args[]){

        //Exemplo1
        /*for(int i=0; i<7;i++){
            System.out.println(i);
        }*/


        //atividade1
        /*for(int i=150; i<=300;i++){
            System.out.println(i);
        }*/

        //Atividade2
        /*int soma=0;
        for(int i=1; i<=1000;i++){
            soma=soma + i;
        }
        System.out.println(soma);*/

        //Atividade3
        /*for(int i=3; i<100;i+=3){
            System.out.println(i);
        }*/

        int fatResult = 1;
        for(int fat=0;fat>1;fat--){
            if(fat ==0){
                fatResult =1;
                break;
            }else{
                fatResult = fat * fatResult;
            }
        }
        System.out.println(fatResult);

    }
    
}
