
public class EverySymbolinMatrix {
    char[] introducedsymbol;
    String inputword;

    public EverySymbolinMatrix(String inputword, char[] introducedsymbol) {
        this.inputword = inputword;
        this.introducedsymbol = introducedsymbol;
    }

    public char[] MakeFinalMatrix(int numofsym, int amountofline, int lenghtArraysC) {
        char[] line = new char[0];
        for (int i = 0; i < lenghtArraysC; i++) {
            SymbolBase symbolBase = new SymbolBase(numofsym);
            line = symbolBase.getOneStringMatrix(amountofline);
        }
        return line;
    }
}