public class CycleFor4 {
    public static void main(String[] args) {
        //Два шага вперед, один назад: 0,2,1,3,2,4,3,5
        for (int i = 0; i < 10; i++) {
            //System.out.print(i);
            i++;
            System.out.print(i);
            System.out.print(",");
            i--;
            System.out.print(i);
            System.out.print(",");
        }
        System.out.println();
        System.out.print("0,");
        for (int i = 2; i < 10; i += 2) {
            System.out.print(i);
            System.out.print(",");
            i--;
            System.out.print(i);
            System.out.print(",");
        }

    }
}
