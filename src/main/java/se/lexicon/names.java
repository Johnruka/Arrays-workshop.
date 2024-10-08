package se.lexicon;

import java.util.Arrays;

public class names {

    public static void main(String[] args) {

    String[] names = new String[2];

    String[] Students = {"John Baptist", "Lund Strong"};
        System.out.println(names.length);

    ex05();

}

public static void ex01() {
    String[] numbers = new String[5];
    int[] number = new int[]{6, 8, 2, 5, 9};
    System.out.println(numbers.length);
}

public static void ex02() {

    String[] names = new String[3];
    String[] name = new String[]{"Mark", "Lund", "George"};


}

public static void ex03() {

    int[] originalArray = {6, 8, 10, 5, 1};
    for (int element : originalArray) {
        System.out.print(element + " ");
    }
    System.out.println();

    int[] newArray = new int[originalArray.length];
    int i = 0;
    originalArray[i] = newArray[i];

    for (int element : newArray) {
        System.out.print(element + " ");
    }
    System.out.println();

}

public static void ex04() {

    String[] names = {"John", "Luk", "Lund", "George"};
    String[] copy = Arrays.copyOf(names, names.length);

    System.out.println("Original:\t" + Arrays.toString(names));
    System.out.println("    Copy:\t" + Arrays.toString(copy));


}

public static void ex05() {

    String[] names = {"John", "Luk", "Lund", "George"};

    System.out.println("Unsorted Array:\t" + Arrays.toString(names));

    Arrays.sort(names);
    System.out.println("  Sorted Array:\t" + Arrays.toString(names));

}

public static void ex06() {

    String[] originalArray = {"John", "Luk", "Lund"};
    String[] newArray = new String[0];
    for (String element : originalArray) {
        System.out.print(element + " ");

        System.out.println();

        newArray = new String[originalArray.length + 1];


        newArray[newArray.length - 1] = "George";

        for (String name : newArray) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}

public static void ex07() {

    String[] names = {"John Baptist", "David lund", "John George", "John Marcus"};

}

;

public String findNames(String firstNameTofind) {
    String[] names = {"John"};
    for (String name : names) {
        if (name.equalsIgnoreCase(firstNameTofind)) {
            System.out.print(name);
        }
        System.out.println();
    }
    return firstNameTofind;
}
};
