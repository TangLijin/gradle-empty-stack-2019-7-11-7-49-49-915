package first;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();
        //Mobile mobile = new Mobile("nova", "黑色", "华为");

        //mobile.call("huohuohuo");
        //mobile.call(message);

        //Phone phone = new Phone("nova", "黑色", "华为");
        //phone.call("xixixi");
        //phone.call(message);

        //Android android = new Android("nova", "黑色", "华为");
        //android.call("hahaha");12
        //android.call(message);

        //Mobile mobile = new Android("nova", "黑色", "华为");
        Android mobile = new Android("nova", "黑色", "华为");
        System.out.println("打印手机信息：");
        System.out.println("name:" + mobile.getName() + ",color" + mobile.getColor() + ",brand" + mobile.getBrand());

        Person p = new Person("张三",mobile);
        p.makeCall(mobile,message);
    }
}
