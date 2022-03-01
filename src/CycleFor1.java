public class CycleFor1 {
    public static void main(String[] args) {
        //Счетчик имеется только у одного чловека.

        for (int i=0; i<10; i++){
            System.out.print(i);
            System.out.print(" ");
            System.out.println(9-i);
        }
    }
}
