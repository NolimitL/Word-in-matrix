public class test {
    public static void main(String[] args) {
        char[][][] unit = new char[][][]{
                {
                    {'g','o','e'},
                    {'l','h'},
                    {'U'}
                },
                {
                        {'a','w','r','p'},
                        {'l','k','e','e','f'}
                }
        };
        int lenhgty = unit[1][1].length;
        System.out.println(lenhgty);
        System.out.println(unit[1]);
    }
}
