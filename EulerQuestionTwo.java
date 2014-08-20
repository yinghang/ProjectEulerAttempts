public class EulerQuestionTwo{
    public static final double TARGET = 33;
    
    public static double fibNum(int value){
        double a = ((Math.pow((1+Math.sqrt(5)),value))-(Math.pow((1-Math.sqrt(5)),value)));
        double b = (Math.pow(2,value))*(Math.sqrt(5));
        return a/b;
    }
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 3; i <= TARGET; i+=3){
            sum += fibNum(i);
        }
        System.out.println(sum);
    }
}