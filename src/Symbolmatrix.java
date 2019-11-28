public class Symbolmatrix {
    private WordInMatricks wordInMatricks = new WordInMatricks();
    private char[] inputarrassymbol = wordInMatricks.getCword(); // Получили массив символов введенного слова
    char[] allsymbol = new char[]{'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
    //26 символов q w e r t y u i o p a s d f g h j k l z x c v b n m
    int i = 0;
    int oneof28 = 0;
    int lenghtofinputcword = wordInMatricks.getLenghtofcword();

    public void firstsymbol(){
        System.out.println("Start searching...");
        System.out.println(inputarrassymbol);
        /*for (; i < lenghtofinputcword; i++) {
            for (; inputarrassymbol[i] != allsymbol[oneof28]; oneof28++)
            System.out.printf("%d Symbol is %c and in array it is number %d\n",i,inputarrassymbol[i],oneof28);
        }*/
    }
}
