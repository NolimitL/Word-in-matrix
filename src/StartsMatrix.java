public class StartsMatrix {  //Начальная матрица
    int line = 4; //Высота
    int collumn = 28; //Длина
    int[][] ar = new int[line][collumn]; //Первое число строки, второе столбцы
    int lineval = 0; // СТРОКИ
    int collumnval = 0; // СТОЛБЦЫ
    int kok = 0;

    public void startsmatrix() {
        System.out.printf("Высота = %d\n", ar.length);
        System.out.printf("Длина = %d\n", ar[0].length);
        for (; lineval < ar.length/*измеряет высоту в двухмерном массиве*/; lineval++) {
            for (; collumnval < ar[lineval].length/*измерет длину в двухмерноммассиве*/; collumnval++) {
                ar[lineval][collumnval] = kok;
                System.out.printf("%d ", kok);
            }
            collumnval = 0;
            System.out.println();
        }
    }

    public int[][] getAr() {
        return ar;
    }
}
