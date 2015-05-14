package careercup;

import java.util.Arrays;

/**
 * Problem statement:
 *
 * Given array A of size N, using function Random(returns random number between 0 and 1)
 * implement function that will return array of size N with randomly shuffled elements of the array A.
 * You shoul give only algo.
 *
 * Problem link: http://www.careercup.com/question?id=5183602746720256
 *
 * @author denysp
 *
 */

public class Facebook_1 {

    public static int binRandom(){
        return Math.random() < 0.5 ? 0 : 1;
    }

    public static int nRandom(int n){
        int result = 0;
        while(--n >= 0)
            result += binRandom();
        return result;
    }

    public static void exch(int [] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void shuffle(int [] a){
        for(int i = 0; i < a.length; i++)
            exch(a, i, nRandom(i));
    }

    public static void main(String[] args) {
        int [] testArray =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        shuffle(testArray);
        System.out.println(Arrays.toString(testArray));
    }

}
