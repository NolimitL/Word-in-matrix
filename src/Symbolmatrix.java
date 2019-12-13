public class Symbolmatrix {

    String ourword;

    public Symbolmatrix(String inputword)
    {

        this.ourword = inputword;

    }

    final char[] ALL_SYMBOLS = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};
    //26 символов q w e r t y u i o p a s d f g h j k l z x c v b n m
    //1 символ это пробел

    public void searchSymbolInArray(){
        Wordanalys wordanalys = new Wordanalys(ourword);
        int lenghtofourword = wordanalys.getLenghtofwordC();
        char[] inputarrassymbol = wordanalys.getCword(); // Получили массив символов введенного слова

        System.out.println("Start searching...");
        for (int k = 0; k < lenghtofourword; k++) {
            System.out.print(inputarrassymbol[k]);
            if (k < lenghtofourword-1){
                System.out.print("-");
            }
        }
        int oneof28;
        System.out.println();
        System.out.println("Search introduced symbol in initial array...");
        EverySymbolinMatrix everySymbolinMatrix = new EverySymbolinMatrix(ourword, ALL_SYMBOLS);
        for (int i = 0; i < lenghtofourword; i++) {
            oneof28 = 0;
            for (; inputarrassymbol[i] != ALL_SYMBOLS[oneof28]; oneof28++){}
            if (inputarrassymbol[i] == ALL_SYMBOLS[oneof28]) {
                //System.out.printf("%d Symbol is %c = %c and in initial array it is number %d\n", i + 1, inputarrassymbol[i], ALL_SYMBOLS[oneof28], oneof28+1);
                System.out.println(everySymbolinMatrix.MakeFinalMatrix(oneof28));
            }
        }
    }
}

