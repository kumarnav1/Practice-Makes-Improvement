package linearsearch;

public class LinearSearchMain {
    public static void main(String[] args) {
        int[] arrayOfElements = {2, 3, 4, 10, 40};
        int targetElement = 10;
        int result = new LinearSearch().linearSearch(arrayOfElements, targetElement);
        if (result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index " + result);
    }
}