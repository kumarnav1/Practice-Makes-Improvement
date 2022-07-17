package linearsearch;

public class LinearSearch {
    public int linearSearch(int[] arrayOfElements, int targetElement) {
        int sizeOfArray = arrayOfElements.length;
        for (int index = 0; index < sizeOfArray; index++) {
            if (arrayOfElements[index] == targetElement)
                return index;
        }
        return -1;
    }
}