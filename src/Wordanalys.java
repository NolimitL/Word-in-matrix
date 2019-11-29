import java.util.Scanner;
public class Wordanalys { //Выделение одного символа из слова

    private char[] cword = getWord().toCharArray(); // ПЕРЕВОД ИЗ СТОРОКИ В МАССИВ СИМВОЛОВ
    int lenghtofcword = getLenghtofcword();

    public String getWord() {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        return word;
    }

    public int getLenghtofword() {
        int lenghtofword = getWord().length();
        return lenghtofword;
    }

    public int getLenghtofcword() {
        return lenghtofcword; // Длина массива символов введенного слова
    }
    public void numofsymbol(){
        System.out.println("Write number of symbol:");
        Scanner in = new Scanner(System.in);
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
