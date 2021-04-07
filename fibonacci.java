class Solution {
    public int fib(int N) {
        if (N == 0) {
            return 0;
        } else if (N == 1){
            return 1;
        }
        return memorize(N);
    }

    public int memorize(int N) {
      int[] cache = new int[N + 1];
      cache[1] = 1;

      for (int i = 2; i <= N; i++) {
          cache[i] = cache[i-1] + cache[i-2];
      }
      return cache[N];
    }
}