public class KuoHao {
    public double kuoHao(String shuRu) throws Exception {
        Calculator calculator=new Calculator();
        int leftIndix=shuRu.lastIndexOf('(');
        if (leftIndix==-1) {
            return calculator.calculator(shuRu);
        }else {
            int rightIdex=shuRu.indexOf(')',leftIndix);
            if (rightIdex==-1){
                throw new Exception("你这括号后面没收尾的啊");
            }else {
                String biaoDaShi=shuRu.substring(leftIndix+1,rightIdex);
                double result=calculator.calculator(biaoDaShi);
                String anwser=Double.toString(result);
                shuRu=shuRu.substring(0,leftIndix)+anwser+shuRu.substring(rightIdex+1,shuRu.length());
                return kuoHao(shuRu);
            }
        }

    }
}
