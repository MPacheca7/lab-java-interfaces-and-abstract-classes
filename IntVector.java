public class IntVector implements IIntList{
    private int[] numArray;
    public int ability;

    public IntVector() {
        this.numArray = new int[20];
        this.ability = 0;
    }

    @Override
    public void addList() {
        if (ability == numArray.length) {
            int arraydouble = numArray.length + numArray.length *2;
            int[] newArray = new int[arraydouble];

            System.arraycopy(numArray, 0, numArray, 0, numArray.length);
            numArray = newArray;
        }
        numArray[ability] = numArray[ability] + 1;
    }

    @Override
    public int getList(int id) {
        return numArray [ability];
    }
}
