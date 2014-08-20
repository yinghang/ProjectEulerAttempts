public class EulerQuestionOne{
    public static final int TARGET = 999;
    
    public static int sumOf(int value){
        int p = TARGET / value;
        return value * (p * (p+1))/ 2;
    }
    
    public static void main(String[] args) {
        System.out.println(sumOf(3)+sumOf(5)-sumOf(15));
    }
}