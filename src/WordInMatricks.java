import java.util.Scanner;
public class WordInMatricks { //Выделение одного символа из слова
    private String scanword() {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        return word;
    }
    int lenghtofword = scanword().length();

    public String getWord() {
        return scanword();
    }

    private char[] cword = scanword().toCharArray(); // ПЕРЕВОД ИЗ СТОРОКИ В МАССИВ СИМВОЛОВ
    int lenghtofcword = lenghtofword;


    public int getLenghtofcword() {
        return lenghtofcword; // Длина массива символов введенного слова
    }
    public void numofsymbol(){
        Scanner in = new Scanner(System.in);
        System.out.println("Write number of symbol:");
        int numofsym = in.nextInt();
        if (numofsym > lenghtofcword){
            System.out.printf("FALLED! This is only %d symbol\n",lenghtofcword);
        }else{
            System.out.println(cword[numofsym-1]);
        }
    }
    public char[] getCword() {
        return cword; // Сам массив символов введенного слова
    }
}
