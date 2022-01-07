//Java与unicode编码
public class Gess {
    public static void main(String[] args) {
        char word1='d',word2='@';
        int p1=23045,p2=45213;
        System.out.println("d在unicode表中的顺序位置是："+(int)word1);
        System.out.println("@在unicode表中的顺序位置是："+(int)word2);
        System.out.println("unicode表中第23045位的是："+(char)p1);
        System.out.println("unicode表中第45213位的是："+(char)p2);
    }
}
