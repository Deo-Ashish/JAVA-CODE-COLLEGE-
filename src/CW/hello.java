package CW;// 1. Enter three different number and display greatest among them.

import java.util.Arrays;

public class hello {
    public static void main(String[] args) {

        int[] arr= {1,2,3};
        String[] name = {"Ashish", "Adarsh", "Ankit"};

        Arrays.stream(name).map(s -> s + " ").forEach(System.out::print);
    }
}