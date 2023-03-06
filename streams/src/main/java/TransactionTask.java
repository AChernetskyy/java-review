import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TransactionTask {
    public static void main(String[] args) {
        String breakLine = "\n**********New Task*********";
        Stream<Transaction> getByStream = TransactionData.getAllTransactions().stream();

        //1- Find all transactions in 2011 and sort by value
        getByStream.filter(transaction -> transaction.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);

        //2- What are all the unique cities where the traders work?
        System.out.println(breakLine);
        TransactionData.getAllTransactions().stream().map(transaction -> transaction.getTrader().getCity()).distinct().forEach(System.out::println);

        //3- Find all traders from Cambridge and sort them by name
        System.out.println(breakLine);
        TransactionData.getAllTransactions().stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);

        //4- Return a string of all trader's names sorted alphabetically
        System.out.println(breakLine);
        TransactionData.getAllTransactions().stream()
                .map(transaction -> transaction.getTrader().toString())
                .sorted()
                .forEach(System.out::println);

        //5- Are any traders based in Milan?
        System.out.println(breakLine);
        Boolean isMilan = TransactionData.getAllTransactions().stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(isMilan);

        //6- Print the values of all transactions from the traders living in Cambridge
        System.out.println(breakLine);
        TransactionData.getAllTransactions().stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue).forEach(System.out::println);

        //7 - What is the highest value of all the transactions
        System.out.println(breakLine);
        Optional<Integer> highestValue = getByStream.map(Transaction::getValue).reduce(Integer::min);
        System.out.println(highestValue);
    }
}
