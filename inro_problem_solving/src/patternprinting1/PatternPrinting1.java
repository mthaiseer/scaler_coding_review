package patternprinting1;

public class PatternPrinting1 {

    public int[][] solve(int A) {

        int [][] arr = new int[A][A];

        for(int i=0; i<A; i++){
            int count =1;
            for(int j=0; j<=i; j++){
                arr[i][j] = count++;
            }
        }
        return arr;
    }

    static void print(int arr[][]){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = new PatternPrinting1().solve(4);
        print(arr);
    }

}
