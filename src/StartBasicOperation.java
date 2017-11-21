import java.util.ArrayList;

public class StartBasicOperation {
    public double basicOperation(ArrayList<String> yunSuanList, ArrayList<Double> shuZiList1) {
        try {
            yunSuanList.remove(0);
            int b=-1;
            while (yunSuanList.contains("")){
                b++;
                if (yunSuanList.get(b).equals("")){
                    yunSuanList.remove(b);
                    b--;
                }
            }
            int i = -1;
            while (yunSuanList.contains("*") || yunSuanList.contains("/")) {
                i++;
                if (yunSuanList.get(i).equals("*") || yunSuanList.get(i).equals("/")) {
                    if (yunSuanList.get(i).equals("*")) {
                        double a = shuZiList1.get(i) * shuZiList1.get(i + 1);
                        yunSuanList.remove(i);
                        shuZiList1.remove(i);
                        shuZiList1.remove(i);
                        shuZiList1.add(i, a);
                        i--;
                    } else {
                        double a = shuZiList1.get(i) / shuZiList1.get(i + 1);
                        yunSuanList.remove(i);
                        shuZiList1.remove(i);
                        shuZiList1.remove(i);
                        shuZiList1.add(i, a);
                        i--;
                    }
                }
            }
            double answer = shuZiList1.get(0);
            for (int a = 0; a < yunSuanList.size(); a++) {
                switch (yunSuanList.get(a)) {
                    case "+":
                        answer = answer + shuZiList1.get(a + 1);
                        break;
                    case "-":
                        answer = answer - shuZiList1.get(a + 1);
                        break;
                    default:
                        System.out.println("请输入正确的运算符号！");
                }
            }
            return answer;
        } catch (Exception e) {
            System.out.println("你这个加减乘除有毒啊！！！还算什么算啊，还看，看见算出来的答案了么，那是错的，切，让你给我个错表达式，我就给你个错结果");
            return 0;
        }
    }
}

