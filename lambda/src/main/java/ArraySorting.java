
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ArraySorting {

    public static void main(String[] args) {
        /*
        This way works without Lambda if interface has more than 2 methods
        ArraySorting arr = new ArraySorting();
        QuickSort quickSort = new QuickSort();
        BubleSort bubleSort = new BubleSort();
        arr.sort(quickSort);
        arr.sort(bubleSort);
         */
        Sorting quickSort = () -> System.out.println("Quick sort");
        sortApple(quickSort);

        Sorting bubleSort = () -> System.out.println("Buble sort");
        sortApple(bubleSort);
    }
    public static void sortApple(Sorting sorting) {
        sorting.sort();
    }

}
