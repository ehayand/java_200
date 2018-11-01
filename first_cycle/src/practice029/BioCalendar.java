package practice029;

/**
 * Created by ehay@naver.com on 2018-11-01
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class BioCalendar {

    public static final int PHYSICAL = 23;

    public static double getBioRhythm(long days, int index, int max) {
        return max - Math.sin((days % index) * 2 * Math.PI / index);
    }

    public static void main(String[] args) {
        int days = 1200;

        double phyval = getBioRhythm(days, PHYSICAL, 100);
        System.out.printf("나의 신체 지수 %1$.2f입니다.\n", phyval);
    }
}
