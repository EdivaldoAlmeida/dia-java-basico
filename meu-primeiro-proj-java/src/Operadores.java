public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "EDIVALDO " + "ALMEIDA";

        System.out.println("Nome completo: " + nomeCompleto);

        String concatenar = "?";
        
        concatenar = 1+8*1+"1";
        System.out.println(concatenar);

        concatenar = 1+8/4+"1"+1+1;
        System.out.println(concatenar);

        concatenar = "1"+1+(1+4);
        System.out.println(concatenar);

        /*Resumindo: O compilador irá realizar os cálculos até aparecer a primeira string.
        Após isso irá interpretar tudo como sendo string. Salvo se houverem cálculos a serem
        feitos dentro dos parênteses, como no último caso.*/
    }
}
