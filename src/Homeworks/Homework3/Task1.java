package Homeworks.Homework3;

public class Task1 {
    public static void main(String[] args) {
        int k=7;
        int n=3;
        //int mod =5%8;
        int result=k++ * ++n / ++n % k + n - k++;
        int $result = k + k++ * k - n++ % n + ++n;
      //System.out.println(k++);
        //System.out.println(++n);
      // System.out.println(++n);
        //System.out.println(n);
        //System.out.println(k++);
        // System.out.println(mod);
        System.out.println(result);
        System.out.println($result);
        //System.out.println(5%8);
      /*PseudoCode
      first operation will be multiplication k++*++n which is 7*4 and == 28
         ,after that the total 28 will divide with 5 which is 5 and 5 mod 7 is 5 +5 == 10 and minus 8 ==2
         so,the first k++ will keep as a initial one but will add 1 next time,++n will add 1 to the initial one after that is
        ++n so we will add one again,after that is k which will be + 1 because when the first one was k++ we said total will add one next time
      after that is n which will remain the same
       */
    }
}
