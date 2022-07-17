package binarysearch;

public class BinarySearchMain {
    public static void main(String[] args) {
        BinarySearch binary = new BinarySearch();
        int[] arrayOfElements = {2, 3, 4, 10, 40};
        int lengthOfArray = arrayOfElements.length;
        int targetElement = 10;
        int result = binary.binarySearch(arrayOfElements, 0, lengthOfArray - 1, targetElement);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}