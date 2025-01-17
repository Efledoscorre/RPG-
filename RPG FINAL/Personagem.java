


public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int mana;
    protected int forca;
    protected int defesa;
    private Caracteristica vantagem;
    private Caracteristica desvantagem;
    protected RolagemDados rolagemDados;
    protected boolean estaVivo;
    protected int aumentoAtaque; 

    public Personagem(String nome, Caracteristica vantagem, Caracteristica desvantagem, int vida, int mana, int forca, int defesa) {
        this.nome = nome;
        this.vantagem = vantagem;
        this.desvantagem = desvantagem;
        this.vida = vida;
        this.mana = mana;
        this.forca = forca;
        this.defesa = defesa;
        this.rolagemDados = new RolagemDados();
        this.estaVivo = true;
        this.aumentoAtaque = 0; 
    }

    public void atacar(Personagem alvo) {
        int dano = forca + aumentoAtaque; 
        aumentoAtaque = 0; 
        System.out.println(nome + " ataca " + alvo.getNome() + ", causando " + dano + " de dano.");
        alvo.receberDano(dano);
    }

    public void aumentarAtaque(int aumento) {
        this.aumentoAtaque += aumento; 
    }

    public void receberDano(int dano) {
        int danoRecebido = Math.max(dano - defesa, 0); 
        vida -= danoRecebido;
        System.out.println(nome + " recebeu " + danoRecebido + " de dano. Vida restante: " + vida);
        if (vida <= 0) {
            estaVivo = false;
            System.out.println(nome + " foi derrotado.");
        }
    }

    public boolean estaVivo() {
        return estaVivo;
    }

    public void reduzirDefesa(int reducao) {
        defesa -= reducao;
        System.out.println(nome + " teve a defesa reduzida em " + reducao + ". Defesa atual: " + defesa);
    }

    public String getNome() {
        return nome;
    }

    public Caracteristica getVantagem() {
        return vantagem;
    }

    public Caracteristica getDesvantagem() {
        return desvantagem;
    }

    public int getMana() {
        return mana;
    }

    public void gastarMana(int quantidade) {
        mana -= quantidade;
    }

    public void exibirAtributos() {
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Mana: " + mana);
        System.out.println("Força: " + forca);
        System.out.println("Defesa: " + defesa);
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", vida=" + vida +
                ", mana=" + mana +
                ", forca=" + forca +
                ", defesa=" + defesa +
                ", rolagemDados=" + rolagemDados +
                ", estaVivo=" + estaVivo +
                ", aumentoAtaque=" + aumentoAtaque +
                '}';
    }
}
