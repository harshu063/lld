package multithreading.Mergesort;

import java.util.*;
import java.util.concurrent.*;

public class MergeSorter implements Callable<List<Integer>> {

    private final List<Integer> data;
    private final ExecutorService executor;

    public MergeSorter(List<Integer> data, ExecutorService executor) {
        this.data = data;
        this.executor = executor;
    }

    @Override
    public List<Integer> call() throws Exception {

        // BASE CASE
        if (data.size() <= 1) {
            return data;
        }

        int mid = data.size() / 2;

        List<Integer> left = data.subList(0, mid);
        List<Integer> right = data.subList(mid, data.size());

        // Create tasks
        MergeSorter leftTask = new MergeSorter(left, executor);
        MergeSorter rightTask = new MergeSorter(right, executor);

        // Submit tasks
        Future<List<Integer>> leftFuture = executor.submit(leftTask);
        Future<List<Integer>> rightFuture = executor.submit(rightTask);

        // Wait for results
        List<Integer> leftSorted = leftFuture.get();
        List<Integer> rightSorted = rightFuture.get();

        return merge(leftSorted, rightSorted);
    }

    private List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                result.add(left.get(i++));
            } else {
                result.add(right.get(j++));
            }
        }

        while (i < left.size()) result.add(left.get(i++));
        while (j < right.size()) result.add(right.get(j++));

        return result;
    }
}
