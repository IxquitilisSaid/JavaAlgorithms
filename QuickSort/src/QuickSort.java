import java.util.Scanner;

public class QuickSort {

    int part(int arr[], int low, int high) {
        int anchor = arr[high];
        int i = (low - 1);

        for (int counter = low; counter < high; counter++) {
            if (arr[counter] <= anchor) {
                i++;

                int temp = arr[i];
                arr[i] = arr[counter];
                arr[counter] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return  i + 1;
    }

    void sortIt(int arr[], int low, int high) {
        if (low < high) {
            int pi = part(arr, low, high);

            sortIt(arr, low, pi - 1);
            sortIt(arr, pi + 1, high);
        }
    }

    static void printResultMethod(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int[] userCreatedArray = new int[10];
        int stillNum = 10;

        for (int options = 0; options < userCreatedArray.length; options ++) {

            System.out.println("Digite 10 numeros: ");
            System.out.println("Inputs restantes: " + stillNum);

            stillNum--;

            userCreatedArray[options] = userInput.nextInt();
        }

        int n = userCreatedArray.length;

        QuickSort fastLad = new QuickSort();
        fastLad.sortIt(userCreatedArray, 0, n - 1);

        printResultMethod(userCreatedArray);
    }
}
