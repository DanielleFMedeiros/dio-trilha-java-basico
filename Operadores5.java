public class Operadores5 {
    //OPERADORES RELACIONAIS
    public static void main(String[] args) {
        //strings
        String nomeUm = "GLEYSON";
        String nomeDois = new String("GLEYSON");

        System.out.println(nomeUm.equals(nomeDois));
        
        //numeros
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 == numero2) {//true
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);
    
        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + simNao);
   
        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);
    }

}
