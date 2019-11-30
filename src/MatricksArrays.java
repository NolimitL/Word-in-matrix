import java.util.Scanner;

public class MatricksArrays {

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
//StartsMatrix
        System.out.println("Loading a initial array...");
        StartsMatrix startsMatrix = new StartsMatrix();
        startsMatrix.optionsofstartsmatrix();
        System.out.println("Initial array is loaded.");
//Wordanalys
        System.out.println("Write your word:");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        Wordanalys wordanalys = new Wordanalys(word);
        System.out.printf("Your word is '%s'\n",word);
        System.out.printf("Lenght of your word is %d symbol\n", wordanalys.getLenghtofwordC());
        wordanalys.numofsymbol();
        System.out.println("The end of yours word analys.");
//Symbolmatrix
        Symbolmatrix matrixofS = new Symbolmatrix(word);
        matrixofS.searchsymbolinarray();
    }
}
