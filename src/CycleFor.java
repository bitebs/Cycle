public class CycleFor {
    public static void main(String[] args) {
        //поднимаемся по ступеням с 1 по 9

        for (int i=1; i<=9; i++)
            System.out.print(i);

        System.out.println();

        for(int i=1; i<=9; i+=3) {
            System.out.print(i);

        }
        System.out.println();

        for (int i = 10; i>=0; i--)
            System.out.print(i);

        int a = 0;
        for (int i = 1; 1<12; i++){
            System.out.println(i);
            i+=a;
            a++;
        }

    }
}
