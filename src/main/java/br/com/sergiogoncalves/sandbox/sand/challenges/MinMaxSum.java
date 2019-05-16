package br.com.sergiogoncalves.sandbox.sand.challenges;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinMaxSum {

    public static void miniMaxSum(int[] arr) {

        int min = Arrays.stream(arr).filter(i -> i >= 0).min().orElse(0);

        int max = Arrays.stream(arr).filter(i -> i >= 0).max().orElse(0);

        Set<Integer> items = new HashSet<>();


        Arrays.stream(arr).forEach(item->{
            items.add(item);
        });


        if(items.size() > 1) {

            System.out.print(Arrays.stream(arr).asLongStream().filter(x -> x != max).sum() + " " + Arrays.stream(arr).asLongStream().filter(x -> x != min).sum());
        }
        else {
            System.out.print(max * (arr.length - 1) + " " + min * (arr.length - 1));
        }
    }
}
