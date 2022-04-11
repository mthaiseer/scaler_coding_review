package MinMax;

public class MinMax {

    public int solve(int[] A) {

        int ans =0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int el: A){
            min = Math.min(min, el);
            max = Math.max(max, el);
        }

        for(int el: A){
            if(min< el && max > el){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int ans  = new MinMax().solve(new int[]{ 1,2});
        System.out.println(ans);
    }
}
