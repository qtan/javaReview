 public long fibonacci_1(int K) { //may time StackOverflow
    if(K<=0){
    // Write your solution here
    return 0;
    }
    if (K==1){
      return 1;
    }
    return fibonacci1(K-1)+fibonacci1(K-2);
  }
}
 public long fibonacci_2(int K) {//dp with O(n) space
    if(K<=0){
    // Write your solution here
    return 0;
    }
    long[] array = new long [K+1];
    array[1]=1;
    for (int i =2; i<=K; i++){
    	array[i]= array[i-2] + array[i-1];
    }
    return array[K];
}
 public long fibonacci_2(int K) {//dp with O(1) space
 	long a = 0;
 	long b = 1;
    if(K<=0){
    // Write your solution here
    return a;
    }
    while (K >1) {
    	long tmp = a+b;
    	a = b;
    	b = tmp;
    	K--;
    }
    return b;
}

public final class Fibo { // O (logn)

    private Fibo() { }

    public static int getNthfibo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The fibo value cannot be negative");
        }

        if (n <= 1) return n;

        int[][] result = {{1, 0}, {0, 1}}; // identity matrix.
        int[][] fiboM = {{1, 1}, {1, 0}};

        while (n > 0) {
            if (n%2 == 1) {
                multMatrix(result, fiboM);
            }
            n = n / 2;
            multMatrix(fiboM, fiboM);
        }

        return result[1][0];
    }

    private static void multMatrix(int[][] m, int [][] n) {
        int a = m[0][0] * n[0][0] +  m[0][1] * n[1][0];
        int b = m[0][0] * n[0][1] +  m[0][1] * n[1][1];
        int c = m[1][0] * n[0][0] +  m[1][1] * n[0][1];
        int d = m[1][0] * n[0][1] +  m[1][1] * n[1][1];

        m[0][0] = a;
        m[0][1] = b;
        m[1][0] = c;
        m[1][1] = d;
    }

   
