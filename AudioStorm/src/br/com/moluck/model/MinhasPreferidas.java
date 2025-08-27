package br.com.moluck.model;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao()>=9){
        System.out.println(audio.getTitulo() + " eh um dos nossos sucessos da plataforma ");
    }else{
            System.out.println(audio.getTitulo() + " eh uma  opcoes low profiles");
        }
    }
}
