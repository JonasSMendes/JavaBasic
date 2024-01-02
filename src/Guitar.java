public class Guitar {
    private String name;
    private int chords;

    public Guitar(String name, int chords){
        this.name = name.toUpperCase();
        this.chords = chords;
    }
    public void setGuitar(String name){
        this.name = name.toUpperCase();
    }
    public String getGuitar(){
        return name;
    }

}
