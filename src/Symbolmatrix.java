import java.util.Scanner;

public class Symbolmatrix {

    private Wordanalys wordanalys = new Wordanalys(new Scanner(System.in));
    private char[] inputarrassymbol = wordanalys.getCword(); // Получили массив символов введенного слова
    char[] allsymbol = new char[]{'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
    //26 символов q w e r t y u i o p a s d f g h j k l z x c v b n m
    int oneof28 = 0;
    int lenghtofinputcword = wordanalys.getLenghtofcword();

    public void firstsymbol(){
        System.out.println("Start searching...");
        for (int k = 0; k < lenghtofinputcword; k++) {
            System.out.print(inputarrassymbol[k] + "-");
        }
        System.out.println("What");
        for (int i = 0; i < lenghtofinputcword; i++) {
            for (; inputarrassymbol[i] != allsymbol[oneof28]; oneof28++)
            System.out.printf("%d Symbol is %c and in array it is number %d\n",i,inputarrassymbol[i],oneof28);
        }
    }
}
