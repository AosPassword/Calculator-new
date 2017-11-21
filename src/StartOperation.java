import java.util.Scanner;
public class StartOperation {
    public static void main(String[] args) throws Exception {
        Scanner it=new Scanner(System.in);
        String  shuRuCunChu=it.next();
        KuoHao kuoHao=new KuoHao();
        double answer = kuoHao.kuoHao(shuRuCunChu);
        System.out.println("答案是："+answer);
    }
}
