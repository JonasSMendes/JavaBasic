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

/*
        OnePiece[] tripulacao = new OnePiece[]{
                new OnePiece("luffy", "nika nika no mi"),
                new OnePiece("zoro", "nenhuma"),
                new OnePiece("robin", "hana hana no mi"),
                new OnePiece("nami", "nenhuma"),
        };

        String name = tripulacao[2].getname();
        String nomi = tripulacao[2].getAkumaNoMi();

        System.out.println(name + " " +nomi);

*/
