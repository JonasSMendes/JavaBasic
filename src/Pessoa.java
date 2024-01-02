public class Pessoa {
    public String name;
    public int atack;
    public int defense;

    public void figth (int defence, int ataque){
        if(ataque > defence){
            System.out.println(name + " ganhou");
        }else {
            int vidaInimigo = ataque - defence;

            for (int rodada = 1; vidaInimigo > 0; rodada++) {
                System.out.println("Rodada: " + rodada);
                System.out.println("Vida do inimigo: " + vidaInimigo);

                vidaInimigo = ataque - defence;

            }
            System.out.println(vidaInimigo);

    }

}
}
