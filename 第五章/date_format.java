import java.util.Date;

public class date_format {
    public static void main(String[] args) {
        Date date = new Date();
        String year=String.format("%tY",date);
        String month=String.format("%tB",date);
        String day=String.format("%td",date);
        System.out.println("今天是："+year+"年"+month+day);
    }
}
