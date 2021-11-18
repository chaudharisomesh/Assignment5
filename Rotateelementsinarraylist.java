package Learning.Assignment5;

public class Rotateelementsinarraylist {

    void leftRotate(int arr[], int d, int n) {
        for (int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }

    void leftRotatebyOne(int arr[], int n) {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n - 1] = temp;
    }

    void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Rotateelementsinarraylist rotate = new Rotateelementsinarraylist();
        int arr[] = {10, 20, 30, 40, 50, 60};
        rotate.leftRotate(arr, 10, 6);
        rotate.printArray(arr, 6);

    }
}










