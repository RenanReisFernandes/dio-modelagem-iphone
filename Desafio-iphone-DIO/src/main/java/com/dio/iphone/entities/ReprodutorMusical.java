package com.dio.iphone.entities;

public class ReprodutorMusical {
	public String tocar() {
        return "Tocou!";
    }
    
    public String pausar() {
       return "Pausou";
    }
    
    public String selecionarMusica(String musica) {
        this.selecionarMusica(musica);
        return "Selecionou";
    }

}
