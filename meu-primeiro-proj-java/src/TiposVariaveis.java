public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 33;
        short ano = 2024;
        int cep = 64350000; // Se começar com zero, talvez tenha que utilizar outro tipo
        long cpf = 98734567898L; //Long necessita terminar com L, senão seria interiro
        float pi = 3.14F; //Float necessita terminar com F, senão seria double
        double salario = 2500.55; //O ponto substitui a vírgula (padrão americano)

        short numeroCurto = 1;
        int numNormal = numeroCurto;
        short numeroCurto2 = (short) numNormal; //Tem que fazer cast para transformar valor menos específico para mais específico

        System.out.println();
    }


}
