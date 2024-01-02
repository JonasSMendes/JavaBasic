public class OnePiece {

    private String name;
    private String akumaNoMi;

    public OnePiece(String name, String akumaNoMi) {
        this.name = name.toUpperCase();
        this.akumaNoMi = akumaNoMi.toUpperCase();
    }

    public void setName(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }

    public void setAkumaNoMi(String akumaNoMi){
        this.akumaNoMi = akumaNoMi;
    }
    public String getAkumaNoMi(){
        return akumaNoMi;
    }


}
