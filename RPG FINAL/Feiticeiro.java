

public class Feiticeiro extends Personagem {

    public Feiticeiro() {
        super("Feiticeiro Sombrio", Caracteristica.NENHUMA, Caracteristica.NENHUMA, 70, 55, 70, 35);
    }

    public void maldicaoNegra(Personagem alvo) {
        int manaRequerida = 25;
        if (getMana() >= manaRequerida) {
            int dano = 15;
            int debuffDefesa = 10;
            System.out.println(getNome() + " lança uma Maldição Negra em " + alvo.getNome() + ", causando " + dano + " de dano e reduzindo sua defesa.");
            alvo.receberDano(dano);
            alvo.reduzirDefesa(debuffDefesa);
            gastarMana(manaRequerida);
        } else {
            System.out.println("Mana insuficiente para usar Maldição Negra. Atacando normalmente.");
            alvo.receberDano(10);
        }
    }
}
