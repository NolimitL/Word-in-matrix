import java.util.Scanner;

public class Symbolmatrix {

    String ourword;

    public Symbolmatrix(String word)
    {

        this.ourword = word;

    }

    final char[] allsymbol = new char[]{'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
    //26 символов q w e r t y u i o p a s d f g h j k l z x c v b n m


    public void firstsymbol(){
        Wordanalys wordanalys = new Wordanalys(ourword);
        int lenghtofourword = wordanalys.getLenghtofwordC();
        char[] inputarrassymbol = wordanalys.getCword(); // Получили массив символов введенного слова

        System.out.println("Start searching...");
        for (int k = 0; k < lenghtofourword; k++) {
            System.out.print(inputarrassymbol[k] + "-");
        }
        System.out.println();
        System.out.println("What");
        int oneof28 = 0;
        for (int i = 0; i < lenghtofourword; i++) {
            for (; inputarrassymbol[i] != allsymbol[oneof28]; oneof28++)
            System.out.printf("%d Symbol is %c and in array it is number %d\n",i,inputarrassymbol[i],oneof28);
        }
    }
}
