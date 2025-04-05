public class ArrayStart {
    public static void main(String[] args) {
        IIntList num1 = new IntArrayList();
        IIntList num2 = new IntVector();

        num1.addList();
        num2.addList();
        System.out.println(num1);
        System.out.println(num2);

    }
}
