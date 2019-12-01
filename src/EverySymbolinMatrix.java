public class EverySymbolinMatrix {
    char[] introducedsymbol;

    private char[][] symQ = new char[][]
            {
                    {'q','q','q','q',' '},
                    {'q',' ',' ','q',' '},
                    {'q',' ',' ','q',' '},
                    {'q',' ','q','q',' '},
                    {'q','q','q','q','q'}
            };


    public EverySymbolinMatrix(char[] introducedsymbol) {
        this.introducedsymbol = introducedsymbol;
    }

    private char symFirst(){
        AllSymbolQWERTY allSymbolQWERTY = new AllSymbolQWERTY();
        return '0';
    }
}
