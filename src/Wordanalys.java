import java.util.Scanner;
public class Wordanalys { //Выделение одного символа из слова
    Scanner in = new Scanner(System.in);
    String word = in.nextLine();

    int lenghtofword = word.length();

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    private char[] cword = word.toCharArray(); // ПЕРЕВОД ИЗ СТОРОКИ В МАССИВ СИМВОЛОВ
    int lenghtofcword = lenghtofword;


    public int getLenghtofcword() {
        return lenghtofcword; // Длина массива символов введенного слова
    }
    public void numofsymbol(){
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
