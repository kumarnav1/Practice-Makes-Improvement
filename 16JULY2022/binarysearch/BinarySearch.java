package binarysearch;

public class BinarySearch {
    int binarySearch(int[] array, int leftIndex, int rightIndex, int targetElement) {
        if (rightIndex >= leftIndex) {
            int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;
            if (array[middleIndex] == targetElement)
                return middleIndex;
            if (array[middleIndex] > targetElement)
                return binarySearch(array, leftIndex, middleIndex - 1, targetElement);
            return binarySearch(array, middleIndex + 1, rightIndex, targetElement);
        }
        return -1;
    }
}
