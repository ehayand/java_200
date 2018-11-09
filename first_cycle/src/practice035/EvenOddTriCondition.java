package practice035;

/**
 * Created by ehay@naver.com on 2018-11-09
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class EvenOddTriCondition {

    public static void main(String[] args) {
        int temp = 99;
        temp = (temp % 2 == 1) ? temp * 3 + 1 : temp / 2;
        System.out.printf("계산 후 = %d\n", temp);
    }
}
