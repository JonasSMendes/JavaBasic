public class Main {
    public static void main(String[] args) {
        Guitar[] guitars = new Guitar[10];

        for (int i = 0; i < guitars.length; i++){
            Guitar atual = new Guitar("fender", 6);

            atual.setGuitar("fender");
            guitars[i]=atual;
        }

        System.out.println(guitars[2].getGuitar());
    }
}