import java.math.BigInteger;

/**
 * Factorial1to100クラスは、1から100までの各整数の階乗を計算し、標準出力に表示するプログラムです。
 * 
 * @author Your Name
 * @date 2024-06-10
 */
 
public class Factorial1to100 {
    public static void main(String[] args) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= 100; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
            System.out.println(i + "! = " + fact);
        }
    }

    /**
     * 指定された整数nの階乗を計算します。
     *
     * @param n 階乗を計算する対象の整数
     * @return nの階乗を表すBigIntegerオブジェクト
     */
    // private static BigInteger factorial(int n) {
    //     BigInteger result = BigInteger.ONE;
    //     for (int i = 2; i <= n; i++) {
    //         result = result.multiply(BigInteger.valueOf(i));
    //     }
    //     return result;
    // }
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}