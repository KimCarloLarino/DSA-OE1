import java.util.Scanner;

public class OE1 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args){
    System.out.println(" ");
    System.out.print("Enter number of elements to be used in the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
    System.out.print("Enter element: ");
      arr[i] = sc.nextInt();
    }
    int choice = 0;
    while (choice != 5) {
      System.out.println("1. Traverse");
      System.out.println("2. Delete");
      System.out.println("3. Search");
      System.out.println("4. Update");
      System.out.print("Enter your choice: ");
      choice = sc.nextInt();
      switch (choice) {
      case 1: // traverse
        System.out.println("Elements in the array:");
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
        }
        System.out.println();
        break;
      case 2: // delete
        System.out.print("Enter the index to delete: ");
        int index = sc.nextInt();
        if (index >= 0 && index < arr.length) {
          for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
          }
          int[] newArr = new int[arr.length - 1];
          System.arraycopy(arr, 0, newArr, 0, arr.length - 1);
          arr = newArr;
        } else {
          System.out.println("Invalid element!");
        }
        break;
      case 3: // search
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();
        int keyIndex = -1;
        for (int i = 0; i < arr.length; i++) {
          if (arr[i] == key) {
            keyIndex = i;
            break;
          }
        }
        if (keyIndex != -1) {
         keyIndex++;
          System.out.println("Key found at index: " + keyIndex);
        } else {
          System.out.println("Key not found!");
        }
        break;
      case 4: // update
        System.out.print("Enter the index to update: ");
        index = sc.nextInt();
        if (index >= 0 && index < arr.length) {
          System.out.print("Enter the new value: ");
          int value = sc.nextInt();
          arr[index] = value;
        } else {
          System.out.println("Invalid element!");
        }
        break;
      default:
        System.out.println("Invalid choice!");
        break;
    }//switch
    }//while loop
  }//main
}//public class