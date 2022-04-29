import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // start section

        System.out.print("Enter size: ");
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        System.out.println("Entered size: " + size);

        int[] inputArray = new int[size];
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print("Enter value: ");
            inputArray[i] = console.nextInt();
        }
        int countOfPositiveElm = 0;
        for (int x = 0; x < inputArray.length; x++) {
            if (inputArray[x] > 0) {
                countOfPositiveElm++;
            }

        }
        int [] resultArray = new int[countOfPositiveElm];
        int count = 0;
        for (int x =0; x < inputArray.length; x++){
            if (inputArray[x] > 0) {
                resultArray[count] = inputArray[x];
                count++;
            }

    }
        System.out.println("inputArray ");
        for (int i : inputArray){
            System.out.print("[" + i + "]");
        }
        System.out.println ();
        System.out.println("resultArray ");
        for (int x : resultArray) {
            System.out.print("[" + x + "]");

        }

// end section

//        int[] resultArray = new int[size];
//
//        for (int y = 0; y < resultArray.length; y++) {
//            int a = resultArray[y];
//            if (resultArray[y] == 1) {
//                inputArray[y] = console.nextInt();
//                System.out.print("test" + a);
//            }
//            System.out.print("resultArray " + "[" + a + "]");
//        }

    }
}


//        int[] myArray = {1, 3, 4, -5, 8, -7, -9, 0, 5, 7, 8, 9, 9, -55, 15};
//
//        int a = 0;
//
//        for (int i = 0; i < myArray.length; i++) {
//            a = myArray[i];
//            if (a == 0) {
//
//                break;
//            }
//            System.out.println(a);
//        }
//    }
//}


//        for (int max : myArray) {
//            System.out.print("[" + max + "]");
//        }
//        System.out.println();
//
//        int max = myArray[0];
//        int indexArrayMax = 0;
//        int min = myArray[0];
//        int indexArrayMin = 0;
//
//        for (int i = 0; i < myArray.length; i++) {
//            if (myArray[i] > max) {
//                max = myArray[i];
//                indexArrayMax = i;
//
//            }
//            if (myArray[i] < min) {
//                min = myArray[i];
//                indexArrayMin = i;
//
//            }
//            int temp = myArray[indexArrayMax];
//            myArray[indexArrayMax] = myArray[indexArrayMin];
//            myArray[indexArrayMin] = temp;
//
//        }
//        for (int x : myArray) {
//            System.out.print("[" +x + "]");
//
//        }
//
//
//        System.out.println();
//
//    }
//}


// int[] myArray = {1, -5, 8, 0, -7, -9, 15};
//        int[] resultArray = {1, 8, 15};
//
//        for (int i = 0; i < myArray.length; i++) {
//            if (myArray[i] > 0) {
//                System.out.println("We meet this numb:" + myArray[i]);
//            }
//        }
//        for (int a = 0; a < resultArray.length; a++) {
//            if (resultArray[a] > 0) {
//                System.out.println("We meet this numb in second array:" + resultArray[a]);
//            }
//        }

//        System.out.print("Enter size: ");
//        Scanner console = new Scanner(System.in);
//        int size = console.nextInt();
//        System.out.print("Entered size: "+ size);
//        System.out.println(myArray);


//        Scanner in = new Scanner(System.in);
//        System.out.println("\nEnter your number:");
//        int num = in.nextInt();
//
//            if (num >5 ) {
//                System.out.println(num + " more than 5");
//            } else if (num == 5 || num < 5) {
//                System.out.println(num + " equal 5 or lesser than 5");
//            }
////            else {
////                System.out.println(num + " more than 5");
////            }
//
//
//        System.out.print("Entered number: " + num);
//        in.close();
//
//
//    }

