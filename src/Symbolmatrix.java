import java.util.Scanner;

public class Symbolmatrix {

    String ourword;

    public Symbolmatrix(String word)
    {

        this.ourword = word;

    }

    final char[] allsymbol = new char[]{'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
    //26 символов q w e r t y u i o p a s d f g h j k l z x c v b n m


    public void searchsymbolinarray(){
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
        for (int i = 0; i < lenghtofourword; i++) {
            oneof28 = 0;
            for (;inputarrassymbol[i] != allsymbol[oneof28];oneof28++){}
            if (inputarrassymbol[i] == allsymbol[oneof28]) {
                System.out.printf("%d Symbol is %c = %c and in initial array it is number %d\n", i + 1, inputarrassymbol[i], allsymbol[oneof28], oneof28+1);
            }
        }
    }
}

