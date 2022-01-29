import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

/**
 * 模仿微信零钱通的项目
 */
public class SmallChangeSystem {
    public static void main(String[] args) {

        //是否循环显示
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        //零钱通明细
        String details = "---------零钱通明细---------";

        //收益入账
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");    //日期格式化

        //消费项目
        String note;


        do {
            System.out.println("---------零钱通菜单---------");
            System.out.println("\t\t\t1 零 钱 通");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消    费");
            System.out.println("\t\t\t4 退    出");

            System.out.println("请选择(1-4):");
            key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额：");
                    money = scanner.nextDouble();
                    //money 的值应该校验(过关斩将方法)
                    if (money <= 0) {
                        System.out.println("收益入账金额需要大于0！");
                        break;
                    }
                    balance += money;
                    //拼接收益入账信息到零钱通明细
                    date = new Date(); //获取当前日期
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.println("消费金额：");
                    money = scanner.nextDouble();
                    //money 的值应该校验
                    if (money <= 0) {
                        System.out.println("消费金额需要大于0！");
                        break;
                    }
                    if (money > balance) {
                        System.out.println("余额不足！您的消费金额应该在 0-" + balance);
                        break;
                    }
                    System.out.println("消费说明：");
                    note = scanner.next();
                    balance -= money;
                    //拼接信息到零钱通明细
                    date = new Date(); //获取当前日期
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
                    String choice;
                    while (true) {
                        System.out.println("你确定要退出吗？y/n");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }
                    //退出循环后，再判断输入的是y or n
                    if (choice.equals("y")) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("输入有误，请重新输入！");
                    break;
            }
        } while (loop);

    }
}
