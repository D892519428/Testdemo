public class Testdemo {


    private int sum(int a, int b) {
        int res=a + b;
         return res;
    }
    private double mul(double a, double b) {
        double resml=a * b;
        return resml;
    }

    public static void main(String[] args) {
        Testdemo testdemo = new Testdemo();
        int sum = testdemo.sum(5, 6);
        double mul = testdemo.mul(4, 7);
        System.out.println("加法结果:"+sum);
        System.out.println("乘法结果:"+mul);

    }

}
