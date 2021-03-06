package com.us.improve.algorithm.search.practice;

/**
 * @ClassName BinarySearchPractice1Test
 * @Desciption 二分查找练习1测试
 * @Author loren
 * @Date 2020/4/21 5:22 PM
 * @Version 1.0
 **/
public class BinarySearchPractice1Test {

    public static void main(String[] args) {
        BinarySearchPractice1 binarySearch = new BinarySearchPractice1();

        int[] arr1 = new int[] {0, 1, 2, 3, 4, 6, 8, 9, 10};
        int[] arr2 = new int[] {0, 1, 2, 2, 3, 4, 4, 4, 4, 6, 8, 8, 9, 9, 10, 11, 23, 34, 54, 55, 77, 90};

        System.out.println(binarySearch.bSearch1(arr1, 3));
        System.out.println(binarySearch.bSearch2(arr1, 3));
        System.out.println(binarySearch.bSearch3(arr2, 4));
        System.out.println(binarySearch.bSearch4(arr2, 2));
        System.out.println(binarySearch.bSearch5(arr2, 5));
        System.out.println(binarySearch.bSearch6(arr2, 2));
    }

}
