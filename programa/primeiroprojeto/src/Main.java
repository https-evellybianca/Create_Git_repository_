public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.5;
        //Média calculada pelas 3 notas de Paulo, Jeck e selen
        double media = (9.8 + 6.3 +8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun maverick
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media /2);
        System.out.println(classificacao);

    }
}