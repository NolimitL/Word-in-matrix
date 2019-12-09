public class EverySymbolinMatrix {
    char[] introducedsymbol;
    String inputword;

    public EverySymbolinMatrix(String inputword) {
        this.inputword = inputword;
    }

    public void MakeFinalMatrix(char sym){
        Wordanalys wordanalys = new Wordanalys(inputword);
        introducedsymbol = wordanalys.getCword();
        int lengntOfArrSym = wordanalys.getLenghtofwordC();
        SymbolBase symbolBase = new SymbolBase(sym);

    }
}
