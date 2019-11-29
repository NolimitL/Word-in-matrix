import java.util.Scanner;

public class MatricksArrays {

    static Wordanalys wordanalys;

    public MatricksArrays(Wordanalys wordanalys) {
        this.wordanalys = wordanalys;
    }

    public static void main(String[] agrs) {
        /*
//    int val[]; // Определяем массив
//    val = new int[10]; // Задаем ему !количество! символов или чисел (МАССИВ ИЗ 10 ЧИСЕЛ)
        //
        byte ik = 5;
        int val[] = new int[ik]; // Либо делаем это в одной строке
        // НО ВСЕ значения в этом массиве пока равны 0 или false или null
        int valuble[] = new int[]{111,24,67,55,91};
        int valuble2[] = {10,8,5,7,9};
        //
        //val[5] = 23; Заполнение массива
        //val[4] = 21;
        int k = 25;
        for (int count = 0; count < ik; count++){
            k = k - 2;
            val[count] = k;
            System.out.printf("Val[%d] = %d\n",count,k);
        }
        int lenght = val.length;
        int lastel = val[val.length-1];
        System.out.printf("Lenght of arrays= %d \nLast element of arrays = %d\n",lenght,lastel);

*/
        System.out.println("Загрузка начального массива...");
        StartsMatrix startsMatrix = new StartsMatrix();
        startsMatrix.optionsofstartsmatrix();
        System.out.println("Начальный массив загружен.");

        System.out.println("Write your word:");
        //wordanalys(new Scanner(System.in));
        String word = wordanalys(new Scanner(System.in)).getWord();
        System.out.printf("Your word is '%s'\n",word);
        wordanalys.setWord(word);
        System.out.printf("Lenght of your word is %d symbol\n", wordanalys.lenghtofcword);
        wordanalys.numofsymbol();
        System.out.println("llllllll");
        Symbolmatrix matrixofS = new Symbolmatrix();
        System.out.println("pppppppp");
        matrixofS.firstsymbol();
    }
}
