//展示字符串split分割：
//分割符必须为字符串类型String，不能是字符类型char
//limit是最大分割段数，从前往后的顺序
public class split {
    public static void main(String[] args) {
       String s="192.168.0.1";
       String[] ss=s.split("\\.",2);
       for(String a:ss)
       {
           System.out.print("["+a+"]");
       }
    }
}
