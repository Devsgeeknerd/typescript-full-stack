package br.com.devsgeeknerd.zoologico.classes;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    public Cachorro(String nome, String especie, int idade) {
        super(nome, idade, especie);
    }

    public Cachorro(String nome, int idade) {
        super(nome, idade, "Cachorro");
    }

    @override
    public void emitirBarulho() {
        System.out.println("Latido do cachorro");
    }
}
