package t1;

import java.util.Scanner;

/**
 * Project name(项目名称)：练习_类与接口
 * Package(包名): t1
 * Class(类名): YardBuilding
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/13
 * Time(创建时间)： 13:02
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class YardBuilding
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        Yard yard = new Yard(length, width);
        System.out.print(String.valueOf(yard.getPerimeter()) + ' ' + String.valueOf(yard.getAcreage()));
    }
}
