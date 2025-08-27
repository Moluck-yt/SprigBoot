package br.com.moluck.screenmacth.calculos;

public class Recomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 1){
            System.out.println("Esta entre os preferidos do momento");
        }else if(classificavel.getClassificacao() >= 2){
            System.out.println("Muito Bem Avaliado");
        }
        else{
            System.out.println("Menos Assistidos");
        }
    }
}
