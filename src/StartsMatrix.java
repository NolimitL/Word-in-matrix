public class StartsMatrix {  //Начальная матрица
    // Конструктор
    private int LINE = 4; //Высота
    private int COLLUMN = 28; //Длина
    private int[][] ar = new int[LINE][COLLUMN]; //Первое число строки, второе столбцы
    private int lineval = 0; // СТРОКИ
    private int collumnval = 0; // СТОЛБЦЫ
    private int KOK = 0;


    public void optionsOfStartsMatrix() {
        System.out.printf("Height = %d\n", ar.length);
        System.out.printf("Length = %d\n", ar[0].length);

        for (; lineval < ar.length/*измеряет высоту в двухмерном массиве*/; lineval++) {
            for (; collumnval < ar[lineval].length/*измерет длину в двухмерноммассиве*/; collumnval++) {
                ar[lineval][collumnval] = KOK;
                System.out.printf("%d ", KOK);
            }
            collumnval = 0;
            System.out.println();
        }
    }
}
