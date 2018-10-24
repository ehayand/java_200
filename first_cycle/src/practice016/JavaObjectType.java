package practice016;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by ehay@naver.com on 2018-10-24
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class JavaObjectType {

    public static void main(String[] args) {
        int[] m = {1, 2, 3};
        int[] n = new int[]{1, 2, 3};

        String card = "H8";
        Date d = new Date();
        Calendar cal = Calendar.getInstance();

        System.out.println(card);
        System.out.println(d);
        System.out.println(cal);
    }
}
