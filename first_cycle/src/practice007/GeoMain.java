package practice007;

/**
 * Created by ehay@naver.com on 2018-10-19
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class GeoMain {

    public static void main(String[] args) {

        Geo geo1 = new Geo();
        geo1.setLatitude(37.52127220511242);
        geo1.setLongitude(127.0074462890625);

        System.out.printf("위도:%f, 경도:%f\n", geo1.getLatitude(), geo1.getLongitude());

        Geo geo2 = geo1; // 주소 복사
        System.out.printf("위도:%f, 경도:%f\n", geo2.getLatitude(), geo2.getLongitude());
    }
}
