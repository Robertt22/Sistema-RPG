

public class Main{

    public static void main(String[] args){

         Entidade prota = new Entidade("José", 100, 100, 10);

         Entidade inimigo = new Entidade("Marcio", 100,100,10);




  while (prota.GetVidaAtual() > 0 && inimigo.GetVidaAtual() > 0){

      prota.atacar(inimigo);

      if (inimigo.GetVidaAtual() <= 0){
          break;

      }
      prota.Status();
      inimigo.Status();

      inimigo.atacar(prota);

      if (prota.GetVidaAtual() <= 0){
          break;

      }

      prota.Status();
      inimigo.Status();
  }
        if (prota.GetVidaAtual() > 0) {
            System.out.println("O JOSÉ VENCEU!");
        } else {
            System.out.println("O MARCIO VENCEU!");
        }
    }

}