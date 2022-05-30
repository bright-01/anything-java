package spring.anythingjava.javaBasic;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {

//        'CD1200169296-MOBILE-HD,CD1200169296-MOBILE-LD,CD1200169296-MOBILE-SD,CD1200169296-MOBILE-FHD'
        ArrayList<String> cidList = new ArrayList<>();
//        new String[]{"CD1200169296-MOBILE-HD", "CD1200169296-MOBILE-LD", "CD1200169296-MOBILE-SD", "CD1200169296-MOBILE-FHD" };
        cidList.add("1234");
        cidList.add("1234");
        cidList.add("1234");
        cidList.add("1234");

        String cids = cidList.stream().collect(Collectors.joining(",", "'", "'"));
        System.out.println("cids = " + cids);





    }
}
