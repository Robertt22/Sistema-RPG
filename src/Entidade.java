

public class Entidade {
    public String nome_personagem;
    private double vida_maxima;
    private double vida_atual;
    private double ataque;

    public Entidade(String nome_personagem, double vida_maxima, double vida_atual, double ataque) {
        this.nome_personagem = nome_personagem;
        this.vida_maxima = vida_maxima;
        this.vida_atual = Math.min(vida_atual, vida_maxima);
        this.ataque = ataque;

    }

    public void Status() {

        if(this.GetVidaAtual() > 0) {
            System.out.println("\nNome: " + nome_personagem);
            System.out.println("Vida atual: " + vida_atual);
            System.out.println(" Vida máxima: " + vida_maxima);
            System.out.println("Ataque: " + ataque + "\n");
        }

        else{
            System.out.println("O Personagem morreu!!");
        }
    }

    public double GetVidaMaxima() {
        return vida_maxima;

    }

    public void SetVidaMaxima(double vida_maxima) {
        this.vida_maxima = vida_maxima;


    }

    public double GetVidaAtual() {
        return vida_atual;
    }

    public void SetVidaAtual(double vida_atual) {
        this.vida_atual = Math.max(0,Math.min(vida_atual, vida_maxima));

        if (this.GetVidaAtual() <= 0) {
            System.out.println(this.nome_personagem + ": Morreu");
        }
    }

    public double GetAtaque() {
        return ataque;


    }

    public void SetAtaque(double ataque) {
        this.ataque = ataque;


    }

    public void atacar(Entidade Alvo) {
        double dano = this.GetAtaque();
        int multiplicador = (int) (Math.random() * 6) + 1;

        if (this.GetVidaAtual() > 0 && Alvo.GetVidaAtual() > 0) {
            switch (multiplicador) {
                case 1:
                    Alvo.SetVidaAtual(Alvo.GetVidaAtual() - dano - 10);
                    System.out.println("Nada Efetivo!! " + GetAtaque());
                    break;

                case 2:
                    Alvo.SetVidaAtual(Alvo.GetVidaAtual() - dano - 5);
                    System.out.println("Pouco Efetivo!! " + GetAtaque());
                    break;

                case 3:
                    Alvo.SetVidaAtual(Alvo.GetVidaAtual() - dano * 1);
                    System.out.println("Foi Efetivo!! " + GetAtaque());
                    break;

                case 4:
                    Alvo.SetVidaAtual(Alvo.GetVidaAtual() - dano * 1.2);
                    System.out.println(" Muito Efetivo!! " + GetAtaque());
                    break;

                case 5:
                    Alvo.SetVidaAtual(Alvo.GetVidaAtual() - dano * 1.5);
                    System.out.println("Extremamente  Efetivo!! " + GetAtaque());
                    break;

                case 6:
                    Alvo.SetVidaAtual(Alvo.GetVidaAtual() - dano * 2);
                    System.out.println("Crítico!! " + GetAtaque());
                    break;

                default:
                    System.out.println("");
            }
        }

    }

}