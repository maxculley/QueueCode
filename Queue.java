
/**
 *
 * @author maxculley
 *
 * Code for the implementation of a queue using basic arrays and methods.
 *
 * Using a circular array way of doing it by taking the mod of the front and back
 * pointers and assigning the values to their given index using the remainder
 *
 *
 */
public class Queue {

    private int[] arr = new int[5]; // New array size 5
    private int size, front, back; // Initialising variables
    private int length = 5; // Length of the array

    /**
     *
     * @return size of the current array
     */
    public int getSize() {
        return size; // Return size of array
    }

    /**
     *
     * @param data the value inputted into the queue
     */
    public void enqueue(int data) {
        if (!isFull()) { // If the array is not full
            arr[back] = data; // The current front of the array = data inputted
            back = (back + 1) % length; // Refer to header
            size = size + 1; // Incrementing the size
        } else { // If the array is full
            System.out.println("\nQueue is full!");
        }
    }

    /**
     *
     * @return return the element being removed by from the queue, if there are
     * no elements return -1
     */
    public int dequeue() {
        if (!isEmpty()) { // If the array is not empty
            int data = arr[front]; // Save the value you are removing to return
            front = (front + 1) % length; // Refer to header
            size = size - 1; // Decramenting size
            return data;
        } else { // If the array is empty
            System.out.println("\nQueue is empty!");
            return - 1;
        }
    }

    /**
     *
     * @return Boolean value for whether the queue is empty or has values in it
     */
    public boolean isEmpty() {
        return getSize() == 0;
    }

    /**
     *
     * @return Boolean value for whether the queue is full or not
     */
    public boolean isFull() {
        return getSize() == length;
    }

    public void show() {
        System.out.print("Values in queue: ");

        for (int i = 0; i < size; i++) {
            System.out.printf("%d ", arr[(i + front) % length]);
        }

    }

    public void showArray() {
        System.out.print("\nValues in array: ");

        for (int value : arr) {
            System.out.printf("%d ", value);
        }
    }

}
