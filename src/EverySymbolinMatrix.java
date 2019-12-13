import java.util.Arrays;

public class EverySymbolinMatrix {
    char[] introducedsymbol;
    String inputword;

    public EverySymbolinMatrix(String inputword, char[] introducedsymbol) {
        this.inputword = inputword;
        this.introducedsymbol = introducedsymbol;
    }

    public char[] MakeFinalMatrix(int numofsym) {
        char[] line = new char[0];
        for (int i = 0; i < 5; i++) {
            SymbolBase symbolBase = new SymbolBase(numofsym);
            line = symbolBase.getOneStringMatrix(i);
        }
        return line;

        /*Wordanalys wordanalys = new Wordanalys(inputword);
        int lengntOfArrSym = wordanalys.getLenghtofwordC();

        char[] inputarrassymbol = wordanalys.getCword();
        SymbolBase symbolBase = new SymbolBase(numofsym);
        for (int g = 0; g < 5; g++) {
            for (int i = 0; i < wordanalys.getLenghtofwordC(); i++) {
                int oneof28 = 0;
                for (; inputarrassymbol[i] != introducedsymbol[oneof28]; oneof28++) { }
                if (inputarrassymbol[i] == introducedsymbol[oneof28]) {

                }

            }
        }*/
    }

}