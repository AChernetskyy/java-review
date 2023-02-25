import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ArraySorting {

    public static void main(String[] args) {
        ArraySorting arr = new ArraySorting();
        /*
        This way works without Lambda if interface has more than 2 methods
        QuickSort quickSort = new QuickSort();
        BubleSort bubleSort = new BubleSort();
        arr.sort(quickSort);
        arr.sort(bubleSort);
         */
        Sorting quickSort = () -> System.out.println("Quick sort");
        quickSort.sort();

        Sorting bubleSort = () -> System.out.println("Buble sort");
        bubleSort.sort();


    }
    /*
    This way works without Lambda if interface has more than 2 methods
    private void sort(Sorting sorting) {
        sorting.sort();
    }
     */
}
