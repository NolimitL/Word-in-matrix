public class StartsMatrix {  //Начальная матрица
    // Конструктор
    private int line = 4; //Высота
    private int collumn = 28; //Длина
    private int[][] ar = new int[line][collumn]; //Первое число строки, второе столбцы
    private int lineval = 0; // СТРОКИ
    private int collumnval = 0; // СТОЛБЦЫ
    private int kok = 0;


    public void optionsofstartsmatrix() {
        System.out.printf("Height = %d\n", ar.length);
        System.out.printf("Length = %d\n", ar[0].length);

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
