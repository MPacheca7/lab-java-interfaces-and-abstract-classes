public class IntArrayList implements IIntList {
    private int[] numArray;
    public int ability;

    public IntArrayList() {
        this.numArray = new int[10];
        this.ability = 0;
    }

    @Override
    public void addList() {
        if (ability == numArray.length) { // Verifica
            int abilityPlus = numArray.length + numArray.length /2; //Aumenta al 50%
            int[] newArray = new int[abilityPlus];

            System.arraycopy(numArray, 0, numArray, 0, numArray.length);
            numArray = newArray;
        }
        numArray[ability] = numArray[ability] + 1;
    }

    @Override
    public int getList(int id) {
        return numArray [ability]; // Recupera el numero al que llamamos
    }
}
