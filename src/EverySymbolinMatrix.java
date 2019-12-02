public class EverySymbolinMatrix {
    char[] introducedsymbol;
    String inputword;

    public EverySymbolinMatrix(String inputword) {
        this.inputword = inputword;
    }

    public void MakeFinalMatrix(){
        Wordanalys wordanalys = new Wordanalys(inputword);
        introducedsymbol = wordanalys.getCword();


    }
}
