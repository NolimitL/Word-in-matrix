import java.util.Scanner;
public class Wordanalys { //Выделение одного символа из слова

    private String inpword;     //Введенное слово
    private char[] cword;       //Массив символов введенного слова
                //Конструктор
    public Wordanalys(String word)
    {

        this.inpword = word;
        this.cword = word.toCharArray();    // ПЕРЕВОД ИЗ СТОРОКИ В МАССИВ СИМВОЛОВ

    }

    public int getLenghtofword() {
        int lenghtofword = inpword.length();
        return lenghtofword;    // Длина самого слова
    }
    public int getLenghtofwordC() { // +++ !!! Решить вопрос с пробелами !!!
        int lenghtofwordC = getLenghtofword();
        return lenghtofwordC;   // Длина массива символов введенного слова
    }

    public void numofsymbol(){
        System.out.println("Write number of symbol:");
        Scanner in = new Scanner(System.in);
        int numofsym = in.nextInt();
        if (numofsym > getLenghtofwordC()){
            System.out.printf("FALLED! This is only %d symbol\n",getLenghtofwordC());
        }else{
            System.out.println(cword[numofsym-1]);
        }
    }
    public char[] getCword() {
        return cword; // Сам массив символов введенного слова
    }
}
