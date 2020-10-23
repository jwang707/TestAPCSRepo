public class Demo{
  public static void printLoop(int n){
    for(int i = 1; i <= n; i++){
      for(int j = i - 1; n > j; j++){
        System.out.print(i);
      }
      System.out.println();
    }
  }

  /* public static void main(String[] args) {
    if (args.length > 0) {
      printLoop(Integer.parseInt(args[0]));
    }
    else
      printLoop(5);
    } */

    public static String arrToString(int[] arr) {
      String result = "{";
      for (int i = 0; i < arr.length; i++) {
        if (i < arr.length -1) {
          result += Integer.toString(arr[i]) + ", ";
        }
        else result += Integer.toString(arr[i]);
      }
      result += "}";
      return result;
    }

    public static String arrayDeepToString(int[][]arr) {
      String result = "{";

      for (int i = 0; i < arr.length; i++) {
        if (i < arr.length-1) {
          result += arrToString(arr[i]) + ", ";
        }
        else result += arrToString(arr[i]);
      result += "}";
    }
      return result;
    }

    public static int[][] create2DArray(int rows, int cols, int maxValue) {
      int[][]myArray = new int[rows][cols];

      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
          myArray[i][j] = (int)(Math.random()* maxValue);
        }
      }
      return myArray;
    }

    public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
      int[][]myArray = new int[rows][];

      for (int i = 0; i < rows; i++) {
        myArray[i] = new int[(int)(Math.random()* cols)];
        for (int j = 0; j < myArray[i].length; j++) {
          myArray[i][j] = (int)(Math.random()* maxValue);
        }
      }
      return myArray;
    }

}

/*Sorry-- I know it's bad practice to not commit throughout, but the tester code needed all of the functions to work first*/
