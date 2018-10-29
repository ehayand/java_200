package practice028;

/**
 * Created by ehay@naver.com on 2018-10-29
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class BioCalendar {

    public static final int PHYSICAL = 23;

    public static void main(String[] args) {
        int index = PHYSICAL;
        int days = 1200;

        double phyval = 100 * Math.sin((days % index) * 2 * Math.PI / index);
        System.out.printf("나의 신체 지수 %1$.2f입니다.\n", phyval);
    }
}
