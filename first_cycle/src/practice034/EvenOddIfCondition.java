package practice034;

/**
 * Created by ehay@naver.com on 2018-11-08
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class EvenOddIfCondition {

    public static void main(String[] args) {
        int temp = 99;
        if (temp % 2 == 1) {
            temp = temp * 3 + 1;
        } else {
            temp = temp / 2;
        }
        System.out.printf("계산 후 = %d\n", temp);
    }
}
