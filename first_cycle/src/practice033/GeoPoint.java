package practice033;

/**
 * Created by ehay@naver.com on 2018-11-07
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class GeoPoint {

    public static void main(String[] args) {
        double latitude1 = 37.52127220511242;
        double longitude1 = 127.0074462890625; // 서울
        double latitude2 = 35.137879119634185;
        double longitude2 = 129.04541015625; // 부산

        Geo geo1 = new Geo();
        geo1.latitude = latitude1;
        geo1.longitude = longitude1;
        System.out.println(geo1.latitude + "\t" + geo1.longitude);
        Geo geo2 = new Geo();
        geo2.latitude = latitude2;
        geo2.longitude = longitude2;
        System.out.println(geo2.latitude + "\t" + geo2.longitude);
    }
}
