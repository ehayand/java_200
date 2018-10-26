package practice018;

/**
 * Created by ehay@naver.com on 2018-10-26
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class JavaTypeConversion {

    public static void main(String[] args) {
        String slat = "37.52127220511242   ";

        double latitude = Double.parseDouble(slat.trim());
        System.out.println(latitude);
    }
}
