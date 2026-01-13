package multithreading.Mergesort;

import java.util.*;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws Exception {

        List<Integer> data =
                List.of(6, 23, 4, 8, 5, 1, 2, 4, 5, 7, 1);

        ExecutorService executor =
                Executors.newFixedThreadPool(data.size());

        MergeSorter sorter = new MergeSorter(data, executor);

        Future<List<Integer>> result = executor.submit(sorter);

        System.out.println(result.get());

        executor.shutdown();
    }
}
