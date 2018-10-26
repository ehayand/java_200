package practice027;

/**
 * Created by ehay@naver.com on 2018-10-27
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class BioCalendar {

    public static final int PHYSICAL = 23;

    public static void main(String[] args) {
        int index = PHYSICAL;
        int days = 1200;

        double vals = (days % index) * 2 * Math.PI / index;
        System.out.println(Math.toDegrees(vals) + "도");
    }
}
