import java.util.*;

public class Calculator {
    public  double calculator(String shuRu) {
        String shuZi1[] = shuRu.split("[-+*/]");
        String yunSuanFu[] = shuRu.split("[.1234657890]");
        double shuZi[] = new double[shuZi1.length];
        for (int i = 0; i < shuZi1.length; i++) {
            shuZi[i] = Double.parseDouble(shuZi1[i]);
        }
        ArrayList<String> yunSuanFuList = new ArrayList<>();
        ArrayList<Double> shuZiList = new ArrayList<>();
        for (String i : yunSuanFu) {
            yunSuanFuList.add(i);
        }
        for (int i = 0; i < shuZi.length; i++) {
            shuZiList.add(shuZi[i]);
        }
        StartBasicOperation startBasicOperation=new StartBasicOperation();
        return startBasicOperation.basicOperation(yunSuanFuList,shuZiList);
    }
}

