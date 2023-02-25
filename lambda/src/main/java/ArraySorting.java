public class ArraySorting {

    public static void main(String[] args) {
        ArraySorting arr = new ArraySorting();
        QuickSort quickSort = new QuickSort();
        BubleSort bubleSort = new BubleSort();
        arr.sort(quickSort);
        arr.sort(bubleSort);


    }

    private void sort(Sorting sorting) {
        sorting.sort();
    }
}
