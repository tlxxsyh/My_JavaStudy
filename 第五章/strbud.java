//字符串生成器
public class strbud {
    public static void main(String[] args) {
        //普通字符串
        String s1="";
        long starTime=System.currentTimeMillis();
        for(int i=0;i<1000;i++)
        {
            s1=s1+i;
        }
        long endTime=System.currentTimeMillis();
        long time=endTime-starTime;
        System.out.println("String消耗时间："+time);
        //字符串生成器
        StringBuilder s2=new StringBuilder("");
        starTime=System.currentTimeMillis();
        for(int i=0;i<1000;i++)
        {
            s2.append(i);
        }
        endTime=System.currentTimeMillis();
        time=endTime-starTime;
        System.out.println("StringBuilder消耗时间："+time);
    }
}
