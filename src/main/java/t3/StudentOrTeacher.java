package t3;

import java.util.Objects;
import java.util.Scanner;

/**
 * Project name(项目名称)：练习_类与接口
 * Package(包名): t3
 * Class(类名): StudentOrTeacher
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/13
 * Time(创建时间)： 13:15
 * Version(版本): 1.0
 * Description(描述)：
 * 定义一个Introduce接口，包括一个introduction()方法，输出格式见测试样例。
 * 定义一个Student类和一个Teacher类实现Introduce接口。
 * 评测说明
 * 平台将自动编译补全后的代码，并生成若干组测试数据，接着根据程序的输出判断程序是否正确。
 * 测试输入：
 * 学生
 * 预期输出：
 * 我是一名学生！
 */

/********** Begin *********/
interface Introduce
{
    public void introduction();
}

class Student implements Introduce
{

    @Override
    public void introduction()
    {
        System.out.println("我是一名学生！");
    }
}

class Teacher implements Introduce
{

    @Override
    public void introduction()
    {
        System.out.println("我是一名老师！");
    }
}

/********** End *********/

public class StudentOrTeacher
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        if (Objects.equals(string, "学生"))
        {
            Student student = new Student();
            student.introduction();
        }
        else if (Objects.equals(string, "老师"))
        {
            Teacher teacher = new Teacher();
            teacher.introduction();
        }
    }
}



