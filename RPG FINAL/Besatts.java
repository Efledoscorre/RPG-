

public class Besatts extends Personagem {

    public Besatts() {
        super("Besatt's", Caracteristica.NENHUMA, Caracteristica.NENHUMA, 40, 30, 20, 0);
    }

    public void investidaSombria(Personagem alvo) {
        int dano = 15;
        System.out.println(getNome() + " avança com uma Investida Sombria contra " + alvo.getNome() + ", causando " + dano + " de dano.");
        alvo.receberDano(dano);
    }
}

